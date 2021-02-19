package com.dolare.springioc;

import com.dolare.springioc.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringiocApplication {

    public static void main(String[] args) {
        // SpringApplication.run(SpringiocApplication.class, args);
        // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringiocApplication.class);

        // bean userservice1 has user instance, spring created
        UserService userService1 = context.getBean("userService", UserService.class);
        // regular userservice2 doesn't have user
        UserService userService2 = new UserService();

        userService1.selectById();

    }

}
