package test.tools.proxies.ImportTest.Package;

import test.tools.proxies.ImportTest.RealSubject.RunnableRealSubject;

public class Main {
	public static void main(String[] args) {
		Runnable prxy = new proxy <Runnable>(new RunnableRealSubject("TestImport2"));
		prxy.run();
	}
}
