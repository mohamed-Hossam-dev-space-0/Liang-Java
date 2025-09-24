package assignments;

public class PopulationProjection {
    public static void main(String[] args) {
        int population = 312_032_486 , secondPerYear = 365 * 24 * 60 * 60;
        double birthRate = secondPerYear / 7.0;
        double deathRate = secondPerYear / 13.0;
        double newImmigrantRate = secondPerYear / 45.0;

        double changeRate = (birthRate - deathRate) + newImmigrantRate;

        for(int i = 1 ; i <= 5 ; i++){
            System.out.printf("The %d year population is %d\n" , i , population+=(int)(changeRate));
        }
    }
}