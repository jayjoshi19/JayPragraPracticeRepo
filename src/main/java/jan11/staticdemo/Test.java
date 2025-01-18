package jan11.staticdemo;

public class Test {

    // static method
    public static void show(){  // 2
        System.out.println("Static method called...");
    }

    // static block
    static {  // 1
        System.out.println("Static block called....");
    }

    // instance block
    {  // 3
        System.out.println("Instance block called...");
    }

    // instance method
    public void display(){  // 4
        System.out.println("Instance method called...");
    }
}
