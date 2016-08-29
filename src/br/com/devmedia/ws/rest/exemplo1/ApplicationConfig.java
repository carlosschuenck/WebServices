package br.com.devmedia.ws.rest.exemplo1;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("webservice")//Seta o path da aplicação
public class ApplicationConfig extends Application{
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resources = new HashSet<>();
	    addRestResourceClasses(resources);
		return super.getClasses();
	}
	
	private void addRestResourceClasses(Set<Class<?>> resources){
		resources.add(WebServiceREST.class);
		resources.add(CEPRestWS.class);
	}
}
