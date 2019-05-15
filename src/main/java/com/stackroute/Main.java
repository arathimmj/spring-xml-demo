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

        Movie movies;

        ApplicationContext context=
                new ClassPathXmlApplicationContext("beans.xml");

        System.out.println("Using autowired name");
        Movie movie = (Movie) context.getBean("movie1");
        System.out.println("Actor Name:\t"+movie.getActor().getActorName()+"\nActor Gender:\t"+movie.getActor().getActorGender()+"\nActor Age:\t"+movie.getActor().getActorAge()+"\n");
        System.out.println();

        System.out.println("Using autowired constructor");
        Movie movie2 = (Movie) context.getBean("movie2");
        System.out.println("Actor Name:\t"+movie2.getActor().getActorName()+"\nActor Gender:\t"+movie2.getActor().getActorGender()+"\nActor Age:\t"+movie2.getActor().getActorAge()+"\n");
        System.out.println();

        /*System.out.println("Using autowired type");
        Movie movie3 = (Movie) context.getBean("movie3");
        System.out.println("Actor Name:\t"+movie3.getActor().getActorName()+"\nActor Gender:\t"+movie3.getActor().getActorGender()+"\nActor Age:\t"+movie3.getActor().getActorAge()+"\n");
*/
    }

}
