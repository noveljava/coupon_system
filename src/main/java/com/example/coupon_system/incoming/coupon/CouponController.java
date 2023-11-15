package com.example.cupong_system.coupon;

import com.example.cupong_system.coupon.dto.Coupon;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin/coupont")
public class CouponController {
    @GetMapping("/login")
    public String login() {
        return "login page";
    }

    @GetMapping("")
    public String index() {
        return "index page";
    }

    @GetMapping("/{coupon_id}")
    public String test(@PathVariable String coupon_id) {
        System.out.println("coupon_id: " + coupon_id);
        return "coupon/test";
    }

    @PostMapping("")
    public void create(@RequestBody Coupon coupon) {
        System.out.println(coupon.getCoupon_id());
    }

    @PutMapping("/{coupon_id}")
    public void update(@PathVariable String coupon_id, @RequestBody Coupon coupon) {
        System.out.println(coupon_id);
        System.out.println(coupon.getCoupon_id());
    }


    @DeleteMapping("/{coupon_id}")
    public void delete(@PathVariable String coupon_id) {
        System.out.println(coupon_id);
    }
}
