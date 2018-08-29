package org.aidan.facade;

import org.aidan.module.AModuleApi;
import org.aidan.module.BModuleApi;
import org.aidan.module.CModuleApi;
import org.aidan.module.impl.AModuleImpl;
import org.aidan.module.impl.BModuleImpl;
import org.aidan.module.impl.CModuleImpl;

public class Facade {


    /**
     * 示例方法，满足客户端需要的功能
     */
    public void test() {
        AModuleApi a = new AModuleImpl();
        a.testA();
        BModuleApi b = new BModuleImpl();
        b.testB();
        CModuleApi c = new CModuleImpl();
        c.testC();
    }
}
