
// HAS-A Relationship with Smartphone class
// This class has only one reason to change i.e. when something around calculation logic will change else no other reason to change 
public class Invoice {
    
    private Smartphone smartphone;
    private int quantity;

    public Invoice(Smartphone smartphone, int quantity) {
        this.smartphone = smartphone;
        this.quantity = quantity;
    }

    public double calculateTotal() {
        return (smartphone.getPrice() * quantity);
    }
}
