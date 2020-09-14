package covid.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

//import shop.converter.CharToString;
//import shop.converter.StringToChar;
//import shop.formatter.PhoneNumberFormatter;
@EnableWebMvc
@Configuration
@ComponentScan(basePackages= {"covid.contact","covid.service","covid.repository"})
//@PropertySources({
	//@PropertySource("classpath:mail.properties")
//})
public class WebConfig implements WebMvcConfigurer {

	@Autowired
	private Environment env;
	
	@Bean
	InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/pages/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tc= new TilesConfigurer();
		tc.setDefinitions(new String[]{"/WEB-INF/layouts/tiles.xml"});
		tc.setCheckRefresh(true);
		return tc;
	}
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		System.out.println("Resource Handlers");
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		
		TilesViewResolver viewResolver=new TilesViewResolver();
		registry.viewResolver(viewResolver);
	}
	
	@Override
	public void addFormatters(FormatterRegistry registry) {
		
		
	}
	
}
