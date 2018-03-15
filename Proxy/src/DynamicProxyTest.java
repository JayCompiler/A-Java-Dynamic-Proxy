import java.lang.reflect.Proxy;

/**
 * This is a simple example of Dynamic Proxy!
 * The proxy object is PrintWord(pw) which implements the Print.
 * 1) We design a invocation handler(ProxyHandler) to save the wrapped object.
 * 2) Using the Proxy.newProxyInstance to generate the dynamic proxy object.
 * @author zy
 *
 */
public class DynamicProxyTest {
	public static void main(String [] args) {
		PrintWord pw=new PrintWord();
		ProxyHandler pHandler=new ProxyHandler(pw);
		Print proxy=(Print)Proxy.newProxyInstance(pw.getClass().getClassLoader(), pw.getClass().getInterfaces(), pHandler);
		proxy.print();
	}
}
