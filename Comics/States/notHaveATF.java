package Comics.States;

import Comics.Interfaces.abilityToFly;

public class notHaveATF implements abilityToFly {
    @Override
    public void fly() {
        System.out.println("I'd rather walk on earth");
    }
}
