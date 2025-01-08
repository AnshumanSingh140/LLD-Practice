package Entity;

public class RealQuack implements QuackingBehaviour{
    @Override
    public void quack() {
        System.out.println("Quacking my heart out like a real duck");
    }
}
