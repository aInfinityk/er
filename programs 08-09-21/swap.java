import java.util.Scanner;

class swap {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for a:");
        a = sc.nextInt();
        System.out.println("Enter value for b:");
        b = sc.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swapped value of a is " + a + "\n" + "Swapped value of b is " + b);
        sc.close();
    }
}