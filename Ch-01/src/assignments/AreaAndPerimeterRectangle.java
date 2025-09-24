package assignments;

public class AreaAndPerimeterRectangle {
  public static void main(String[] args) {
    double width = 4.5, height = 7.9, area, perimeter;

    area = width * height;
    perimeter = (width + height) * 2;
    System.out.printf("The area of the rectangle is %.2f and the perimeter is %.2f\n", area, perimeter);
  }
}
