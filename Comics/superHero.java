package Comics;

import Comics.Interfaces.*;

public abstract class superHero {
    public abilityToFly abilitytofly;
    public superPower superpower;
    public superSpeed superspeed;
    public Regeneration regeneration;

    public superHero(){
    }

    public abstract void display();

    public void performFly() {
        abilitytofly.fly();
    }

    public void performHit() {
        superpower.hit();
    }

    public void performSpeed(){
        superspeed.speed();
    }

    public void  performRegeneration(){
        regeneration.regen();
    }
}
