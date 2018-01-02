package com.kileto.dubbo.spi.wrapper;

import com.alibaba.dubbo.common.URL;
import com.kileto.dubbo.spi.Calculator;

/**
 * 打印结果
 */
public class CalculatorWrapper2 implements Calculator {

    private Calculator calculator;

    public CalculatorWrapper2(Calculator calculator) {
        this.calculator = calculator;
    }

    public int calculate(URL url, int a, int b) {
        int result = calculator.calculate(url, a, b);
        System.out.println("wrapper2--打印结果: " + result);
        return result;
    }
}
