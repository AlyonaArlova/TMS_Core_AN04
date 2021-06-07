package Lesson4;

public class Elf extends Warrior {

    public Elf(String warriorName, Race race, Weapon weapon) {
        super(warriorName, race, weapon);
    }

    @Override
    public void pullOutWeapon(Weapon weapon) {
        System.out.println("Elf is taking out" + weapon.getWeaponName());
    }

    @Override
    public void warCry() {
        System.out.println("Эльф Что-то тихо произносит");
    }

    @Override
    public void attack() {
        System.out.println("Эльф аттакует - Стреляет");
    }

    @Override
    public void celebration() {
        System.out.println("Эльф празднует победу - Молчит");
    }
}


