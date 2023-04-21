package com.tzw.design.factory.simple;

/**
 * 简单工厂模式 手机工厂
 *
 * @author: tanzhiwei
 * @date: 2023/4/19  16:52
 */
public class PhoneFactory {
    private static final String XIAO_MI_PHONE = "xiaoMiPhone";
    private static final String APPLE_PHONE = "applePhone";

    /**
     * 根据手机品牌从工厂里生产手机
     *
     * @param phoneType 手机品牌
     */
    public void makePhone(String phoneType) {
        if (APPLE_PHONE.equals(phoneType)) {
            new ApplePhone();
        } else {
            new XiaoMiPhone();
        }
    }

    public static void main(String[] args) {
        // 实例化工厂对象
        PhoneFactory phoneFactory = new PhoneFactory();
        // 简单工厂模式：传入不同品牌手机，就可以得到不同的手机了，不需要关心各自是怎么生产的
        phoneFactory.makePhone(XIAO_MI_PHONE);
        phoneFactory.makePhone(APPLE_PHONE);
    }
}
