package Comics.Сharacters;

import Comics.States.*;
import Comics.Villain;

public class Thanos extends Villain {
    public Thanos(){
        abilitytofly = new notHaveATF();
        superpower = new haveSP();
        superspeed = new notHaveSS();
        regeneration = new haveRegen();
    }

    @Override
    public void display() {
        System.out.println("I am inevitability");

    }
}
