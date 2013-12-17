package test.tools.proxies.SimpleTest;

public class RealSubject implements Subject {
	public void service() {
		System.out.println("service");
	}
}
