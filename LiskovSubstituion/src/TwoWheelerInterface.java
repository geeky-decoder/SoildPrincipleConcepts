
// This interface should contain generic method so that other subtypes which are implementing this interface should be able to follow the Liskov principle
public interface TwoWheelerInterface {

    // should be removed bcoz every 2-wheeler doesn't have the engine so it can't be turned on
    boolean turnOnEngine();

    int accelerate();
}
