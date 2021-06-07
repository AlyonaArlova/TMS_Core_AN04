package Lesson4;

public class Warrior {
    public String warriorName;
    private final Race race;
    private final Weapon weapon;

    public Warrior(String warriorName, Race race, Weapon weapon) {
        this.race = race;
        this.warriorName = warriorName;
        this.weapon = weapon;
    }

    public void kill() {
        pullOutWeapon(weapon);
        warCry();
        attack();
        celebration();
    }

    public void pullOutWeapon(Weapon weapon) {

    }

    public void attack() {

    }

    public void celebration() {

    }

    public void warCry() {

    }
}
