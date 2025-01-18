package jan7.polymorphism.test;

class A {
    int i = 10;
    static {
        System.out.println("inside A");
    }
}

class B extends A {
    int i = 20;
    static {
        System.out.println("inside B");
    }
}

class C extends B{
    int i = 30;
    static {
        System.out.println("inside C");
    }
}

public class MainClass {

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.i);
    }
}
