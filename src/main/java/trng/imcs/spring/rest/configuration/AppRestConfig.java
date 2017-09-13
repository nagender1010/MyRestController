package trng.imcs.spring.rest.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import trng.imcs.spring.mvc.configuration.ApplicationConfig;

@Configuration
@EnableWebMvc
@Import(value= {ApplicationConfig.class, AspectJConfig.class})
public class AppRestConfig {
	
}