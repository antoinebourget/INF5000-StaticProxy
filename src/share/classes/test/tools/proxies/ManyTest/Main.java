/*
 * @test
 * @summary many proxies in same file
 * @author Alexandre Terrasa
 *
 * @compile RS/RunnableRealSubject.java RealSubject.java Subject.java Main2.java Main.java
 */
package test.tools.proxies.ManyTest;

import java.io.Serializable;

import test.tools.proxies.ManyTest.RealSubject;
import test.tools.proxies.ManyTest.Subject;
import test.tools.proxies.ManyTest.RS.RunnableRealSubject;
import test.tools.proxies.ManyTest.Main2;

public class Main {

    public static void main(String[] args) {
        Runnable p1 = new proxy <Runnable>(new RunnableRealSubject("main"));
        p1.run();

        Runnable p2 = new proxy <Runnable>(p1);
        p2.run();

        Serializable p3 = new proxy <Serializable>("");
        System.out.println(p3.toString());
        System.out.println(p3.getClass());

        Subject p4 = new proxy <Subject>(new RealSubject());
        System.out.println(p4.doHelloRetArgs("t", "t"));

        p2 = new Main2(p1);
        p2.run();

    }
}
