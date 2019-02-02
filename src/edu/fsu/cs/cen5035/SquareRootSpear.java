/*This class SquareRootSpear has damage of 60
   and ignores the square root of armor point.
 */

package edu.fsu.cs.cen5035;

import java.lang.Math;                                                  //imported to implement square root

public class SquareRootSpear extends BasicWeapon implements Weapon {

    public SquareRootSpear() {
        super(60);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - (int) (armor - Math.sqrt(armor));         //ignores square root of armor point
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}
