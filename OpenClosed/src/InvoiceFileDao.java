
// functionality extended by implementing the interface and followed Open/Closed Principle
public class InvoiceFileDao implements SmartphoneInvoiceDao {

    @Override
    public void save(Smartphone smartphone) {
        // save invoice to file with some filename
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }
}
