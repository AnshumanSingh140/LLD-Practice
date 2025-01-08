package Entity;

public class FlyWithWings implements FlyingBehavior{
    @Override
    public void fly() {
        System.out.println("Flying with wing sin the sky");
    }
}
