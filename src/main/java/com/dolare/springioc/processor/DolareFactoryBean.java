package com.dolare.springioc.processor;

import com.dolare.springioc.mapper.UserMapper;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

import java.lang.reflect.Proxy;

// singleton is in BeanDefination concurrentMap<beanName, object>, we can setDifferent beanName for same class
// to create multiple instances for same classes.
@Component
public class DolareFactoryBean implements FactoryBean {

    @Override
    public Object getObject()throws BeansException {
        // UserMapper o = (UserMapper) Proxy.newProxyInstance(DolareFactoryBean.class.getClassLoader(), ) {
        return new Object();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
