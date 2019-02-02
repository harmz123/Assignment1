package edu.fsu.cs.cen5035;

public class SimpleHammer extends BasicWeapon implements Weapon {



        public SimpleHammer() {
            super(35);
        }

        @Override
        public int hit() {
            return DAMAGE;
        }

        @Override
        public int hit(int armor) {
            int damage=0;
            if (armor < 30) {               //The SimpleHammer ignores armor points if armor < 30.
                damage = DAMAGE;
            }
            if (armor >=30){                //The SimpleHammer behaves like a sword if armor >= 30.
                damage = DAMAGE - armor;    
            }
            if (damage < 0) {
                return 0;
            }
            return damage;
        }



}
