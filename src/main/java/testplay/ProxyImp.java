package testplay;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyImp<T> implements InvocationHandler{
    

	@SuppressWarnings("unused")
	private Class<T> proxyMethod;
 
    public ProxyImp(Class<T> proxyMethod) {
        this.proxyMethod = proxyMethod;
    }

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		 String value = PropertiesHandler.getProperty(method.getName());
	        System.out.println(value);
		return null;
	}
 

 
 

 
}
