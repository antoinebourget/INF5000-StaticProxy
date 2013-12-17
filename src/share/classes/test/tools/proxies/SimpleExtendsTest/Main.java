package test.tools.proxies.SimpleExtendsTest;

public class Main {
	
	public static void main(String args[]) {
            
		Subject prxy = new proxy<Subject>(new RealSubject(10));
		prxy.add();
		prxy.add();
		prxy.add();
		prxy.show();
                System.out.println(prxy.toString());
                prxy = new ToStringProxy(prxy);
                System.out.println(prxy.toString());
                

	}
}
