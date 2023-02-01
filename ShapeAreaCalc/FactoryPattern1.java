interface Figure {
    double area(int l, int b, int r);
}
class Rectangle implements Figure {
    @Override
    public double area(int l, int b, int r) {
        return l*b;
    }
}
class Triangle implements Figure {
    @Override
    public double area(int l, int b, int r) {
        return l + b / 2;
    }
}
class Circle implements Figure {
    @Override
    public double area(int l,int b,int r) {

        double pi = 3.14;

        return pi * r * r;
    }
}
class Factfig {
    Figure getFigure(int n) {
        if (n == 1) {
            return new Rectangle();
        }
        else if (n == 2) {
            return new Triangle();
        }
        else if (n == 3) {
            return new Circle();
        }
        else {
            return null;
        }
    }
}
class FactoryPattern1 {
    public static void main(String[] args) {
        Figure fig;
        Factfig ff=new Factfig();
        fig = ff.getFigure(1);
        double ar = fig.area(10, 10, 0);
        System.out.println("Area of rectangle= " + ar);
        fig = ff.getFigure(2);
        double ar2 = fig.area(10, 10, 0);
        System.out.println("Area of triangle= " + ar2);
        fig = ff.getFigure(3);
        double ar3 = fig.area(0, 0, 10);
        System.out.println("Area of circle= " + ar3);
    }
}
