//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Test Circle
        System.out.println("*** Testing Circle *** ");
        Circle circle=new Circle(20);
        System.out.print("The Area of Circle with radius ("+circle.getRadius()+") is: ");
        System.out.printf("%,.2f\n",circle.calculateArea());
        System.out.print("The Circumference of Circle with radius ("+circle.getRadius()+") is: ");
        System.out.printf("%,.2f\n",circle.calculateCircumference());
        System.out.println(" ");

        //Test Rectangle
        System.out.println("*** Testing Rectangle *** ");
        Rectangle rectangle=new Rectangle(10,20);
        System.out.print("The Area of Rectangle with height ("+rectangle.getHeight()+")and width ("+rectangle.getWidth()+") is:");
        System.out.printf("%,.2f\n",rectangle.calculateArea());
        System.out.print("The perimeter of Rectangle with height ("+rectangle.getHeight()+")and width ("+rectangle.getWidth()+") is:");
        System.out.printf("%,.2f\n",rectangle.calculateCircumference());
        System.out.println(" ");

        //Test Triangle
        System.out.println("*** Testing Triangle *** ");
        Triangle triangle=new Triangle(27,27);
        System.out.print("The Area of Equilateral Triangle with height ("+triangle.getHeight()+")and base ("+triangle.getBase()+") is:");
        System.out.printf("%,.2f\n",triangle.calculateArea());
        System.out.print("The perimeter of Equilateral Triangle with height ("+triangle.getHeight()+") is:");
        System.out.printf("%,.2f\n",triangle.calculateCircumference());
        System.out.println(" ");

    }
}