import com.shapes.*;
import com.shapes.Shapes;
import java.util.Scanner;

public class Main extends IllegalArgumentException {
    Circle circle = new Circle();
    Square square = new Square();
    Triangle triangle = new Triangle();
    Rectangle rectangle = new Rectangle();

    public static void main(String[] args) {
        System.out.println("What object do you want to create:");
        Scanner in = new Scanner(System.in);
        String shapeType = in.nextLine();

        try{
        Shapes myshape = Shapes.valueOf(shapeType.toUpperCase());
        switch(myshape){
            case CIRCLE:{
                Circle circle = new Circle();
                System.out.println("Circles perimeter:"+circle.calculatePerimeter());
                System.out.println("Circles area:"+circle.calculateArea());
                break;
            }
            case RECTANGLE:{
                Rectangle rectangle = new Rectangle();
                System.out.println("Rectangle perimeter:"+rectangle.calculatePerimeter());
                System.out.println("Rectangles area:"+rectangle.calculateArea());
                break;
            }
            case SQUARE:{
                Square square = new Square();
                System.out.println("Square perimeter:"+square.calculatePerimeter());
                System.out.println("Square area:"+square.calculateArea());
                break;
            }
            case TRIANGLE:{
                Triangle triangle = new Triangle();
                System.out.println("Triangle perimeter:"+triangle.calculatePerimeter());
                System.out.println("Triangle area:"+triangle.calculateArea());
                break;
            }
            }
        }catch(IllegalArgumentException e){
            System.out.println("There is not such shape");
        }

    }
}
