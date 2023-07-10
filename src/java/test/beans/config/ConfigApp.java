package test.beans.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@Data
@PropertySource("classpath:application.properties")
public class ConfigApp {
    @Value("${first.name}")
    String firstName;
    @Value("${second.name}")
    String secondName;

}
