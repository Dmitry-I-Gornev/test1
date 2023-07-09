package test.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//@Configuration
@Data
@PropertySource("classpath:application.properties")
public class ConfigApp {
    @Value("${first.name}")
    String firstName;
    @Value("${second.name}")
    String secondName;

  /*  public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }*/
}
