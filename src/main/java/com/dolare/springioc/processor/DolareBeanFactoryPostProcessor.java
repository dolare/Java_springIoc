package com.dolare.springioc.processor;

import org.apache.tomcat.jni.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class DolareBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        configurableListableBeanFactory.getBean("xxx");
        GenericBeanDefinition bd = (GenericBeanDefinition)configurableListableBeanFactory.getBeanDefinition("xxx");

        bd.setBeanClass(User.class);


    }
}
