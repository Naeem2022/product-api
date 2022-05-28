package in.ashokit.config;

import java.nio.channels.Selector;

import org.springframework.context.annotation.Configuration;

import io.swagger.models.Path;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	public Docket showDoc() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("in.ashokit.rest"))
				.paths(PathSelectors.any())
				.build();
				
	
				
				
	}

}
