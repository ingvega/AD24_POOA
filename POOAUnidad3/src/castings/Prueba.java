/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package castings;

/**
 *
 * @author paveg
 */
public class Prueba {

    public static void main(String[] args) {
        //A a=new B();
        //A a=new D();
        //F f=new C();
        //E e=(E)(new B());
//        Object o=new D();
//        A a=(B)(o);
//Object o=new D();
//B b=(B)(o);
//        Object o=new A();
//        C c=(F)(o);
//        Object o=new A();
//        C c=(C)(o);
        B b = (D) (A) (B) (new D());

    }
}

sealed class A {
}

sealed class B extends A {
}

non-sealed class C extends A {
}

non-sealed class D extends B {
}

final class E extends B {
}

class F extends C {
}

class G extends C {
}
