
// This class has only one reason to change i.e. when something around saving to DB logic will change else no other reason to change 
public class InvoiceDao {

    private Smartphone smartphone;

    public InvoiceDao(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    public void save() {
        // logic for saving into DB
    }
}