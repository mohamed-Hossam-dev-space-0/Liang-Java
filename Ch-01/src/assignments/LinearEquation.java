package assignments;

public class LinearEquation {
    public static void main(String[] args){
        double a = 3.4, b = 50.2, e = 44.5, c = 2.1, d = .55, f = 5.9;

        double determinate = a * d - b * c;

        double x  = (e * d - b * f) / determinate;
        double y  = (a * f - e * c) / determinate;



        System.out.printf("The value of x and y respectively is %.2f, %.2f and the result of the test is %b" , x , y ,(3.4 * x + 50.2 * y == e) ? "true" : "false");
    }
}
