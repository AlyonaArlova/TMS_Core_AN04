package Lesson4;

public class Orc extends Warrior{
    public Orc(String warriorName, Race race, Weapon weapon) {
        super(warriorName, race, weapon);
    }

    @Override
    public void pullOutWeapon(Weapon weapon) {
        System.out.println("Orc is taking out" + weapon.getWeaponName());
    }

    @Override
    public void warCry() {
        System.out.println("Орк Кричит что-то невнятное");
    }

    @Override
    public void attack() {
        System.out.println("Орк аттакует - Сносит голову противник");
    }

    @Override
    public void celebration() {
        System.out.println("Орк празднует победу");
    }
}
