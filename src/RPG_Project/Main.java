package RPG_Project;

public class Main {

    public static final CharacterCreating CharacterCreating = new CharacterCreating();
    public static final Game Game = new Game();
    protected static Character Player = new Character();

    public void main(String[] args) {
        Player = CharacterCreating.CharacterCreating();
        Game.Game();
    }
}
