package com.example.cupong_system.coupon.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Coupon {
    String coupon_id;
    String title;
    String description;

    Date coupon_start_date;
    Date coupon_end_date;
}
