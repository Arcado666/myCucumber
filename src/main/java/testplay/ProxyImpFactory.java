package testplay;

import java.lang.reflect.Proxy;

public class ProxyImpFactory{
    
    @SuppressWarnings("unchecked")
    public static <T> T newInstance(Class<T> methodInterface) {
        final ProxyImp<T> proxyImp = new ProxyImp<T>(methodInterface);
        return (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                new Class[]{methodInterface},
                proxyImp);
    }
 
     
}
