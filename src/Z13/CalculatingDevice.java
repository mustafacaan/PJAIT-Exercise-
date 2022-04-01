package Z13;

public class CalculatingDevice {
    public String hp;

    public CalculatingDevice(String hp) {
        this.hp = hp;
    }


    public String calculate(double x, double y) {
        return x + "+" + y + "=" + (x + y);

    }

    public static void printRes(CalculatingDevice[] a, double x, double y) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].calculate(x, y));

        }
    }
}
class Calculator extends CalculatingDevice {
    public Calculator(String hp) {
        super(hp);
    }
    public String calculate(double x, double y){
        return super.calculate(x,y) + "; " + x + "-" + y + "=" +(x - y);
    }
}
class Computer extends Calculator{
    public Computer(String hp){
        super(hp);
    }
    public String calculate(double x, double y){
        return super.calculate(x,y) + ";" + x + "*" + y + "=" +(x * y)+ ";" + x + "/" + y + "=" +(x / y);
    }
}
class Computers {
    public static void main (String[] args) {
        CalculatingDevice[] arr = {
                new Computer("Cray"),
                new CalculatingDevice("Abacus"),
                new Calculator("HP")
        };
        CalculatingDevice.printRes(arr, 21, 7);
    }
}
