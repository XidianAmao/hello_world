package stu.yang.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = { "classpath:META-INF/spring/spring-db.xml"})
public class SpringConfig {
}
