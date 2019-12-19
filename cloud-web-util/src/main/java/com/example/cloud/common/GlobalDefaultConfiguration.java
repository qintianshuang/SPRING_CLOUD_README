package com.example.cloud.web.common;

import com.example.cloud.web.common.advice.CommonResponseDataAdvice;
import com.example.cloud.web.common.exception.GlobalDefaultExceptionHandler;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author purgeyao
 * @since 1.0
 */
@Configuration
@EnableConfigurationProperties(GlobalDefaultProperties.class)
@PropertySource(value = "classpath:dispose.properties", encoding = "UTF-8")
public class GlobalDefaultConfiguration {

  @Bean
  public GlobalDefaultExceptionHandler globalDefaultExceptionHandler() {
    return new GlobalDefaultExceptionHandler();
  }

  @Bean
  public CommonResponseDataAdvice commonResponseDataAdvice(GlobalDefaultProperties globalDefaultProperties){
    return new CommonResponseDataAdvice(globalDefaultProperties);
  }

}
