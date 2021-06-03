import java.util.Scanner;

public class IsDateValid {

        public static boolean isCorrect(int date, int month, int year){
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    return date <= 31;
                case 2:
                    if (year%4 == 0){
                        return date <= 29;
                    } else {
                        return date <= 28;
                    }
                case 4:
                case 6:
                case 9:
                case 11:
                    return date <= 30;
            }
            return false;
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String dateWithoutFormat = scanner.nextLine();
            if (dateWithoutFormat.contains("/")){
                String[] splitdata = dateWithoutFormat.split("/");
                int datefrstr = Integer.parseInt(splitdata[0].trim());
                int monthfrstr = Integer.parseInt(splitdata[1].trim());
                int yearfrstr = Integer.parseInt(splitdata[2].trim());
                if (isCorrect(datefrstr, monthfrstr, yearfrstr)){
                    System.out.println("Date is valid");
                } else {
                    System.out.println("Date is not valid");
                }
            } else if (dateWithoutFormat.contains("-")) {
                String[] splitdata = dateWithoutFormat.split("-");
                int datefrstr = Integer.parseInt(splitdata[1].trim());
                int monthfrstr = Integer.parseInt(splitdata[0].trim());
                int yearfrstr = Integer.parseInt(splitdata[2].trim());
                if (isCorrect(datefrstr, monthfrstr, yearfrstr)){
                    System.out.println("Date is valid");
                } else {
                    System.out.println("Date is not valid");
                }
            }
        }
    }
