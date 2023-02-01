/*Write a Java program to create abstract class Car, with instance variable regno, Car constructor,
 concrete method fillTank(), abstract methods steering(int direction), braking(int force).
Create two subclasses Maruti and Santro to implements abstract methods in it. Create a AbstractDemo
 class to for testing.*/

abstract class Car {
    int regno;
    Car(int no) {
        regno = no;
}
    void fillTank() {
        System.out.println("👉Fill the tank! ⛽");
    }
    abstract void steering();
    abstract void breaks();
}
class Maruti extends Car {
    Maruti(int no) {
        super(no);
    }
    void steering() {
        System.out.println("👉Maruti has manual steering :/");
    }
    void breaks() {
        System.out.println("👉Maruti has hydraulic breaks :/");
    }
}
class Santro extends Car {
    Santro(int no) {
        super(no);
    }
    void steering() {
        System.out.println("👉Santro has power steering :)");
    }
    void breaks() {
        System.out.println("👉Santro has gas breaks :)");
    }
}
           //main class
public class AbstractDemo {
    public static void main(String[] args) {
        Maruti m = new Maruti(1234);
        Santro s = new Santro(7);
        s.fillTank();
        System.out.println("======Steering====== ");
        ((Car) m).steering();
        ((Car) s).steering();
        System.out.println("======Breaks======== ");
        ((Car) m).breaks();
        ((Car) s).breaks();
        System.out.println("==================== ");
        System.out.println("😁I'd Prefer Santro! 🚗");
    }
}
