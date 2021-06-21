package Lecture;

import org.apache.log4j.Logger;

public class Main8 {
        public static final Logger LOGGER = Logger.getLogger(Main8.class);

        public static void main(String[] args) {
            LOGGER.info("Hello World");
            Square square = new Square(5);
            square.perimeter();
            square.square();
            System.out.println(square.divide(0));
        }
}
