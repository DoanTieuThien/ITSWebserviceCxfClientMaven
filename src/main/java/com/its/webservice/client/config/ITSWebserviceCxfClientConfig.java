package com.its.webservice.client.config;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.its.ws.ITSWebServicePortType;

@Configuration
public class ITSWebserviceCxfClientConfig {

	@Value("${com.its.app.webservice-server-url}")
	private String webServiceAddress = "";
	
	@Bean("itsWebServicePortType")
	public ITSWebServicePortType itsWebServicePortType() {
		ITSWebServicePortType portType = null;
		JaxWsProxyFactoryBean jaxWsProxyFactory = new JaxWsProxyFactoryBean();
		jaxWsProxyFactory.setServiceClass(ITSWebServicePortType.class);
		jaxWsProxyFactory.setAddress(webServiceAddress);
		portType = (ITSWebServicePortType) jaxWsProxyFactory.create();
		return portType;
	}
}
