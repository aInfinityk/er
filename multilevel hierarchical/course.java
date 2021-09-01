class Amity {
    public void show() {
        System.out.println("Number of students in Amity is 1000\n\n");
    }
}

class EAS extends Amity {
public void show1(){
    System.out.println("Number of students in EAS is 500\n");
}
}

class CSE extends EAS {
public void show2(){
    System.out.println("Number of students in CSE is 300");
}
}

class ECE extends EAS {
public void show3(){
    System.out.println("Number of students in ECE in 100");
}
}

class MAE extends EAS {
public void show4(){
    System.out.println("Number of students in MAE is 100\n\n");
}
}

class MAS extends Amity {
public void show5(){
    System.out.println("Number of students in MAS is 500\n");
}
}

class MBA extends MAS {
public void show6(){
    System.out.println("Number of students in MBA is 250");
}
}

class BBA extends MAS {
public void show7(){
    System.out.println("Number of students in BBA is 250");
}
}

public class course extends Amity {
    public static void main(String args[]) {
CSE ob1= new CSE();
ECE ob2=new ECE();
MAE ob3=new MAE();
MBA ob4=new MBA();
BBA ob5=new BBA();
ob1.show();
ob1.show1();
ob1.show2();
ob2.show3();
ob3.show4();
ob4.show5();
ob4.show6();
ob5.show7();
    }
}
