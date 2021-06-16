public class Main2 {
    public static void main(String[] args) {
        Student studentOne = new Student("Artur", 1);
        Student studentTwo = new Student("Mark", 2);
        int[][] table =new int[10][10];


        System.out.println(studentOne.toString() + studentTwo.toString());
        System.out.println(studentOne.equals(studentTwo));
        System.out.println(table);
    }
}
