package patterns.strategy.quack;

public class MuteQuack implements QuarkBehavior{
    @Override
    public void quark() {
        System.out.println("Silence");
    }
}
