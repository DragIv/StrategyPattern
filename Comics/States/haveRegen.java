package Comics.States;

import Comics.Interfaces.Regeneration;

public class haveRegen implements Regeneration {
    @Override
    public void regen() {
        System.out.println("will not you kill me");
    }
}
