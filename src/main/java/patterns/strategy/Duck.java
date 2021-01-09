package patterns.strategy;

import patterns.strategy.fly.FlyBehavior;
import patterns.strategy.quack.QuarkBehavior;

public abstract class Duck {
     FlyBehavior flyBehavior;
     QuarkBehavior quarkBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();

    }

    public void performQuark() {
        quarkBehavior.quark();

    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuarkBehavior(QuarkBehavior quarkBehavior) {
        this.quarkBehavior = quarkBehavior;
    }
}
