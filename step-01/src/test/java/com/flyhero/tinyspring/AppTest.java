package com.flyhero.tinyspring;

import com.flyhero.tinyspring.beans.SpringContainer;
import org.junit.Test;


public class AppTest 
{
    @Test
    public void testSpringContainer()
    {
        //1.构建一个Spring容器
        SpringContainer springContainer = new SpringContainer();

        //2.向容器中注册 我们的对象
        springContainer.registerBean("userService", new UserService());

        //3.从容器中获取 UserService
        UserService userService = (UserService) springContainer.getBean("userService");
        userService.save();
    }
}
