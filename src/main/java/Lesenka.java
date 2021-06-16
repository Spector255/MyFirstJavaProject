import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lesenka {
    private static final File PATH = "C:\\Users\\tipto\\IdeaProjects\\MyFirstProject\\src";

    public static void FileWriter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iterations count: ");
        var it = scanner.nextInt();

        try (FileWriter file = new FileWriter(PATH + "lesenka.txt")) {
            for(var i = 1; i <= it; i++){
                for(var u = 0; u <= i; u++){
                    System.out.println(i);
                    file.write("" + i);

                }
                System.out.println("\n");
                file.write("\n");
            }
            for(var i = it - 1; i > 0; i--){
                for(var u = i; u > 0; u--){
                    System.out.println(i);
                    file.write("" + i);

                }
                System.out.println("\n");
                file.write("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
