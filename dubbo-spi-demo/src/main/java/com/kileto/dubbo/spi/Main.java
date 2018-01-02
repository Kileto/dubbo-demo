package com.kileto.dubbo.spi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

/**
 * Created by fanjiyu on 2018/1/2.
 */
public class Main {

    public static void main(String[] args) {
        URL url = new URL("dubbo", "127.0.0.1", 8080);
        ExtensionLoader<Calculator> extensionLoader = ExtensionLoader.getExtensionLoader(Calculator.class);

        // calculator适配类,该类已被wrap
        Calculator calculator  = extensionLoader.getAdaptiveExtension();

        // 1处:默认采用加法
        calculator.calculate(url, 1, 2);

        // 2处:指定采用减法
        url = url.addParameter("calType", "subtraction");
        calculator.calculate(url, 1, 2);

        // 3处:指定采用sum算法
        calculator = extensionLoader.getExtension("sum");
        calculator.calculate(url, 1, 2);
    }
}
