package patterns.Strategy;

import patterns.Strategy.fly.FlyWithWings;
import patterns.Strategy.quack.MuteQuack;

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
