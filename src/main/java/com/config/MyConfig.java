package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.interceptors.*;

@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /*
            /index: 只拦截index
			/page/*: 只拦截page路径下的所有
			/*: 只拦截 / 路径下的所有
			/**: 拦截全部
         */
        // 加拦截
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/*");

        registry.addInterceptor(new TokenInterceptors()).addPathPatterns("/*");
    }
}
