package assignments;

public class AreaPerimeterCircle{
  public static void main(String[] args){
    double radius = 5.5 , perimeter , area;
    perimeter = 2 * radius * 3.14;
    area = Math.pow(radius , 2) * Math.PI;

    System.out.printf("The area is %.2f  and perimeter %.2f",area , perimeter);
  }
}
