/*
 * @test
 * @summary chained proxies
 * @author Alexandre Terrasa
 *
 * @compile Main.java
 */
package test.tools.proxies.MultiTest;

import java.io.Serializable;

public class Main {

    public static void main(String[] args) {
        //FIX THIS
        String s = "asdf";
        System.out.println(s.hashCode());
        Serializable prxy = new proxy<Serializable>(new proxy<Serializable>(s));
        System.out.println(prxy.hashCode());
    }
}
