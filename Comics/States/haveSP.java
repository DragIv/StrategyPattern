package Comics.States;

import Comics.Interfaces.superPower;

public class haveSP implements superPower {
    @Override
    public void hit() {
        System.out.println("I can hit hard");
    }
}
