package com.tzw.design.strategy.impl;

import com.tzw.design.strategy.service.CouponDiscount;

import java.math.BigDecimal;

/**
 * n元购买
 *
 * @author: tanzhiwei
 * @date: 2023/4/21  16:28
 */
public class NYGCouponDiscount implements CouponDiscount<Double> {

    /**
     * n元购购买
     * 1. 无论原价多少钱都固定金额购买
     */
    public BigDecimal discountAmount(Double couponInfo, BigDecimal skuPrice) {
        return new BigDecimal(couponInfo);
    }
}
