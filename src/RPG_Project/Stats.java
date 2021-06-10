package RPG_Project;

public class Stats {
    private int Strength = 10;
    private int Intelligence = 100;
    private int HP = 100;
    private int Defense = 10;
    private int Vitality = 10;
    private int Wisdom = 20;

    public int getStrength() {
        return Strength;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public int getHP() {
        return HP;
    }

    public int getDefense() {
        return Defense;
    }

    public int getVitality() {
        return Vitality;
    }

    public int getWisdom() {
        return Wisdom;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }

    public void setDefense(int defense) {
        Defense = defense;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setVitality(int vitality) {
        Vitality = vitality;
    }

    public void setWisdom(int wisdom) {
        Wisdom = wisdom;
    }
}
