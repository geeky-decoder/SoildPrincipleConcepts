
// This class as subtype of interface extended the capability of Parent by overriding the methods that will give desired result
public class Bike implements TwoWheeler {

    private boolean isEngineOn;
    private int speed;

    @Override
    public boolean turnOnEngine() {
        isEngineOn = true;
        return isEngineOn;
    }

    @Override
    public int accelerate() {
        speed = speed + 10;
        return speed;
    }
}
