package org.aidan.module.impl;

import org.aidan.module.CModuleApi;

public class CModuleImpl implements CModuleApi {

    @Override
    public void testC() {
        System.out.println("现在在C模块里面操作testC方法");
    }
}
