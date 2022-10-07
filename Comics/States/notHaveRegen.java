package Comics.States;

import Comics.Interfaces.Regeneration;

public class notHaveRegen implements Regeneration {
    @Override
    public void regen() {
        System.out.println("Be careful or I might die");
    }
}
