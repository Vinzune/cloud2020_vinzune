package com.vinzune.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义Rule
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule getRule(){
        return  new RandomRule();
    }
}
