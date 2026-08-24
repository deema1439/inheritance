public class Rectangle extends Shape {
    private double width=1.0;
    private double length=1.0;
    public Rectangle(String color,boolean filled,double width,double length){
        super(color,filled);
        this.length=length;
        this.width=width;
    }

    public Rectangle() {

    }

    public void setWidth(double width){
        this.width=width;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return 2*(width*length);
    }
    public String toString() {
        return "a Rectangle with width="+width+" and length=" +length+ " which is a subclass of " + super.toString();
    }







































}
