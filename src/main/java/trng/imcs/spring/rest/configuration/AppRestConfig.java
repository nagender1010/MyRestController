package trng.imcs.spring.rest.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import trng.imcs.spring.mvc.configuration.ApplicationConfig;

@Configuration
@ComponentScan("trng.imcs")
@Import(ApplicationConfig.class)
public class AppRestConfig {
	
}