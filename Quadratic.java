/*
  Gabe Lafontant glafonta@gmail.com
*/

import java.util.Scanner;
import java.text.DecimalFormat;


public class Quadratic {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter a value of A: ");

    int a = scan.nextInt();

    System.out.print("Enter a value of B: ");

    int b = scan.nextInt();

    System.out.print("Enter a value of C: ");

    int c = scan.nextInt();

    double root1 = 0;
    double root2 = 0;

    DecimalFormat fmt = new DecimalFormat("0.###");

    int discriminant = b * b - 4 * a * c;

    if (discriminant < 0) {
      System.out.println("No real-number solution exists");
    }

    else if (discriminant == 0) {
      root1 = -(double)b / (2 * (double)a);
      
      System.out.println("Solution is " + fmt.format(root1));

    }
    
    else {
      root1 = (-b - Math.sqrt(discriminant)) / (2 * a); 
      root2 = (-b + Math.sqrt(discriminant)) / (2 * a);


      System.out.println("Solutions are " + fmt.format(root1) + " and " + fmt.format(root2));
    }

  }

}

