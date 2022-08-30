package com.flyhero.tinyspring.beans;

/**
 * BeanDefinition 是对 bean 实例的一种描述。
 * 为什么要封装bean实例？
 * 为了以后的扩展，为了更好的性能/更多的功能，这里将会描述出bean实例的构造函数，属性有哪些，是原型还是单例，是否懒加载等
 *
 * @author WangQingFei
 * @date 2022/8/21 22:20
 */
public class BeanDefinition {

    /**
     * 交给容器管理的类型
     */
    private Class<?> beanClass;

    public Class<?> getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class<?> beanClass) {
        this.beanClass = beanClass;
    }

    public BeanDefinition(Class<?> beanClass) {
        this.beanClass = beanClass;
    }
}
