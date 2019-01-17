package com.bozo.kafkademo.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Advertiser {
    private int id;
    private String type;
    private String status;
    private int companyId;
}
