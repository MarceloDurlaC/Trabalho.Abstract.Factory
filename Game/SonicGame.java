package game;

import characters.enemies.RealEggman;
import characters.heroes.RealShadow;
import factories.EnemyFactory;
import factories.HeroFactory;
import characters.heroes.RealSonic;


// Exemplo de uso
public class SonicGame {
    public static void main(String[] args) {
        //Cria um Sonic Concreto a partir da interface "HeroFactory" implementada pela classe "RealSonic".
        HeroFactory concreteSonic = new RealSonic();
        //Cria um Eggman Concreto a partir da interface "EnemyFactory" implementada pela classe "RealEggman".
        EnemyFactory concreteEggman = new RealEggman();

        //Sonic executa um método da interface "AbstractFactory".
        concreteSonic.action();
        //Sonic executa um método da interface "HeroFactory".
        concreteSonic.move();
        //Eggman executa um método da interface "AbstractFactory".
        concreteEggman.action();
        //Eggman executa um método da interface "EnemyFactory".
        concreteEggman.attack();

    }
}
