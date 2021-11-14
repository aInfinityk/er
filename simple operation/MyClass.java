import java.util.Scanner;
import java.lang.Math; 

public class MyClass {
    
    public static double periOfCircle(double r){
    return 2*3.14*r;
}

    public static double areaOfCircle(double r){
    return 3.14*r*r;
}
     public static double periOfSquare(double s){
     return 4*s;
}
     public static double areaOfSquare(double s){
     return s*s;
}
    public static double periOfRectangle(double l, double b){
     return 2*(l+b);
}
    public static double areaOfRectangle(double l, double b){
     return l*b;
}
    public static double periOfTriangle(double s1, double s2, double s3){
     return s1+s2+s3;
}
    public static double areaOfTriangle(double s1, double s2, double s3){
     double s=(s1+s2+s3)/2;
     return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
}
     
    
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
      while(true){
          System.out.println("Choose one of the below shapes");
          System.out.println("1.Circle " + '\n' +"2.Square " + '\n' +"3.Rectangle " + '\n' + "4.Triangle");
          int a=sc.nextInt();
          switch(a){
              case 1:
                  while(true){
                      System.out.println("Enter the radius of the circle");
                      double radius=sc.nextDouble();
                      System.out.println("1.Perimeter" + '\n' +"2.Area ");
                      int b=sc.nextInt();
                      switch(b){
                          case 1:System.out.println("Perimeter =" +periOfCircle(radius));
                          break;
                          case 2:System.out.println("Area =" +areaOfCircle(radius));
                          break;
                      }
                     break; 
                  }
                  break;
              case 2:
                  while(true){
                      System.out.println("Enter the side of the square");
                      double side=sc.nextDouble();
                      System.out.println("1.Perimeter" + '\n' +"2.Area ");
                      int b=sc.nextInt();
                      switch(b){
                          case 1:System.out.println("Perimeter =" +periOfSquare(side));
                          break;
                          case 2:System.out.println("Area =" +areaOfSquare(side));
                          break;
                      }
                      break;
                  }
                     break;
              case 3:
                  while(true){
                      System.out.println("Enter the length and breadth of the rectangle");
                      double length=sc.nextDouble();
                      double breadth=sc.nextDouble();
                      System.out.println("1.Perimeter" + '\n' +"2.Area ");
                      int b=sc.nextInt();
                      switch(b){
                          case 1:System.out.println("Perimeter =" +periOfRectangle(length, breadth));
                          break;
                          case 2:System.out.println("Area =" +areaOfRectangle(length, breadth));
                          break;
                      }
                      break;
                  }
                     break;
              case 4:
                  while(true){
                      System.out.println("Enter the 3 sides of the triangle");
                      double side1=sc.nextDouble();
                      double side2=sc.nextDouble();
                      double side3=sc.nextDouble();
                      System.out.println("1.Perimeter" + '\n' +"2.Area ");
                      int b=sc.nextInt();
                      switch(b){
                          case 1:System.out.println("Perimeter =" +periOfTriangle(side1, side2, side3));
                          break;
                          case 2:System.out.println("Area =" +areaOfTriangle(side1, side2, side3));
                          break;
                      }
                      break;
                  }
                     break;
                  
          }
        break;  
      }
    }
}