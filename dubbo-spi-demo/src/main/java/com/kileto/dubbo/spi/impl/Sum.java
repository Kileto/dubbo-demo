package com.kileto.dubbo.spi.impl;

import com.alibaba.dubbo.common.URL;
import com.kileto.dubbo.spi.Calculator;

/**
 * 加法
 */
public class Sum implements Calculator {

    public int calculate(URL url, int a, int b) {
        return a + b;
    }
}
