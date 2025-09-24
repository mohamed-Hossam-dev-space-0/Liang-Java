package assignments;

public class approximatePI {
  public static void main(String[] args) {
    // Using 1.0 to force floating-point division instead of integer division

    double approximationFirst = 4.0 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
    double approximationSecond = 4.0 * (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);

    System.out.println("The first approximation is " + approximationFirst);
    System.out.println("THe second approximation is " + approximationSecond);
  }
}
