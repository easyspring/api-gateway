package com.netease;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.netease.filters.AccessFilter;

/*
 * @SpringCloudApplication 整合了@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreake配置
 * */

@EnableZuulProxy
@SpringCloudApplication
public class ZuulApplication 
{
    public static void main( String[] args )
    {
        new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
    }
    
    @Bean
    public AccessFilter accessFilter(){
    	return new AccessFilter();
    }
}
