package br.com.danilo.configuracao;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Value("${app.name}")
	private String nome;
	
	@Value("${app.version}")
	private String versao;
	
	@Value("${app.description}")
	private String descricao;
	
	@Value("${app.organization}")
	private String empresa;	

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("br.com.danilo"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(apiInfo())
				.useDefaultResponseMessages(false);
	}
	
	private ApiInfo apiInfo() {

		return new ApiInfo(
				nome, 
				descricao, 	
				versao, 
				empresa,
				new Contact("Desenvolvimento", "", "contato@dominio.com.br"), 
				"", 
				"", 
				Collections.emptyList());
		
	}
	
	
	
}