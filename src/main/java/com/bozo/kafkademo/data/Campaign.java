package com.bozo.kafkademo.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Campaign {
    private long id;
    private long userId;
    private String campaignStatus;
}
