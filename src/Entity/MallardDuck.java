package Entity;

public class MallardDuck extends Duck {
    // it has all thye intsances of flying and quaking behaviour
    public MallardDuck(QuackingBehaviour quackingBehaviour,FlyingBehavior flyingBehavior){
        this.quackingBehaviour=quackingBehaviour;
        this.flyingBehavior=flyingBehavior;
    }
}
