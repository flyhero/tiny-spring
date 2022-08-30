package com.flyhero.tinyspring.beans;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author WangQingFei
 * @date 2022/8/20 22:01
 */
public class SpringContainer {

    /**
     * 存储对象
     */
    private final Map<String, Object> beanMap = new ConcurrentHashMap<>();

    /**
     * 根据bean名称获取bean实例
     *
     * @param beanName
     * @return
     */
    public Object getBean(String beanName){
        return beanMap.get(beanName);
    }

    /**
     * 注册 Bean实例
     * @param beanName
     * @param bean
     */
    public void registerBean(String beanName, Object bean){
        beanMap.put(beanName, bean);
    }
}
