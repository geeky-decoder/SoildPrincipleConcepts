
// This class as subtype of interface narrowed down the capability of Parent by overriding the methods and not giving the expected result
public class GearCycle implements TwoWheeler {

    private boolean isEngineOn;
    private int speed;

    // this method broke/narrowed down the capability of Parent class/interface
    @Override
    public boolean turnOnEngine() {
        throw new AssertionError("No engine is present");
    }

    @Override
    public int accelerate() {
        speed = speed + 10;
        return speed;
    }
}