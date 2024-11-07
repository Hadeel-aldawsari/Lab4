public class Circle extends Shape{
   private double radius;



   Circle(){
   }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public void Circle(double c){

    }

    @Override
    public double calculateArea() {
        return 3.14*(radius*radius);
    }

    @Override
    public double calculateCircumference() {
        return (2*3.14)*radius;
    }
}
