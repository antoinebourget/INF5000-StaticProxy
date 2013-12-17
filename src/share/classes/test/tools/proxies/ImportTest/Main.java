/*
 * @test
 * @summary generic types tests
 * @author Alexandre Terrasa
 *
 * @compile Package/Main.java RealSubject/RunnableRealSubject.java Main.java
 */

package test.tools.proxies.ImportTest;

import test.tools.proxies.ImportTest.RealSubject.RunnableRealSubject;

public class Main {
	public static void main(String[] args) {
		Runnable prxy = new proxy <Runnable>(new RunnableRealSubject("TestImport.TestImport"));
		prxy.run();
	}
}
