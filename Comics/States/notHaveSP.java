package Comics.States;

import Comics.Interfaces.superPower;

public class notHaveSP implements superPower {
    @Override
    public void hit() {
        System.out.println("I have a weak stroke");
    }
}
