package covid.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInit extends AbstractAnnotationConfigDispatcherServletInitializer{
	@Override
	protected String[] getServletMappings() {
		System.out.println("Servlet Mappings");
		String[] arr= {"/"};
		return arr;
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses(){
		System.out.println("Root config classes");
		Class<?>[] arr= {RootConfig.class};
		return arr;
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses(){
		System.out.println("Web Config classes");
		Class<?>[] arr= {WebConfig.class};
		return arr;
	}
}
