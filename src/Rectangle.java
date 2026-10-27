import java.lang.Math;

public class Rectangle {
    //Attributes (private)
    private double length;
    private double width;

    //Constructor (public)
    public Rectangle(double l, double w){
        setLength(l);
        setWidth(w);
    }

    //Helper Methods (public)
    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*length + 2*width;
    }

    public double getDiagonal(){
        return Math.hypot(length, width);
    }

    public void setLength(double l){
        length = l;
    }

    public void setWidth(double w){
        width = w;
    }

    public void printRectangle(){
        System.out.printf("%-15s%7.2f\n","Length:", length);
        System.out.printf("%-15s%7.2f\n","Width:", width);
        System.out.printf("%-15s%7.2f\n","Area:", getArea());
        System.out.printf("%-15s%7.2f\n","Perimeter:", getPerimeter());
        System.out.printf("%-15s%7.2f\n","Diagonal:", getDiagonal());
    }
}
