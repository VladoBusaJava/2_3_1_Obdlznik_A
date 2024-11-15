package academy.metis.javabasics.lesson2.activity3.exercise1.part1.RectangleAreaTester.java;
import java.awt.*;

public class RectangleAreaTester {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.setSize(20,30);

        double obsah = printArea(rectangle);

        System.out.println("Ocakavana hodnota: 600");
        System.out.println("Vypocitana hodnota " + obsah);
        }


    public static double printArea(Rectangle rectangle) {
       double width =  rectangle.getWidth();
       double height = rectangle.getHeight();
        return width * height;





    }
}


