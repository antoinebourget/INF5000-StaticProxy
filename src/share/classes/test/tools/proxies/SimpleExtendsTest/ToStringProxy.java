/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.tools.proxies.SimpleExtendsTest;

/**
 *
 * @author lkj
 */
public class ToStringProxy extends proxy<Subject> {
    private Subject realSubject;
    
    public ToStringProxy(Subject rs) {
        super(rs);
        this.realSubject = rs;
    }
    
    public String toString() {
        return "From proxy : " + realSubject.toString();
    }
}
