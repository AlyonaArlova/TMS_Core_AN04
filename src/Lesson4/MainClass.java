package Lesson4;

public class MainClass {
    public static void main(String[] args) {
                Race orcs = new Race("My lovely Orc");
                Race elves = new Race("My lovely Elf");
                Race goblins = new Race("My lovely Goblin");
                Weapon knife = new Weapon("Knife");
                Weapon forks = new Weapon("Forks");
                Weapon topor = new Weapon("topor");
                Warrior orc = new Orc("TestOrc", orcs, knife);
                Warrior elf = new Elf("TestElf", elves, forks);
                Warrior goblin = new Goblin("TestGoblin", goblins, topor);

                orc.kill();
                elf.kill();
                goblin.kill();
            }
        }


