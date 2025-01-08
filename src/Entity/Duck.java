package Entity;

public  abstract class Duck {
        // it has a quaking and flying behavvoir
    FlyingBehavior flyingBehavior;
    QuackingBehaviour quackingBehaviour;

    public void makeFly(){
        flyingBehavior.fly();

    }
    public void doQuack(){
        quackingBehaviour.quack();
    }
    public void swim(){
        System.out.println("A;; duck floats");
    }

    public void setFlyingBehavior(FlyingBehavior flyingBehavior) {
        this.flyingBehavior = flyingBehavior;
    }

    public void setQuackingBehaviour(QuackingBehaviour quackingBehaviour) {
        this.quackingBehaviour = quackingBehaviour;
    }
}
