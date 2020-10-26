package com.demo.lego.Config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @version 1.0
 * @Author Ethan
 * @Date 2020/10/25 22:02 Create
 */
@Configuration //标注在类上，相当于把该类作为spring的xml配置文件中的<beans>，作用为：配置spring容器(应用上下文)
public class eatConfig {
    @Value("${eat}")
    public String eat; //配置文件从properties文件中获取，并赋值
}
