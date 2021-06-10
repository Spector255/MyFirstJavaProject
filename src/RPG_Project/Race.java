package RPG_Project;

public class Race {
    public String RaceName;

    public void MakeRace(String RaceName, Character Player) {
        switch (RaceName) {
            default:
                this.RaceName = RaceName;
            case "Human":
                Player.setCharStats(2, 2, 25, 1, 0, 0);
                break;
            case "Orc":
                Player.setCharStats(3, 0, 25, 2, 2, 0);
                break;
            case "Elf":
                Player.setCharStats(1, 2, 25, 1, 1, 1);
                break;
        }
    }
}
