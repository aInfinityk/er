import java.util.Scanner;
class Area {
    static void area(double x) {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is " + z + " sq units");
    }

    static void area(float x, float y, float z) {
        double temp = (x + y + z);
        double s = temp / 2;
        double triarea = Math.sqrt(s * (s - x) * (s - y) * (s - z));
        System.out.println("\n Area of triangle is : " + triarea);
    }

    static void area(float x) {
        System.out.println("the area of the square is " + Math.pow(x, 2) + " sq units");
    }

    static void area(float x, float y) {
        System.out.println("the area of the rectangle is " + x * y + " sq units");
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the radius of circle:");
        area(sc.nextDouble());
        System.out.println("\nEnter three side of triangle:");
        area(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
        System.out.println("\nEnter side of square:");
        area(sc.nextFloat());
        System.out.println("\nEnter length and width of rectangle:");
        area(sc.nextFloat(),sc.nextFloat());
        sc.close();
    }
}