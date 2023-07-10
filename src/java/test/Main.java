package test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.beans.config.ConfigApp;
import test.config.SpringConfig;

public class Main {


    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class)){
            ConfigApp configApp = context.getBean(ConfigApp.class);

            System.out.println(configApp.getFirstName());
            System.out.println(configApp.getSecondName());
        }

    }
}
