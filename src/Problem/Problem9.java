import java.util.Scanner;

public class Problem9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double d = scan.nextInt();
        String geoFigure = scan.next();
        double pi = 3.41592;

        double area = switch(geoFigure) {
            case "disc"-> pi*d*d;

            case "triangle" -> 0.25*Math.random();

            case "square" -> d*d;

            case "rand"-> {
                double f = Math.random();
                double surfaceArea;
                if (f<1./3) surfaceArea = pi*d*d; //1/2 will be equal to zero.
                else if (f<2./3) surfaceArea = 0.25*Math.sqrt(3)*d*d;
                else surfaceArea = d*d;

                yield surfaceArea;
            }
            default -> {
                System.out.println("Error !! ");
                yield -1.0;
            }
        };
    }
}
