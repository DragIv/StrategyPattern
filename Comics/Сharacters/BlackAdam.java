package Comics.Сharacters;

import Comics.States.*;
import Comics.Villain;

public class BlackAdam extends Villain {

    public BlackAdam(){
        abilitytofly = new haveATF();
        superpower = new haveSP();
        superspeed = new haveSS();
        regeneration = new haveRegen();
    }

    @Override
    public void display() {
        System.out.println("I am the god of lightning");
    }
}
