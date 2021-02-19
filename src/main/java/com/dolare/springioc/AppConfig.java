package com.dolare.springioc;

import com.dolare.springioc.processor.DolareBeanDefinationRegister;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.dolare")
@Import(DolareBeanDefinationRegister.class) //
public class AppConfig {
}
