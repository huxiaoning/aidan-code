package org.aidan.module.impl;

import org.aidan.module.BModuleApi;

public class BModuleImpl implements BModuleApi {

    @Override
    public void testB() {
        System.out.println("现在在B模块里面操作testB方法");
    }
}
