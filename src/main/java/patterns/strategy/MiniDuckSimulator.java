package patterns.strategy;

import patterns.strategy.fly.FlyNoWay;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.performFly();
        duck.performQuark();
        duck.setFlyBehavior(new FlyNoWay());
        duck.performFly();
    }
}
