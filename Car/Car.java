
Skip to content
Pull requests
Issues
Codespaces
Marketplace
Explore
@hethwiQ
hethwiQ /
JavaOOPs
Public

Cannot fork because you own this repository and are not a member of any organizations.

Code
Issues
Pull requests
Actions
Projects
Wiki
Security
Insights

    Settings

JavaOOPs/Car.java /
@hethwiQ
hethwiQ Create Car.java
Latest commit 8522535 Feb 1, 2023
History
1 contributor
54 lines (53 sloc) 1.54 KB
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
Footer
© 2023 GitHub, Inc.
Footer navigation

    Terms
    Privacy
    Security
    Status
    Docs
    Contact GitHub
    Pricing
    API
    Training
    Blog
    About

JavaOOPs/Car.java at main · hethwiQ/JavaOOPs
