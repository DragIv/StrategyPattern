package Comics.States;

import Comics.Interfaces.abilityToFly;

public class haveATF implements abilityToFly{
    @Override
    public void fly() {
        System.out.println("I flew");
    }
}
