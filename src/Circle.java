public class Circle extends Shape {
 private double radius;
    public Circle() {
        super();
        radius = 1.0;
    }
 public Circle(String color,boolean filed,double radius){
     super(color,filed);
     this.radius=radius;
 }
 public void setRadius(double radius){
     this.radius=radius;
 }

 public double getRadius(){
     return radius;
 }

 public double getArea(){
     return 3.14*(radius*radius);
 }

 public double getPerimeter(){
     return 2*3.14*radius;
 }
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }





































}
