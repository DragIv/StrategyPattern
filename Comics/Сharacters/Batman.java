package Comics.Сharacters;

import Comics.States.*;
import Comics.superHero;

public class Batman extends superHero {
    public Batman(){
        abilitytofly = new notHaveATF();
        superpower = new notHaveSP();
        superspeed = new notHaveSS();
        regeneration = new notHaveRegen();
    }

    @Override
    public void display() {
        System.out.println("I'm Batman!");
    }
}
