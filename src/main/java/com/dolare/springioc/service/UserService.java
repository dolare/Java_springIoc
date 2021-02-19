package com.dolare.springioc.service;

import com.dolare.springioc.entity.User;
import com.dolare.springioc.mapper.UserMapper;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// bean
// life cycle:  class --> BeanDefination -> BeanFactoryPostProcessor -> new UserSrevice() -> populate properties ->
//                  Aware -> initialization -> (AOP) -> singleton pool(Map<BeanName, object>)
// BeanDefination: beanClass, Scope, beanName, beanConstructor,
// BeanFactoryPostProcessor
@Component
@Scope("prototype")
public class UserService implements BeanNameAware, InitializingBean { // aware is call back machanism

    @Autowired
    User user = new User();

    @Autowired
    private UserMapper userMapper; // agent bean object from mybatis or hebinate and put it in the beanfactory

    private String beanName;

    public void selectById() {
        userMapper.selectById();
    }
    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // initialization code
    }
}
