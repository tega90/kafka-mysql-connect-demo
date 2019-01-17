package com.bozo.kafkademo;

import com.bozo.kafkademo.data.Campaign;
import mysql.trafficvance.campaign.Envelope;
import mysql.trafficvance.campaign.Key;
import mysql.trafficvance.campaign.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import static org.springframework.kafka.support.KafkaHeaders.RECEIVED_MESSAGE_KEY;

@Service
public class KafkaService {

    private final Storage storage;

    public KafkaService(Storage storage) {
        this.storage = storage;
    }

    @KafkaListener(topics = "mysql.trafficvance.campaign", id = "flafka5")
    public void consume(@Payload(required = false) Envelope message,
                        @Header(RECEIVED_MESSAGE_KEY) Key key) {

        System.out.println("Key: " + key + "; " + "Consumed message: " + message);
        if (message == null) {
            return;
        }

        Value value = message.getAfter();
        if (value != null) {
            Campaign campaign = new Campaign(value.getCampaignId(), value.getAdvertiserId(), value.getCampaignStatus().toString());
            storage.putCampaign(campaign);
        } else {
            storage.removeCampaign(key.getCampaignId());
        }
    }
}
