package characters.heroes;

import factories.HeroFactory;

// Fábrica concreta para o Sonic
public class RealSonic implements HeroFactory {

    @Override
    public void move() {
        System.out.println("O Sonic ta girando.");

    }

    @Override
    public void action() {
        System.out.println("Sonic está agindo.");
    }
}
