package characters.enemies;

import factories.EnemyFactory;

// Inimigo RealEggman
public class RealEggman implements EnemyFactory {
    public void attack() {
        System.out.println("RealEggman atira mísseis em Sonic!");
    }

    @Override
    public void action() {
        System.out.println("RealEggman está agindo.");

    }
}
