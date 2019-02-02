package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class WeaponFactory {

    public static Weapon getWeapon(String type) {
        switch (type) {
            case "sword":
                return new Sword();
            case "spear":
            	return new Spear();
            case "simpleHammer":
                return new SimpleHammer();
            case "crazyRandomSword":
                return new CrazyRandomSword();
            case "squareRootSpear":
                return new SquareRootSpear();
            default:
                throw new IllegalArgumentException("Invalid type");
        }
    }

}
