package com.flyhero.tinyspring.beans;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * BeanFactory用于存储bean实例，以供任何地方使用时取出
 *
 * @author WangQingFei
 * @date 2022/8/21 22:21
 */
public class BeanFactory {

    // 以bean名称为key, BeanDefinition为value
    private final Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    /**
     * 根据bean名称获取bean实例
     *
     * @param beanName
     * @return
     */
    public Object getBean(String beanName){
        Class<?> beanClass = beanDefinitionMap.get(beanName).getBeanClass();
        try {
            return beanClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 注册 BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition){
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
