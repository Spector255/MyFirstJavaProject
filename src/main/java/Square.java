import org.apache.log4j.Logger;

public class Square {
    private static final Logger LOGGER = Logger.getLogger(Square.class);
    private Integer side = 0;

    public Square(Integer side) {
        this.side = side;
        LOGGER.info("Created Square");
    }

    public void perimeter() {
        System.out.println(this.side * 4);
        LOGGER.info("Calculated perimeter");
    }

    public void square() {
        System.out.println(Math.pow((double)this.side, 2.0D));
        LOGGER.info("Calculated square");
    }

    public Integer divide(Integer x) {
        try {
            return this.side / x;
        } catch (ArithmeticException var3) {
            LOGGER.error("divide by 0");
            return this.side;
        }
    }
}