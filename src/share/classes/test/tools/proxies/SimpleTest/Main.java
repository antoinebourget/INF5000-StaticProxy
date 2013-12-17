/*
 * @test
 * @summary simple test
 * @author Alexandre Terrasa
 *
 * @compile Subject.java RealSubject.java Main.java
 */

package test.tools.proxies.SimpleTest;

public class Main {
	
	public static void main(String args[]) {
		Subject prxy = new proxy <Subject>(new RealSubject());
		prxy.service();
	}
}
