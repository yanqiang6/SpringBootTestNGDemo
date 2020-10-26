package com.demo.lego.ServiceImpl;

import com.demo.lego.Config.eatConfig;
import com.demo.lego.Service.estService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @version 1.0
 * @Author Ethan
 * @Date 2020/10/25 22:07 Create
 * 接口的实现类
 */
@Component //此注解不可缺少，引用配置文件注入到实体类中
public class eatServiceImpl implements estService {
    @Autowired //注入此类，相当于引用
    public eatConfig config;
    @Override //实现接口类
    public String eatService() {
        System.out.println("我最爱吃的食物是"+config.eat);
        return config.eat;
    }
}
