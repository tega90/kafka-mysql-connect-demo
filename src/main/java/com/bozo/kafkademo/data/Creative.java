package com.bozo.kafkademo.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Creative {
    private int id;
    private int userId;
    private int campaignId;
    private double budget;
    private String creativeType;
    private int clicksTotal;
}
