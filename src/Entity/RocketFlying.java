package Entity;

public class RocketFlying implements FlyingBehavior{
    @Override
    public void fly() {
        System.out.println("Flying with rocket");
    }
}
