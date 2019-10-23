package com.interceptors;

import org.springframework.context.ApplicationContext;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.context.support.WebApplicationContextUtils;
import  com.service.*;
import com.entity.*;
import java.util.*;

// 基本拦截器
public class BaseInterceptor {

    protected Object getBean(ServletContext ctx, String beanName){
         ApplicationContext ac = WebApplicationContextUtils.getRequiredWebApplicationContext(ctx);
         Object obj = ac.getBean(beanName);

         return obj;
    }
}
