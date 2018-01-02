package com.kileto.dubbo.spi.wrapper;

import com.alibaba.dubbo.common.URL;
import com.kileto.dubbo.spi.Calculator;

/**
 * 打印入参
 */
public class CalculatorWrapper1 implements Calculator {

    private Calculator calculator;

    public CalculatorWrapper1(Calculator calculator) {
        this.calculator = calculator;
    }

    public int calculate(URL url, int a, int b) {
        System.out.println("wrapper1--打印入参: a = " + a + ", b = " + b);
        int result = calculator.calculate(url, a, b);
        return result;
    }
}
