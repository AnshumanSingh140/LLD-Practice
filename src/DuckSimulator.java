import Entity.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard= new MallardDuck(new RealQuack(),new FlyWithWings());
        mallard.makeFly();
        mallard.doQuack();
        // let's say our mallard decides ro fly with rocket in simulation
        mallard.setFlyingBehavior(new RocketFlying());
        mallard.makeFly();

    }

}