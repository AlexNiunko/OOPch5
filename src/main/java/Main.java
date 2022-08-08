import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       ArrayList<Shape>list=new ArrayList<>();
       Circle circle=new Circle(1,1,2);
       Triangle triangle=new Triangle(1,1,4,4,4);
       list.add(circle);
       list.add(triangle);
        for (Shape shape:list) {
            shape.draw();
        }
    }
}
