package javalap3;
public interface
Circlel
{
double pi=3.14;
int r=5;
public void area();
}
//Circle1.java
// import area.*;
 class Circle1 implements
Circlel
{
int radius;
public Circle1(int r)
{
radius=r;
}
public void area()
{
System.out.println("Area of Circle:"+(pi*radius*radius));}
public static void main(String args[])
{
Circle1 ob1=new 
Circle1(5);
ob1.area();
} }