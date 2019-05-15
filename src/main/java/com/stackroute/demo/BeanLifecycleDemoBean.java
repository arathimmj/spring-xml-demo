package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    public void afterPropertiesSet() throws Exception {
        System.out.println("after property set");
    }

    public void destroy() throws Exception {
        System.out.println("destroying");
    }
    public void customInit(){
        System.out.println("customized init method");
    }
    public void customDestroy() {
        System.out.println("customized destroy method");
    }

}
