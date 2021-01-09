package patterns.strategy.quack;

public class Quack implements QuarkBehavior{
    @Override
    public void quark() {
        System.out.println("Quack");
    }
}
