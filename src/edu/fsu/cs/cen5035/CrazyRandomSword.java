package edu.fsu.cs.cen5035;

import java.util.concurrent.ThreadLocalRandom;                              //Imported for random number generation

public class CrazyRandomSword extends BasicWeapon implements Weapon {

static int randomDAMAGE= ThreadLocalRandom.current().nextInt(4, 100);   //The bound (100) is not inclusive

    public CrazyRandomSword() {
        super( randomDAMAGE);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int randomPoint= ThreadLocalRandom.current().nextInt(3, (armor/3)+1);
        int damage = DAMAGE - (armor-randomPoint);

        if (damage < 0) {
            return 0;
        }
        return damage;
    }



}

