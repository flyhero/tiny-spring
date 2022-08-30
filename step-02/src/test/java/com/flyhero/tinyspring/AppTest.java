package com.flyhero.tinyspring;

import com.flyhero.tinyspring.beans.BeanDefinition;
import com.flyhero.tinyspring.beans.BeanFactory;
import org.junit.Test;


public class AppTest 
{
    @Test
    public void testBeanFactory()
    {
        //1.构建一个bean工厂
        BeanFactory beanFactory = new BeanFactory();

        //2.创建BeanDefinition
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);

        //3.向bean工厂注册 BeanDefinition
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        //4.通过bean工厂获取 UserService
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.save();
    }
}
