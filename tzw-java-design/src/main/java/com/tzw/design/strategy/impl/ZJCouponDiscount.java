package com.tzw.design.strategy.impl;

import com.tzw.design.strategy.service.CouponDiscount;

import java.math.BigDecimal;

/**
 * 直减
 *
 * @author: tanzhiwei
 * @date: 2023/4/21  16:28
 */
public class ZJCouponDiscount implements CouponDiscount<Double> {

    /**
     * 直减计算
     * 1. 使用商品价格减去优惠价格
     * 2. 最低支付金额1元
     */
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        BigDecimal discountAmount = skuPrice.subtract(new BigDecimal(couponInfo));
        if (discountAmount.compareTo(BigDecimal.ZERO) < 1) {
            return BigDecimal.ONE;
        }
        return discountAmount;
    }
}
