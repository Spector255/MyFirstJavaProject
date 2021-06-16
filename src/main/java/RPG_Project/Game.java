package RPG_Project;

public class Game {
    public static final Dungeon Dungeon = new Dungeon();
    public static final World World = new World();
    public static String Place = "World";
    public Game game = new Game();

    public void Game() {
        System.out.println(game.Player.getCharName() + ", now you are in " + Place + "!");

        }
    }
