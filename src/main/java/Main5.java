import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Properties;
import java.util.stream.Stream;

public class Main5 {
    static final String PATH = "C:\\Users\\tipto\\Desktop";

    public static void main(String[]args) {
        /*File file = new File(PATH);
        try {
            Path path = Paths.get(PATH);

            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Stream<String> string = bufferedReader.lines();
            bufferedReader.close();
            System.out.println(Arrays.toString(string.toArray()));

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            BufferedWriter.write("Halo!");
            bufferedWriter.newLine();
            bufferedWriter.write("Hello World!");
            bufferedWriter.close();

            Files.lines(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        Path path = Paths.get(PATH);

        Properties properties = new Properties();
        try{
            properties.load(Files.newInputStream(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        properties.load(File.newInputStream(path));
    }
}
