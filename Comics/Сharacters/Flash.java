package Comics.Сharacters;

import Comics.States.*;
import Comics.superHero;

public class Flash extends superHero {
    public Flash(){
        abilitytofly = new notHaveATF();
        superpower = new notHaveSP();
        superspeed = new haveSS();
        regeneration = new haveRegen();
    }
    @Override
    public void display() {
        System.out.println("I am the fastest person in the world");
    }

}
