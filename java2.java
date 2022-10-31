package javalap1;
class Shapes
{
public void area()
{
System.out.println("The formula for area of ");
}
}
class Triangle extends Shapes
{
public void area()
{
System.out.println("Triangle is 1⁄2 * base * height ");
}
}
class Circle extends Shapes{
public void area()
{
System.out.println("Circle is 3.14 * radius * radius ");
}
}
class sample
{
public static void main(String[] args) {
Shapes myShape = new Shapes(); // Create a Shapes object
Shapes myTriangle = new Triangle(); // Create a Triangle object
Shapes myCircle = new Circle(); // Create a Circle object
System.out.println("\n\n Inheritance and Polymorphism");
System.out.println("\n\n ************************ ");
myShape.area();
myTriangle.area();
myShape.area();
myCircle.area();
}
}