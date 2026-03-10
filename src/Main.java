import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 */
public class Main {

    // TASK 1 variables
    float earthWeightToprak = 53.0f;
    float marsGravityToprak = 0.38f;

    public static void main(String[] args) {
        Main app = new Main ();

        System.out.println("===== TASK 1: Weight on Mars =====");
        app.task1();

        System.out.println("\n===== TASK 2: Even or Odd =====");
        app.task2();

        System.out.println("\n===== TASK 3: Containers =====");
        app.task3();

        System.out.println("\n===== TASK 4: Tax Calculation =====");
        app.task4();
    }

    // ---------------- TASK 1 ----------------
    public void task1() {
        System.out.println("Earth weight: " + earthWeightToprak);

        double marsWeightToprak = earthWeightToprak * marsGravityToprak;
        System.out.printf("Weight on Mars (double, 4 decimals): %.4f%n", marsWeightToprak);

        int marsWeightIntToprak = (int) marsWeightToprak;
        System.out.println("Converted to int: " + marsWeightIntToprak);

        char marsWeightCharToprak = (char) marsWeightIntToprak;
        System.out.println("Converted to char: " + marsWeightCharToprak);

        int charMathToprak = marsWeightCharToprak + 5;
        System.out.println("Char + 5 result (int): " + charMathToprak);
    }

    // ---------------- TASK 2 ----------------
    public void task2() {
        int number = (int)(Math.random() * 100) + 1;
        System.out.println("Generated number: " + number);

        if (number % 2 == 0) {
            System.out.println("The number is EVEN.");
        } else {
            System.out.println("The number is ODD.");
        }
    }

    // ---------------- TASK 3 ----------------
    public void task3() {
        int amountOfBricks = 75;   // odd number
        int containerCapacity = 8; // even number

        int fullContainers = amountOfBricks / containerCapacity;
        int leftover = amountOfBricks % containerCapacity;
        int totalContainers = leftover == 0 ? fullContainers : fullContainers + 1;

        System.out.println("Bricks: " + amountOfBricks);
        System.out.println("Container capacity: " + containerCapacity);
        System.out.println("Full containers: " + fullContainers);
        System.out.println("Total containers needed: " + totalContainers);
        System.out.println("Blocks in last (not full) container: " + leftover);
    }

    // ---------------- TASK 4 ----------------
    public void task4() {
        double net = 9.99;
        double gross = net * 1.23;
        double totalGross = gross * 10000;
        double totalNet = totalGross / 1.23;

        System.out.println("Double gross: " + gross);
        System.out.println("Double total gross: " + totalGross);
        System.out.println("Double total net: " + totalNet);

        BigDecimal netBD = new BigDecimal("9.99");
        BigDecimal grossBD = netBD.multiply(new BigDecimal("1.23"));
        BigDecimal totalGrossBD = grossBD.multiply(new BigDecimal("10000"));
        BigDecimal totalNetBD = totalGrossBD.divide(new BigDecimal("1.23"), 10, RoundingMode.HALF_UP);

        System.out.println("BD gross: " + grossBD);
        System.out.println("BD total gross: " + totalGrossBD);
        System.out.println("BD total net: " + totalNetBD);

        System.out.println("Conclusion: double causes rounding errors, BigDecimal does not.");
    }
}