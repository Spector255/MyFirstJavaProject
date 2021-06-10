package RPG_Project;

import java.util.Scanner;

public class CharacterCreating {
    private static final Clase Class = new Clase();
    private static final Ability Ability = new Ability();
    private static final Stats Stats = new Stats();
    private static final Race Race = new Race();


    public Character CharacterCreating() {
        System.out.println("Hi!");
        System.out.println("Please select the race of the character");
        System.out.println("Human - Dexterity + 2");
        System.out.println("Orc   - Strength + 3, Vitality + 2,Defence - 1");
        System.out.println("Elf   - Intelligence + 1, Wisdom + 1, Vitality + 1, Dexterity + 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the character's race below");
        String RaceName = scanner.nextLine();
        Race.MakeRace(RaceName, Player);

        System.out.println("Now select the character class");
        System.out.println("Warrior (Strong melee attacks) - Strength +3, Defense +3, Vitality +2");
        System.out.println("Mage - Intelligence + 3, Dexterity +2, Wisdom +3");
        System.out.println("Ranger - Strength +2, Dexterity +4");
        System.out.println("Write the character's class below");
        String ClassName = scanner.nextLine();
        Class.MakeClass(ClassName, Player);

        System.out.println(RaceName + ", what is your name?");

        String CharacName = scanner.nextLine();
        ;

        System.out.println("Hi, " + CharacName + ClassName + RaceName);

        Player.MakeCharacter(CharacName, Ability, Stats, Class);

        System.out.println("Character created, enjoyable game!");
        return null;
    }
}
