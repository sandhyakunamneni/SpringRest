package com.se.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		Class[] classes= {ApplicationConfigurer.class};
		return classes;
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		String mappings[]= {"/"};
		return mappings;
	}

}
