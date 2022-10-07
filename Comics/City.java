package Comics;

import Comics.Сharacters.*;

import java.util.ArrayList;

public class City {
    public static void main(String[] args) {

        superHero hero1 = new SpiderMan();
        superHero hero2 = new Batman();
        superHero hero3 = new Flash();

        Villain villian1 = new Thanos();
        Villain villian2 = new BlackAdam();


        ArrayList<superHero> heroes = new ArrayList<>();
        heroes.add(hero1);
        heroes.add(hero2);
        heroes.add(hero3);

        ArrayList<Villain> villains = new ArrayList<>();
        villains.add(villian1);
        villains.add(villian2);

        for (superHero e : heroes) {
            e.display();
            e.performFly();
            e.performHit();
            e.performRegeneration();
            e.performSpeed();
            System.out.println();
        }

        for (Villain e : villains) {
            e.display();
            e.performFly();
            e.performHit();
            e.performRegeneration();
            e.performSpeed();
            System.out.println();
        }
    }
}
