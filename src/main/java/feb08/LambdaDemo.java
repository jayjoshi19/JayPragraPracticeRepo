package feb08;


import java.sql.ResultSet;

interface Greeting {
    String greet(String message);
}

public class LambdaDemo {

    public static void main(String[] args) {

        Greeting g = (greet) -> {
            return "Hello, Good Morning!";
        };

    }

}
