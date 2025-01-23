package jan21.anonymousinnerclass;

public class RestaurantMain {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant() {
            @Override
            public void cook() {
                System.out.println("Cooking food...");
            }
        };
        restaurant.cook();
    }

}
