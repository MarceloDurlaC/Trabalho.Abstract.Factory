package characters.enemies;

import factories.EnemyFactory;

// Inimigo Metal Sonic
public class RealMetalSonic implements EnemyFactory {
    public void attack() {
        System.out.println("Metal Sonic ataca Sonic com raios laser!");
    }

    @Override
    public void action() {
        System.out.println("Metal Sonic está agindo.");
    }
}
