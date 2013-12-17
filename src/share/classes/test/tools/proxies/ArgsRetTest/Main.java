/*
 * @test
 * @summary tests args and return on primitive proxies
 * @author Alexandre Terrasa
 *
 * @compile RealSubject.java Subject.java Main.java
 */

package test.tools.proxies.ArgsRetTest;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject rs = new RealSubject();
		Subject prxy = new proxy <Subject>(rs);
		prxy.doHello();
		prxy.doHelloArgs("Alex", "Toto");
		System.out.println(prxy.doHelloRet());
		System.out.println(prxy.doHelloRetArgs("Alex", "Toto"));
	}
}
