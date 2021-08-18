import java.util.*;

class test1 {
    public static void main() {
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        int largest = arr[0];
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest)
                largest = arr[i];
            else if (arr[i] < smallest)
                smallest = arr[i];
        }
        System.out.println("smallest no is=" + smallest);
        System.out.println(" largest no is=" + largest);
        for (int i = 0; i < 20; i++) {
            sum += arr[i];
            System.out.println("average is" + sum / 20);
        }
        sc.close();
    }
}