/*
 * @test
 * @summary redef
 * @author Alexandre Terrasa
 *
 * @compile RealSubject/RunnableRealSubject.java Main.java
 */

package test.tools.proxies.RedefTest;

import java.io.Serializable;
import test.tools.proxies.RedefTest.RealSubject.RunnableRealSubject;

public class Main extends proxy<java.lang.Runnable> implements java.lang.Runnable {
	
	public static void main(String[] args) {
		
		Main prxy = new Main(new RunnableRealSubject("RedefTest"));
		prxy.run();
		prxy.addedMethod();
	}

	public Main(Runnable realSubject) {
		super(realSubject);
	}
	
	public void run() {
		super.run();
		System.out.println("-> This is a redef <-");
	}
	
	public void addedMethod() {
		System.out.println("added");
	}
	
}
