package characters.heroes;

import factories.HeroFactory;

// Fábrica concreta para o Shadow
public class RealShadow implements HeroFactory {
    @Override
    public void move() {
        System.out.println("O Shadow está patinando");
    }

    @Override
    public void action() {
        System.out.println("Shadow está agindo.");
    }

}
