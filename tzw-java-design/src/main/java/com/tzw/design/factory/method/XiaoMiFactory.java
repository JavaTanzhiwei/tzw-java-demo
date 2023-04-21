package com.tzw.design.factory.method;

import com.tzw.design.factory.simple.Phone;
import com.tzw.design.factory.simple.XiaoMiPhone;

/**
 * 小米工厂
 *
 * @author: tanzhiwei
 * @date: 2023/4/20  14:56
 */
public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new XiaoMiPhone();
    }
}
