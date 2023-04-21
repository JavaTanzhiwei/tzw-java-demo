package com.tzw.design.factory.simple;

/**
 * 生产苹果手机
 *
 * @author: tanzhiwei
 * @date: 2023/4/19  16:51
 */
public class ApplePhone implements Phone {
    public ApplePhone() {
        // 苹果手机生产逻辑
        System.out.println("生产苹果手机");
    }
}

