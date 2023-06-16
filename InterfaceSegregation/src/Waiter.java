
// This class was forced to implement the methods which was not needed by this class doe to larger interface and thus violates the principle
public class Waiter implements RestaurantEmployee {

    @Override
    public void washDishes() {
        // not my job
    }

    @Override
    public void cookFood() {
        // not my job
    }

    @Override
    public void serverCustomers() {
        System.out.println("Please tell me what can I bring for you");
    }
}
