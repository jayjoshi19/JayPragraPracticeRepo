package jan11.finaldemo;

public class TestFinal {

    int x = 10;

    final int y = 5;

    public void show(){
        x = 20;
        // y = 11; // this gives compilation error - cannot reassign the value, as the variable is final
        System.out.println(x);
        System.out.println(y);
    }
}

class A {
    int y = 10;
    void show(){
        System.out.println(y);
    }
}

class B extends A {

    int y = 20;
    void change(){
        System.out.println("Before update y = "+y);
        super.y = 1;
        y = super.y;

        System.out.println("After update y = "+y);
    }

}
