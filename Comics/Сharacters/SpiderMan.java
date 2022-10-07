package Comics.Сharacters;

import Comics.States.*;
import Comics.superHero;

public class SpiderMan extends superHero {
    public SpiderMan(){
        abilitytofly = new haveATF();
        superpower = new haveSP();
        superspeed = new notHaveSS();
        regeneration = new notHaveRegen();
    }

    @Override
    public void display() {
        System.out.println("I'm a friendly neighbor spiderman");
    }

}
