package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie {

    private Actor actor;
//    ApplicationContext applicationContext = null;
//    BeanFactory beanFactory = null;
//    String beanName = null;


//    public ApplicationContext getApplicationContext() {
//        return applicationContext;
//    }


    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//        Actor actor = (Actor) applicationContext.getBean("actor");
//        System.out.println("Inside Application Context");
//    }
//
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        this.beanFactory = beanFactory;
//        System.out.println("Inside Bean Factory"+this.beanFactory);
//    }
//
//    public void setBeanName(String s) {
//        this.beanName = s;
//        System.out.println("Inside bean name"+this.beanName);
//    }
}
