package com.tzw.design.strategy;

import com.tzw.design.strategy.service.CouponDiscount;

import java.math.BigDecimal;

/**
 * 折扣策略
 *
 * @author: tanzhiwei
 * @date: 2023/4/21  16:31
 */
public class Context<T> {
    private CouponDiscount<T> couponDiscount;

    public Context(CouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
