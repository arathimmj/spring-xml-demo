package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {

    public static void main(String[] args) {

        System.out.println("From Application Context");
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie movie = (Movie) context.getBean("movie");
        System.out.println("Actor Name:\t"+movie.getActor().getActorName()+"\nActor Gender:\t"+movie.getActor().getActorGender()+"\nActor Age:\t"+movie.getActor().getActorAge()+"\n");

        System.out.println("From Bean Factory");
        Resource res = new ClassPathResource("beans.xml");
        BeanFactory factory = new XmlBeanFactory(res);
        Movie movie1 = (Movie) context.getBean("movie");
        System.out.println("Actor Name:\t"+movie1.getActor().getActorName()+"\nActor Gender:\t"+movie1.getActor().getActorGender()+"\nActor Age:\t"+movie1.getActor().getActorAge()+"\n");

        System.out.println("From Bean Definition Reader");
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new FileSystemResource("src/main/resources/beans.xml"));
        Movie movie2 = (Movie) context.getBean("movie");
        System.out.println("Actor Name:\t"+movie2.getActor().getActorName()+"\nActor Gender:\t"+movie2.getActor().getActorGender()+"\nActor Age:\t"+movie2.getActor().getActorAge()+"\n");

    }

}
