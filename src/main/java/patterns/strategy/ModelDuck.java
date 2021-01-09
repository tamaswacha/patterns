package patterns.strategy;

import patterns.strategy.fly.FlyWithWings;
import patterns.strategy.quack.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyWithWings();
        quarkBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Iam ModelDuck");
    }
}
