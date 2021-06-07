package Lesson4;

public class Goblin extends Warrior {
    public Goblin(String warriorName, Race race, Weapon weapon) {
        super(warriorName, race, weapon);
    }

    @Override
    public void pullOutWeapon(Weapon weapon) {
        System.out.println("Goblin is taking out" + weapon.getWeaponName());
    }

    @Override
    public void warCry() {
        System.out.println("Гоблин Заикаясь от эля бормочет клич");
    }

    @Override
    public void attack() {
        System.out.println("Гоблин аттакует - Рубит противника");
    }

    @Override
    public void celebration() {
        System.out.println("Гоблин празднует победу - Достает кружечку эля и радостно выпивает");
    }
}


