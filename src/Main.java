import java.io.IOException;
import java.util.Scanner;
public class Main {
    enum Seasons {Winter, Spring, Summer, Autumn}
    public static void main(String[] args) {
        @Deprecated
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        switch (season) {
            case "jan":
            case "feb":
            case "dec":
                System.out.println(Seasons.Winter);
            default:
                System.out.println(Seasons.Summer);
        }
        try {
            season += "a";
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println(season);
        }
    }
}