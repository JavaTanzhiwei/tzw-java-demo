package com.tzw.design.factory.abstracts;

import com.tzw.design.factory.simple.Phone;

/**
 * 工厂抽象类
 *
 * @author: tanzhiwei
 * @date: 2023/4/20  14:55
 */
public interface AbstractFactory {
    /**
     * 生产手机
     *
     * @return 结果 {@link Phone}
     */
    Phone makePhone();

    /**
     * 生产PC
     *
     * @return 结果 {@link Pc}
     */
    Pc makePc();
}
