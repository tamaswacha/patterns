package patterns.Strategy;

import patterns.Strategy.fly.FlyNoWay;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.performFly();
        duck.performQuark();
        duck.setFlyBehavior(new FlyNoWay());
        duck.performFly();
    }
}
