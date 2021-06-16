import java.util.Scanner;

public class Shifri {

    public static void Cezarj(String text, int shift){
        char[] chars = text.toCharArray();
        for (int i=0; i < text.length(); i++)
        {
            char c = chars[i];
            if (c >= 32 && c <= 127)
            {
                int x = c - 32;
                x = (x + shift) % 96;
                if (x < 0)
                    x += 96;
                chars[i] = (char) (x + 32);
            } else if (c >= 1040 && c <= 1103) {
                int x = c - 1040;
                x = (x + shift) % 32;
                if (x < 0)
                    x += 32;
                chars[i] = (char) (x + 1040);
        }
        }
        System.out.println(new String(chars));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение для шифрования: ");
        String predlozenie = scanner.nextLine();
        System.out.println("Введите сдвиг: ");
        String chislo = scanner.nextLine();
        int sdvig = Integer.parseInt(chislo);
        System.out.println("Выберите шифр: Цезаря, Виженера, Плейфера, Вернама, Тритемиуса, Хилла, Полибия");
        String subject = scanner.nextLine();
        switch (subject){
            case "Цезаря":
                Cezarj(predlozenie, sdvig);
                break;
            /*case "Русский":
                Russian();
                break;
            case "Социальные знания":
                Social();
                break;
            case "Труд":
                DIY();
                break;
            case "Литература":
                Literature();
                break;*/
        }

    }
}
