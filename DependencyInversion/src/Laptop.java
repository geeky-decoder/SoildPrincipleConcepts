
// Class should depend on interfaces rather than specifc concrete classes
public class Laptop {

    // These interface variables are capable enough to accept any type of objects belonging to their implementations
    // If we would have used classes as variables here than if any new type of keyboard/mouse would have come,
    // than we would have to change the implementation again
    private final KeyboardInterface keyboardInterface;
    private final MouseInterface mouseInterface;

    public Laptop(KeyboardInterface keyboardInterface, MouseInterface mouseInterface) {
        this.keyboardInterface = keyboardInterface;
        this.mouseInterface = mouseInterface;
    }

    public static void main(String[] agrs) {
        Laptop laptop = new Laptop(new WiredKeyboard(), new WiredMouse());
        laptop.keyboardInterface.typeOfKeyboard();
        laptop.mouseInterface.typeOfMouse();

        Laptop laptop2 = new Laptop(new BluetoothKeyboard(), new BluetoothMouse());
        laptop2.keyboardInterface.typeOfKeyboard();
        laptop2.mouseInterface.typeOfMouse();
    }
}
`