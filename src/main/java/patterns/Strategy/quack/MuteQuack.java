package patterns.Strategy.quack;

public class MuteQuack implements QuarkBehavior{
    @Override
    public void quark() {
        System.out.println("Silence");
    }
}
