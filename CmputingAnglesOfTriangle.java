
package cmputinganglesoftriangle;

import java.util.Scanner;
    public class CmputingAnglesOfTriangle {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
    System.out.println("entere the cordinate of three point of triangle to comput the angles of triangle");
    System.out.println("enter the value of x1");
    double x1 = input.nextDouble();
    System.out.println("enter the value of y1");
    double y1 = input.nextDouble();
    System.out.println("enter the value of x2");
    double x2 = input.nextDouble();
    System.out.println("enter the value of y2");
    double y2 = input.nextDouble();
    System.out.println("enter the value of x3");
    double x3 = input.nextDouble();
    System.out.println("enter the value of y3");
    double y3 = input.nextDouble();
    double a = Math.sqrt(Math.pow((x3-x2), 2)+ Math.pow((y3-y2), 2));
    double b = Math.sqrt(Math.pow((x3-x1), 2)+ Math.pow((y3-y1), 2));
    double c = Math.sqrt(Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2));
    double B = Math.toDegrees( Math.acos((a*a+c*c-b*b)/(2*a*c)));
    double A = Math.toDegrees(Math.acos((b*b+c*c-a*a)/(2*b*c)));
    double C = Math.toDegrees(Math.acos((a*a+b*b-c*c)/(2*a*b)));
    System.out.println("three angles of this triangle is:\n"+ "A =" + A +"\n B =" + B +"\n C =" + C);
    }
    
}
