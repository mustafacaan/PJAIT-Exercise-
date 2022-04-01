package Shift;

public class ColorBytes {
    public static void main(String[] args) {
        int a = 23, r = 121, g = 255, b = 130, color;
        color = a;
        color = color << 8;
        color = color | r;
        color = color <<8;
        color = color | g;
        color = color <<8;
        color = color | b;




        System.out.println("a, r, g, b = " + a +
                ", " + r + ", " + g + ", " + b);
        System.out.println("color = " + color);
        a = 0;
        r = 0;
        g = 0;
        b = 0;

        b = color & 0xFF;
        color = color >> 8;
        g = color & 0xFF;
        color = color >> 8;
        r = color & 0xFF;
        color = color >> 8;
        a = color & 0xFF;



        System.out.println("a, r, g, b = " + a +
                ", " + r + ", " + g + ", " + b);
    }
}
