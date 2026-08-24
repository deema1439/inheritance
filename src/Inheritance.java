public class Inheritance  {

    public static void main(String[] args) {

        //Deema Musaed Althagfi

        System.out.println("----------------------------------------");
        System.out.println("              Object1                   ");
        System.out.println("----------------------------------------");


        Shape s1=new Shape();
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.toString());


        System.out.println("----------------------------------------");
        System.out.println("              Object2                    ");
        System.out.println("----------------------------------------");



        Shape s2=new Shape("Red",false);
          s2.setColor("Red");
          System.out.println(s2.getColor());
          s2.setFilled(false);
          System.out.println(s2.isFilled());
        System.out.println(s2.toString());


        System.out.println("----------------------------------------");
        System.out.println("              Object3                    ");
        System.out.println("----------------------------------------");


        Shape s3=new Shape("blue",true);
        s3.setColor("blue");
        System.out.println(s3.getColor());
        s3.setFilled(true);
        System.out.println(s3.isFilled());
        System.out.println(s3.toString());


        System.out.println("----------------------------------------");
        System.out.println("              Object4                   ");
        System.out.println("----------------------------------------");

          Shape s4=new Shape("black",false);
          s4.setColor("black");
          System.out.println(s4.getColor());
          s4.setFilled(false);
          System.out.println(s4.isFilled());
        System.out.println(s4.toString());

        System.out.println("----------------------------------------");
        System.out.println("              Object5                   ");
        System.out.println("----------------------------------------");


          Shape s5=new Shape("yellow",true);
          s5.setColor("yellow");
          System.out.println(s5.getColor());
          s5.setFilled(true);
          System.out.println(s5.isFilled());
        System.out.println(s5.toString());


        System.out.println("---------------------------------------");
        System.out.println("               Class Circle            ");
        System.out.println("---------------------------------------");

        System.out.println("----------------------------------------");
        System.out.println("              Object1                   ");
        System.out.println("----------------------------------------");

        Circle c1=new Circle("green",true,3.2);
        c1.setColor("Green");
        System.out.println(c1.getColor());
        c1.setFilled(true);
        System.out.println(c1.isFilled());
        c1.setRadius(3.2);
        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.toString());

        System.out.println("----------------------------------------");
        System.out.println("              Object2                   ");
        System.out.println("----------------------------------------");
        Circle c2=new Circle("Red",false,7.5);
        c2.setColor("Red");
        System.out.println(c2.getColor());
        c2.setFilled(false);
        System.out.println(c2.isFilled());
        c2.setRadius(7.5);
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());
        System.out.println(c2.getPerimeter());
        System.out.println(c2.toString());

        System.out.println("----------------------------------------");
        System.out.println("              Object3                   ");
        System.out.println("----------------------------------------");
        Circle c3=new Circle("blue",true,12.8);
        c3.setColor("blue");
        System.out.println(c3.getColor());
        c3.setFilled(true);
        System.out.println(c3.isFilled());
        c3.setRadius(12.8);
        System.out.println(c3.getRadius());
        System.out.println(c3.getArea());
        System.out.println(c3.getPerimeter());
        System.out.println(c3.toString());
        System.out.println("----------------------------------------");
        System.out.println("              Object4                   ");
        System.out.println("----------------------------------------");

        Circle c4=new Circle("black",false,4.9);
        c4.setColor("black");
        System.out.println(c4.getColor());
        c4.setFilled(false);
        System.out.println(c4.isFilled());
        c4.setRadius(4.9);
        System.out.println(c4.getRadius());
        System.out.println(c4.getArea());
        System.out.println(c4.getPerimeter());
        System.out.println(c4.toString());

        System.out.println("----------------------------------------");
        System.out.println("              Object5                   ");
        System.out.println("----------------------------------------");

        Circle c5=new Circle("yellow",true,9.1);
        c5.setColor("yellow");
        System.out.println(c5.getColor());
        c5.setFilled(true);
        System.out.println(c5.isFilled());
        c5.setRadius(9.1);
        System.out.println(c5.getRadius());
        System.out.println(c5.getArea());
        System.out.println(c5.getPerimeter());
        System.out.println(c5.toString());





        System.out.println("----------------------------------------");
        System.out.println("              Class Rectangle            ");
        System.out.println("----------------------------------------");

        System.out.println("----------------------------------------");
        System.out.println("              Object1                   ");
        System.out.println("----------------------------------------");

        Rectangle r1=new Rectangle("green",true,5.4,6.8);
        r1.setColor("green");
        System.out.println(r1.getColor());
        r1.setFilled(true);
        System.out.println(r1.isFilled());
        r1.setWidth(5.4);
        System.out.println(r1.getWidth());
        r1.setLength(6.8);
        System.out.println(r1.getLength());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.toString());

        System.out.println("----------------------------------------");
        System.out.println("              Object2                   ");
        System.out.println("----------------------------------------");

        Rectangle r2=new Rectangle("red",false,11.2,14.3);
        r2.setColor("red");
        System.out.println(r2.getColor());
        r2.setFilled(false);
        System.out.println(r2.isFilled());
        r2.setWidth(11.2);
        System.out.println(r2.getWidth());
        r2.setLength(14.3);
        System.out.println(r2.getLength());
        System.out.println(r2.getArea());
        System.out.println(r2.getPerimeter());
        System.out.println(r2.toString());

        System.out.println("----------------------------------------");
        System.out.println("              Object3                   ");
        System.out.println("----------------------------------------");

        Rectangle r3=new Rectangle("blue",true,8.7,9.5);
        r3.setColor("blue");
        System.out.println(r3.getColor());
        r3.setFilled(true);
        System.out.println(r3.isFilled());
        r3.setWidth(8.7);
        System.out.println(r3.getWidth());
        r3.setLength(9.5);
        System.out.println(r3.getLength());
        System.out.println(r3.getArea());
        System.out.println(r3.getPerimeter());
        System.out.println(r3.toString());

        System.out.println("----------------------------------------");
        System.out.println("              Object4                   ");
        System.out.println("----------------------------------------");

        Rectangle r4=new Rectangle("black",false,15.9,20.1);
        r4.setColor("black");
        System.out.println(r4.getColor());
        r4.setFilled(false);
        System.out.println(r4.isFilled());
        r4.setWidth(15.9);
        System.out.println(r4.getWidth());
        r4.setLength(20.1);
        System.out.println(r4.getLength());
        System.out.println(r4.getArea());
        System.out.println(r4.getPerimeter());
        System.out.println(r4.toString());

        System.out.println("----------------------------------------");
        System.out.println("              Object5                   ");
        System.out.println("----------------------------------------");

        Rectangle r5=new Rectangle("yellow",true,3.6,4.7);
        r5.setColor("yellow");
        System.out.println(r5.getColor());
        r5.setFilled(true);
        System.out.println(r5.isFilled());
        r5.setWidth(3.6);
        System.out.println(r5.getWidth());
        r5.setLength(4.7);
        System.out.println(r5.getLength());
        System.out.println(r5.getArea());
        System.out.println(r5.getPerimeter());
        System.out.println(r5.toString());

        System.out.println("----------------------------------------");
        System.out.println("              Class Square              ");
        System.out.println("----------------------------------------");

        System.out.println("----------------------------------------");
        System.out.println("              Object1                   ");
        System.out.println("----------------------------------------");

        Square q1 =new Square("green",true,5.4);
        q1.setColor("green");
        System.out.println(q1.getColor());
        q1.setFilled(true);
        System.out.println(q1.isFilled());
        q1.setSide(5.4);
        System.out.println(q1.getSide());
        System.out.println(q1.toString());

        System.out.println("----------------------------------------");
        System.out.println("              Object2                   ");
        System.out.println("----------------------------------------");


        Square q2 =new Square("red",false,11.2);
        q2.setColor("red");
        System.out.println(q2.getColor());
        q2.setFilled(false);
        System.out.println(q2.isFilled());
        q2.setSide(11.2);
        System.out.println(q2.getSide());
        System.out.println(q2.toString());


        System.out.println("----------------------------------------");
        System.out.println("              Object3                   ");
        System.out.println("----------------------------------------");




        Square q3 =new Square("blue",true,8.7);
        q3.setColor("blue");
        System.out.println(q3.getColor());
        q3.setFilled(true);
        System.out.println(q3.isFilled());
        q3.setSide(8.7);
        System.out.println(q3.getSide());
        System.out.println(q3.toString());


        System.out.println("----------------------------------------");
        System.out.println("              Object4                   ");
        System.out.println("----------------------------------------");



        Square q4 =new Square("black",false,15.9);
        q4.setColor("black");
        System.out.println(q4.getColor());
        q4.setFilled(false);
        System.out.println(q4.isFilled());
        q4.setSide(15.9);
        System.out.println(q4.getSide());
        System.out.println(q4.toString());



        System.out.println("----------------------------------------");
        System.out.println("              Object5                   ");
        System.out.println("----------------------------------------");


        Square q5 =new Square("yellow",true,3.6);
        q5.setColor("yellow");
        System.out.println(q5.getColor());
        q5.setFilled(true);
        System.out.println(q5.isFilled());
        q5.setSide(3.6);
        System.out.println(q5.getSide());
        System.out.println(q5.toString());














































































































































    }
}
