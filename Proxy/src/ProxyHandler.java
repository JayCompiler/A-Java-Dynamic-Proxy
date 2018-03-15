import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * Warping the object which is proxied.
 * @author zy
 *
 */
public class ProxyHandler implements InvocationHandler{
	private Object object;

	public ProxyHandler(Object object) {
		super();
		this.object = object;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("I'm Proxy ,hahaha!");
		method.invoke(object, args);
		return null;
	}
}
