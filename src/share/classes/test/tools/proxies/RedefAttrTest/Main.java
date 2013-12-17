/*
 * @test
 * @summary redef attributes
 * @author Alexandre Terrasa
 *
 * @compile RealSubject/RunnableRealSubject.java Main.java
 */

package test.tools.proxies.RedefAttrTest;

import java.io.Serializable;
import test.tools.proxies.RedefAttrTest.RealSubject.RunnableRealSubject;

public class Main extends proxy<java.lang.Runnable> implements java.lang.Runnable {
	
	private Integer count;
	private Integer fromStart;
	
	public Runnable realSubject;
	
	public static void main(String[] args) {
		Main prxy = new Main(new RunnableRealSubject("RedefTest"), 10);
		prxy.run();
		prxy.run();
		prxy.run();
		prxy.run();
		
		prxy.showCounter();
	}

	public Main(Runnable realSubject, Integer start) {
		super(realSubject);
		count = 0;
		this.fromStart = start;
	}
	
	public void run() {
		super.run();
		count++;
		System.out.println("-> This is a redef fromStart "+ fromStart +"<-");
	}
	
	public void showCounter() {
		System.out.println("count: " + count);
	}
	
}
