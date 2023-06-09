package com.tzw.design.strategy.service;

import java.math.BigDecimal;

/**
 * 优惠券折扣计算接口
 *
 * @author: tanzhiwei
 * @date: 2023/4/21  16:28
 */
public interface CouponDiscount<T> {
    /**
     * 优惠券金额计算
     *
     * @param couponInfo 券折扣信息；直减、满减、折扣、N元购
     * @param skuPrice   sku金额
     * @return 优惠后金额
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
