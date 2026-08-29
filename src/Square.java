import java.lang.classfile.Superclass;

public class Square extends Rectangle {
    public Square(double width, double length) {
        super(width, length);
    }

    public Square(){
        super();
    }


    public Square (String color, boolean filled, double side){
        super(color,filled,side,side);
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    public double getSide(){
        return super.getLength();
    }

    public String toString(){
        return "the side of the square is= "+getSide()+" which is subclass of "+super.toString();
    }




















}
