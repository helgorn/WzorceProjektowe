package pl.sda.creational.factory;

public class WeaponFactory {
    public Weapon makeWeapon(Profession profession, int damage) {
        switch (profession) {
            case ARCHER:
                return new Bow(damage / 2);
            case WIZARD:
                return new Wand(damage / 3);
            case SWORDSMAN:
                return new Sword(damage);
            default:
                throw new IllegalStateException("Nie ma takiej broni");
        }
//        if (profession.equals(Profession.ARCHER)) {
//            return new Bow(damage / 2);
//        } else if (profession.equals(Profession.SWORDSMAN)) {
//            return new Sword(damage);
//        } else if (profession.equals(Profession.WIZARD)) {
//            return new Wand(damage / 3);
//        }
//        throw new IllegalStateException("Nie ma takiej broni");
    }
}
