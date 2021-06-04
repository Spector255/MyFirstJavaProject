import java.util.Scanner;
public class Testi {

    public static void Math(){
        int rez = 0;
        for (int q = 0; q != 5;) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Что такое биссектриса?");
            System.out.println("Варианты ответов:");
            System.out.println("1 - Это крыса, которая бегает по углам и делит угол пополам");
            System.out.println("2 - Луч, исходящий из вершины угла и делящий этот угол на два равных угла.");
            System.out.println("3 - Часть прямой, состоящая из данной точки и всех точек, лежащих по одну сторону от неё.");
            System.out.println("4 - Отрезок перпендикуляра, опущенного из вершины геометрической фигуры на её основание или на продолжение основания.");
            String Answermath = scanner.nextLine();
            if (Answermath.equals("1")) {
                System.out.println("Вы гуманитарий, до свидания!"); //:)
                break;
            } else if (Answermath.equals("2")) {
                rez++;
            }
            q++;
            System.out.println("Вычислите 4824/36 в уме");
            System.out.println("Варианты ответов:");
            System.out.println("1 - 134");
            System.out.println("2 - 404");
            System.out.println("3 - 128");
            System.out.println("4 - 224");
            Answermath = scanner.nextLine();
            if (Answermath.equals("1")) {
                rez++;
            }
            q++;
            System.out.println("Найдите площадь прямоугольника со сторонами 4 см и 13 см");
            System.out.println("Варианты ответов: ");
            System.out.println("1 - 52");
            System.out.println("2 - 98");
            System.out.println("3 - 87");
            System.out.println("4 - 34");
            Answermath = scanner.nextLine();
            if (Answermath.equals("1")) {
                rez++;
            }
            q++;
            System.out.println("Вычислите неизвестные члены арифметической прогрессии: 5,x,-1,y");
            System.out.println("Варианты ответов:");
            System.out.println("1 - x = 3 ; y = 4 ");
            System.out.println("2 - x = -5 ; y = 1 ");
            System.out.println("3 - x = 2 ; y = -4 ");
            System.out.println("4 - x = 1 ; y = -5 ");
            Answermath = scanner.nextLine();
            if (Answermath.equals("3")) {
                rez++;
            }
            q++;

            System.out.println("Решите (x^2−10x)(49−x^2)≥0 ");
            System.out.println("Варианты ответов:");
            System.out.println("1 - x ∈ [-7; 0] ∪ [7;10]");
            System.out.println("2 - x ∈ (−∞;−7) ∪ (0;7) ∪ (10;+∞)");
            System.out.println("3 - x ∈ (−∞;−7] ∪ [0;7] ∪ [10;+∞)");
            System.out.println("4 - x ∈ (−7;0) ∪ (7;10)");
            Answermath = scanner.nextLine();
            if (Answermath.equals("1")) {
                rez++;
            }
            q++;
        }
        if (rez == 0) {
            System.out.println("Ваш результат - nv, Вас скоро отчислят");
        } else {
            System.out.println("Ваш результат - " + rez*2);
        }
    }

    public static void Russian() {
        int rez = 0;
        for (int q = 0; q != 5;) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Что нельзя писать после буквы ж и ш?");
            System.out.println("Варианты ответов:");
            System.out.println("1 - е");
            System.out.println("2 - а");
            System.out.println("3 - ы");
            System.out.println("4 - о");
            String Answerrus = scanner.nextLine();
            if (Answerrus.equals("3")) {
                rez++;
            }
            q++;
            System.out.println("Как подчеркивается подлежащее?");
            System.out.println("Варианты ответов:");
            System.out.println("1 - Одной чертой");
            System.out.println("2 - Пунктиром");
            System.out.println("3 - Волнистой линией");
            System.out.println("4 - Двумя чертами");
            Answerrus = scanner.nextLine();
            if (Answerrus.equals("1")) {
                rez++;
            }
            q++;
            System.out.println("Как пишется не с глаголами?");
            System.out.println("Варианты ответов: ");
            System.out.println("1 - слитно");
            System.out.println("2 - раздельно");
            System.out.println("3 - через дефис");
            System.out.println("4 - через тире");
            Answerrus = scanner.nextLine();
            if (Answerrus.equals("2")) {
                rez++;
            }
            q++;
            System.out.println("Какое слово является сказуемым в предложение: Маша читала очень интересную книгу!");
            System.out.println("Варианты ответов:");
            System.out.println("1 - Маша");
            System.out.println("2 - читала");
            System.out.println("3 - очень");
            System.out.println("4 - книгу");
            Answerrus = scanner.nextLine();
            if (Answerrus.equals("2")) {
                rez++;
            }
            q++;

            System.out.println("На какие вопросы отвечает дательный падеж?");
            System.out.println("Варианты ответов:");
            System.out.println("1 - кто? что?");
            System.out.println("2 - кого? чего?");
            System.out.println("3 - кому? чему?");
            System.out.println("4 - кого? что?");
            Answerrus = scanner.nextLine();
            if (Answerrus.equals("3")) {
                rez++;
            }
            q++;
        }
        if (rez == 0) {
            System.out.println("Ваш результат - nv, Вас скоро отчислят");
        } else {
            System.out.println("Ваш результат - " + rez*2);
        }
    }

    public static String Social() {
        int rez = 0;
        for (int q = 0; q != 5;) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Со скольки лет разрешено покупать и употребять алкоголь и табачные изделия?");
            System.out.println("Варианты ответов:");
            System.out.println("1 - с 14");
            System.out.println("2 - с 16");
            System.out.println("3 - с 18");
            System.out.println("4 - с 21");
            String Answersoc = scanner.nextLine();
            if (Answersoc.equals("1")|Answersoc.equals("2")) {
                System.out.println("За Вами выехал экипаж полиции!");
                break;
            } else if (Answersoc.equals("3")){
                rez++;
            }
            q++;
            System.out.println("Сколько стран в ЕС?");
            System.out.println("Варианты ответов:");
            System.out.println("1 - 24");
            System.out.println("2 - 27");
            System.out.println("3 - 30");
            System.out.println("4 - 193");
            Answersoc = scanner.nextLine();
            if (Answersoc.equals("2")) {
                rez++;
            }
            q++;
            System.out.println("Как расшифровывается ООН?");
            System.out.println("Варианты ответов: ");
            System.out.println("1 - Организация Объединенных Наций");
            System.out.println("2 - Официальное Объединение Наций");
            System.out.println("3 - Очень Общительные Народы");
            System.out.println("4 - Очень Общительные Нации");
            Answersoc = scanner.nextLine();
            if (Answersoc.equals("1")) {
                rez++;
            }
            q++;
            System.out.println("В каком году Хорватия вошла с ЕС?");
            System.out.println("Варианты ответов:");
            System.out.println("1 - 2012");
            System.out.println("2 - 2017");
            System.out.println("3 - 2019");
            System.out.println("4 - 2013");
            Answersoc = scanner.nextLine();
            if (Answersoc.equals("4")) {
                rez++;
            }
            q++;

            System.out.println("Единный номер для несчастных случаев в Латвии это...");
            System.out.println("Варианты ответов:");
            System.out.println("1 - 112");
            System.out.println("2 - 110");
            System.out.println("3 - 911");
            System.out.println("4 - 03");
            Answersoc = scanner.nextLine();
            if (Answersoc.equals("1")) {
                rez++;
            }
            q++;
        }
        if (rez == 0) {
            System.out.println("Ваш результат - nv, Вас скоро отчислят");
        } else {
            System.out.println("Ваш результат - " + rez*2);
        }
        return "Тест сдан";
    }

    public static String DIY() {
        int rez = 0;
        for (int q = 0; q != 5;) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Что нужно использовать для того, чтобы вбить гвоздь?");
            System.out.println("Варианты ответов:");
            System.out.println("1 - гвоздодёр");
            System.out.println("2 - биту");
            System.out.println("3 - молоток");
            System.out.println("4 - дрель");
            String Answerdiy = scanner.nextLine();
            if (Answerdiy.equals("1")) {
                System.out.println("Ну ну, удачи!");
                break;
            } else if (Answerdiy.equals("3")){
                rez++;
            }
            q++;
            System.out.println("Как называется крепёжное изделие для разборного соединения деталей, одна из которых может быть с внутренней резьбой?");
            System.out.println("Варианты ответов:");
            System.out.println("1 - Винт");
            System.out.println("2 - Болт");
            System.out.println("3 - Гвоздь");
            System.out.println("4 - Линейка");
            Answerdiy = scanner.nextLine();
            if (Answerdiy.equals("1")) {
                rez++;
            }
            q++;
            System.out.println("Как расшифровывается ДСП?");
            System.out.println("Варианты ответов: ");
            System.out.println("1 - Древесно-Стружечная Плита");
            System.out.println("2 - Древесно-склеенная плита");
            System.out.println("3 - Древесно-стружечный пенопласт");
            System.out.println("4 - Деревянно-стальной пол");
            Answerdiy = scanner.nextLine();
            if (Answerdiy.equals("1")) {
                rez++;
            }
            q++;
            System.out.println("Что из этого НЕ является строительным магазином?");
            System.out.println("Варианты ответов:");
            System.out.println("1 - Курши");
            System.out.println("2 - Депо");
            System.out.println("3 - К-Сенукай");
            System.out.println("4 - Дрогас");
            Answerdiy = scanner.nextLine();
            if (Answerdiy.equals("4")) {
                rez++;
            }
            q++;

            System.out.println("Как называется гибкий абразивный материал," +
                    " состоящий из тканевой или бумажной основы с нанесённым на неё слоем абразивного зерна?");
            System.out.println("Варианты ответов:");
            System.out.println("1 - Наждачная бумага");
            System.out.println("2 - Фасадная сетка");
            System.out.println("3 - Гипсокартон");
            System.out.println("4 - Текстиль");
            Answerdiy = scanner.nextLine();
            if (Answerdiy.equals("1")) {
                rez++;
            }
            q++;
        }
        if (rez == 0) {
            System.out.println("Ваш результат - nv, Вас скоро отчислят");
        } else {
            System.out.println("Ваш результат - " + rez*2);
        }
        return "Тест сдан";
    }

    public static String Literature() {
        int rez = 0;
        for (int q = 0; q != 5;) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("В каком году родился Пушкин?");
            System.out.println("Варианты ответов:");
            System.out.println("1 - 1845");
            System.out.println("2 - 1799 ");
            System.out.println("3 - 1648");
            System.out.println("4 - 1725");
            String Answerlit = scanner.nextLine();
           if (Answerlit.equals("2")){
                rez++;
            }
            q++;
            System.out.println("Кто написал произведение Горе от Ума?");
            System.out.println("Варианты ответов:");
            System.out.println("1 - Достаевский");
            System.out.println("2 - Тургенев");
            System.out.println("3 - Толстой");
            System.out.println("4 - Грибоедов");
            Answerlit = scanner.nextLine();
            if (Answerlit.equals("4")) {
                rez++;
            }
            q++;
            System.out.println("Когда впервые опубликовали роман Капитанская дочка?");
            System.out.println("Варианты ответов: ");
            System.out.println("1 - 1820");
            System.out.println("2 - 1836");
            System.out.println("3 - 1845");
            System.out.println("4 - 1851");
            Answerlit = scanner.nextLine();
            if (Answerlit.equals("2")) {
                rez++;
            }
            q++;
            System.out.println("Сколько томов в романе Война и мир?");
            System.out.println("Варианты ответов:");
            System.out.println("1 - 5");
            System.out.println("2 - 3");
            System.out.println("3 - 2");
            System.out.println("4 - 4");
            Answerlit = scanner.nextLine();
            if (Answerlit.equals("4")) {
                rez++;
            }
            q++;

            System.out.println("Кто написал Ревизор?");
            System.out.println("Варианты ответов:");
            System.out.println("1 - Гоголь");
            System.out.println("2 - Бунин");
            System.out.println("3 - Толстой");
            System.out.println("4 - Достоевский");
            Answerlit = scanner.nextLine();
            if (Answerlit.equals("1")) {
                rez++;
            }
            q++;
        }
        if (rez == 0) {
            System.out.println("Ваш результат - nv, Вас скоро отчислят");
        } else {
            System.out.println("Ваш результат - " + rez*2);
        }
        return "Тест сдан";
    }

    public static void main (String[]args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите предмет: Математика, Русский, Социальные знания, Труд, Литература");
        String subject = scanner.nextLine();
        switch (subject){
            case "Математика":
                Math();
                break;
            case "Русский":
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
                break;
        }
        System.out.println("Что-то пошло не так!");
    }
}
