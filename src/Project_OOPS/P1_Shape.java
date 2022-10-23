package Project_OOPS;

public interface P1_Shape {
    void calculateArea(double a);
    void calculatePerimeter(double b);
}
class Circle implements P1_Shape{
    @Override
    public void calculateArea(double radius) {
        double AreaOfCircle = Math.PI*Math.pow(radius,2);
        System.out.println("Area of the Circle is "+AreaOfCircle);
    }
    @Override
    public void calculatePerimeter(double radius) {
        System.out.println("Circumference of the Circle "+2*Math.PI*radius);
    }
}
class Square implements P1_Shape{
    @Override
    public void calculateArea(double side){
        double AreaOfSquare= Math.pow(side,2);
        System.out.println("Area of the Square is "+AreaOfSquare);
    }
    @Override
    public void calculatePerimeter(double side) {
        double PerimeterOfSquare = side+side+side+side;
        System.out.println("Perimeter of the Square is "+PerimeterOfSquare);
    }
}
class ShapeTest{
    public static void main(String[] args){
        new Circle().calculateArea(2.5);
        new Circle().calculatePerimeter(3);
        new Square().calculateArea(2.5);
        new Square().calculatePerimeter(3);

        P1_Shape[] calculate = {new Circle(),new Square()};
        for(int i=0;i<calculate.length;i++){
           calculate[i].calculateArea(2.5);
           calculate[i].calculatePerimeter(3);
        }
    }
}