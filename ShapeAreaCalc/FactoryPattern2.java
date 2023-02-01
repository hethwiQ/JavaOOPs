
interface shape {
    void draw();
}
class rectangle implements shape {
    public void draw() {
        System.out.println("I am a rectangle!!!");
    }
}
class Square implements shape{
    public void draw()
    {
        System.out.println("I am a Square!!!");
    }
}
class circle implements shape{
    public void draw() {
        System.out.println("I am a circle!!!");
    }
}
class FactoryP1{
    shape getshape(int a ) {
        if(a==1) {
            return new rectangle();
        }
        else if(a==2) {
            return new Square();
        }
        else if(a==3) {
            return new circle();
        }
        else{
            return null;
        }
    }
}
class FactoryPattern2 {
    public static void main(String args[]) {
        FactoryP1 fac=new FactoryP1();
        shape sh;
        sh=fac.getshape(1);
        sh.draw();
        sh=fac.getshape(2);
        sh.draw();
        sh=fac.getshape(3);
        sh.draw();
    }
}
