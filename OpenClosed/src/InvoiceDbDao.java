
// functionality extended by implementing the interface and followed Open/Closed Principle
public class InvoiceDbDao implements SmartphoneInvoiceDao {

    @Override
    public void save(Smartphone smartphone) {
        // save invoice to DB
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
}
