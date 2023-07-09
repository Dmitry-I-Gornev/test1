package test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.config.ConfigApp;

public class Main {



    public static void main(String[] args) {
        ConfigApp configApp = new ConfigApp();
        System.out.println(configApp.getFirstName());
        System.out.println(configApp.getSecondName());

    }

}
