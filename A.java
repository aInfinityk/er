import java.util.Scanner;

class all {
  int number;
  Scanner sc = new Scanner(System.in);

  all() {
    System.out.println("Enter the number for operations: ");
    number = sc.nextInt();
  }

  void factorial(int n) {
    int i, fact=1;
    for(i=1;i<=n;i++)
    {
      fact=fact*i;
    }
    System.out.println("Factorial of "+n+"is: "+fact);
  }

  void prime(int n) {
    int i, flag = 0, m = n / 2;
    if (n == 0 || n == 1) {
      System.out.println(n + " is not prime number");
    } else {
      for (i = 2; i <= m; i++) {
        if (n % i == 0) {
          System.out.println(n + " is not prime number");
          flag = 1;
          break;
        }
      }
      if (flag == 0) {
        System.out.println(n + " is prime number");
      }
    }
  }

  void armstrong(int number) {
    int originalNumber, remainder, result = 0, n = 0;
    originalNumber = number;
    for (; originalNumber != 0; originalNumber /= 10, ++n)
      ;
    originalNumber = number;
    for (; originalNumber != 0; originalNumber /= 10) {
      remainder = originalNumber % 10;
      result += Math.pow(remainder, n);
    }
    if (result == number)
      System.out.println(number + " is an Armstrong number.");
    else
      System.out.println(number + " is not an Armstrong number.");
  }

  void fibo() {
    int n1 = 0, n2 = 1, n3, i, count = 10;
    System.out.print(n1 + " " + n2);
    for (i = 2; i < count; ++i) {
      n3 = n1 + n2;
      System.out.print(" " + n3);
      n1 = n2;
      n2 = n3;
    }
  }
}

public class A {
  public static void main(String args[]) {
    all ob = new all();
    ob.factorial(ob.number);
    ob.prime(ob.number);
    ob.armstrong(ob.number);
    ob.fibo();
  }
}