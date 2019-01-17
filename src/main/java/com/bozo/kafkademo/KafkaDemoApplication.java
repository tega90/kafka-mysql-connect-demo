package com.bozo.kafkademo;

import com.bozo.kafkademo.data.Campaign;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@SpringBootApplication
public class KafkaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaDemoApplication.class, args);
	}

}

@RestController
class CampaignsResource {

	private final Storage storage;

	CampaignsResource(Storage storage) {
		this.storage = storage;
	}

	@GetMapping(name = "/campaigns")
	Collection<Campaign> getAllCampaigns() {
		return storage.getCampaigns();
	}

}