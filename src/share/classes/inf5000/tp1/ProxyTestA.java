/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inf5000.tp1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lkj
 */
public class ProxyTestA {

    private String string1;

    public String returnTest() {
        return "test3";
    }

    public static void main(String[] args) throws ClassCastException {


        proxy<A, B> ab = new proxy<A, B>(new A() {

            String test = "test";

            public void methodA() {
                System.out.println(test);
            }

            public void methodB(String x) {
                System.out.println(x);
            }
        });
        proxy<Runnable> test3;
        //test3 = ab;
        proxy<B, Runnable, Readable, A> test2;
        ab.methodB("test2");

    }
}
