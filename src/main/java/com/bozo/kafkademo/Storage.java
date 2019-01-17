package com.bozo.kafkademo;

import com.bozo.kafkademo.data.Campaign;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class Storage {

    private final Map<Long, Campaign> campaigns = new HashMap<>();

    public void putCampaign(Campaign campaign) {
        campaigns.put(campaign.getId(), campaign);
    }

    public Collection<Campaign> getCampaigns() {
        return campaigns.values();
    }

    public void removeCampaign(Long campaignId) {
        campaigns.remove(campaignId);
    }
}
