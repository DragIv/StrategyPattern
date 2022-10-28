package Ducks;

public class NumDuck{

    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();


        DuckDecoy decoy_duck = new DuckDecoy();
        decoy_duck.fly();
        decoy_duck.quack();
        decoy_duck.display();


    }



    public static abstract class Duck {
        FlyBehavior flyBehavior;
        QuackBehavior quackBehavior;
        public Duck() {
        }
        public abstract void display();

        public void performFly() {
            flyBehavior.fly();
        }

        public void performQuack() {
            quackBehavior.quack();
        }

        public void swim() {
            System.out.println("All ducks float, even decoys!");
        }
        public void setFlyBehavior(FlyBehavior fb) {
            flyBehavior = fb;
        }
        public void setQuackBehavior(QuackBehavior qb) {
            quackBehavior = qb;
        }
    }


    public interface FlyBehavior {
        public void fly();
    }
    public interface QuackBehavior {
        public void quack();
    }


    public static class FlyWithWings implements FlyBehavior {
        public void fly() {
            System.out.println("I’m flying!!");
        }
    }

    public static class FlyNoWay implements FlyBehavior {
        public void fly() {
            System.out.println("I can’t fly");
        }
    }

    public static class Quack implements QuackBehavior {
        public void quack() {
            System.out.println("Quack");
        }
    }
    public static class MuteQuack {
        public void quack(){
            System.out.println("<<Silence>>");
        }
    }
    public static class Squeak {
        public void quack() {
            System.out.println("Squeak");
        }
    }


    public static class MallardDuck extends Duck {
        public MallardDuck() {
            quackBehavior = new Quack();
            flyBehavior = new FlyWithWings();
        }
        public void display() {
            System.out.println("I’m a real Mallard duck");
        }
    }

    public static class DuckDecoy implements FlyBehavior,QuackBehavior {
        public DuckDecoy(){
            FlyNoWay flyBehavior = new FlyNoWay();
            Quack quackBehavior = new Quack();
        }

        public void fly() {
            System.out.println("I feel like I'm flying");
        }
        public void quack() {
            System.out.println("quack quack quack");
        }
        public void display(){
            System.out.println("I'm a duck, come to me");
        }


    }

    public static class ModelDuck extends Duck {
        public ModelDuck() {
            flyBehavior = new FlyNoWay();
            quackBehavior = new Quack();
        }
        public void display() {
            System.out.println("I’m a model duck");
        }
    }

    public static class FlyRocketPowered implements FlyBehavior {
        public void fly() {
            System.out.println("I’m flying with a rocket!");
        }
    }




}