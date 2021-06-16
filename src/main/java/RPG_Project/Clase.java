package RPG_Project;

public class Clase {
    private String ClassName;

    public void MakeClass(String ClassName, Character Player) {
        switch (ClassName) {
            default:
                this.ClassName = ClassName;
                break;
            case "Warrior":
                Player.setCharStats(3,1,25,3,2,1);
                break;
            case "Mage":
                Player.setCharStats(1,3,25,1,1,3);
                break;
            case "Ranger":
                Player.setCharStats(2,1,25,1,1,1);
                break;
        }
    }
}
