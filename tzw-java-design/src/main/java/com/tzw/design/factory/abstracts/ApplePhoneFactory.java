package com.tzw.design.factory.abstracts;

import com.tzw.design.factory.simple.ApplePhone;
import com.tzw.design.factory.simple.Phone;

/**
 * 苹果工厂
 *
 * @author: tanzhiwei
 * @date: 2023/4/20  14:57
 */
public class ApplePhoneFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new ApplePhone();
    }

    @Override
    public Pc makePc() {
        return new ApplePc();
    }

    public static void main(String[] args) {
        AbstractFactory applePhoneFactory = new ApplePhoneFactory();
        applePhoneFactory.makePhone();
        applePhoneFactory.makePc();
    }
}
