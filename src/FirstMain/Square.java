public class Square {

    private double width ;

    public Square(double w ) {
        width = w;
    }

    public Square() {
        width = 1 ;
    }

    public double getArea(){
        return width * width;

    }
    public double getDiagonal(){
        return Math.sqrt(2) * width;
    }
    public double getPerimeter(){
        return 4 * width;
    }
    public double getSide(){
        return width;
    }
    public Square getDoubled(){
        return new Square(width*2);
    }
    public static double getTotalArea(Square[] sqs){
        double result = 0;
        for (int i = 0; i < sqs.length; i++) {
            result += sqs[i].getArea();
        }
        return result;
    }
    public static Square getMax(Square[] sqs) {
        Square max = sqs[0];
        for (int i = 1; i < sqs.length; i++) {
            if (max.width > sqs[i].width) {
                max = sqs[i];
            }
        }
        return max;
    }
    public String toString(){
        return "Square["+ width+"]";
    }


}
