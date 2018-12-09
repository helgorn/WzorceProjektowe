package pl.sda.creational.factory;

import pl.sda.creational.singleton.SingletonLogger;

public class Warrior {
    private final String nickname;
    private int lvl;
    private Profession profession;
    private Weapon weapon;
    private final WeaponFactory weaponFactory = new WeaponFactory();

    public Warrior(String nickname, int lvl, Profession profession) {
        this.nickname = nickname;
        this.lvl = lvl;
        changeProfession(profession);
        weapon = weaponFactory.makeWeapon(this.profession,10);
    }

    public void changeProfession(Profession newProffesion) {
        profession=newProffesion;
        weapon = weaponFactory.makeWeapon(profession,50);
        SingletonLogger.getInstance().log("Changing profession to " + newProffesion);
    }
}
