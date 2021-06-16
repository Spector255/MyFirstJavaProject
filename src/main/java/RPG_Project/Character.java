package RPG_Project;

public class Character {
    private String CharName;
    private Ability CharAbility = new Ability();
    private Stats CharStats = new Stats();
    private int Level;
    private int Experience;
    private Clase Clase = new Clase();
    private Race Race = new Race();

    public void MakeCharacter(String CharName, Ability CharAbility, Stats CharStats, Clase Class) {
        this.CharName = CharName;
        this.CharAbility = CharAbility;
        this.CharStats = CharStats;
        Level = 0;
        Experience = 0;
        this.Clase = Class;
        this.Race = Race;
    }

    public String getCharName() {
        return CharName;
    }

    public Clase getClase() {
        return Clase;
    }

    public Race getRace() {
        return Race;
    }

    public Ability getCharAbility() {
        return CharAbility;
    }

    public Stats getCharStats() {
        return CharStats;
    }

    public void setCharAbility(Ability charAbility) {
        CharAbility = charAbility;
    }

    public void setExperience(int experience) {
        Experience = experience;
    }

    public void setCharStats(int Strength, int Intelligence, int HP, int Defense, int Vitality, int Wisdom) {
        CharStats.setStrength(CharStats.getStrength() + Strength);
        CharStats.setIntelligence(CharStats.getIntelligence() + Intelligence);
        CharStats.setHP(CharStats.getHP() + HP);
        CharStats.setDefense(CharStats.getDefense() + Defense);
        CharStats.setVitality(CharStats.getVitality() + Vitality);
        CharStats.setWisdom(CharStats.getWisdom() + Wisdom);
    }

    public void LevelUp() {
        if (Experience >= 100 + (Level * 25)) {
            Level++;
            Experience -= 100 + (Level * 25);
        }
    }
}
