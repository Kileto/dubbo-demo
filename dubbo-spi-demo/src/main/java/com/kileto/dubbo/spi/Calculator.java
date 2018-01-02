package com.kileto.dubbo.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

/**
 * 计算器类
 */
@SPI("sum")
public interface Calculator {


    @Adaptive("calType")
    int calculate(URL url, int a, int b);

}
