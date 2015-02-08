/* Gabe Lafontant glafonta@gmail.com
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Cartesian {
  public static void  main(String[] args) {

    int x, y, z;
    double theta, phi, rho, root;

    Scanner scan = new Scanner(System.in);

    System.out.println("This is Spherical World a text-based calculator. Please enter some coordinates.");

    System.out.print("Enter an X-coordinate: ");
    x = scan.nextInt();

    System.out.print("Enter an Y-coordinate: ");
    y = scan.nextInt();

    System.out.print("Enter an Z-coordinate: ");
    z = scan.nextInt();


    root = Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2);
    
    rho = Math.sqrt(root);

    theta = Math.toDegrees(Math.acos(z / rho));

    phi = Math.toDegrees(Math.atan((double)y / x));

    DecimalFormat fmt = new DecimalFormat("0.##");

    System.out.println("Here are the corresponding spherical coordinates: ");

    System.out.println("Rho: " + fmt.format(rho));
    
    System.out.println("Theta: " + fmt.format(theta));
    
    System.out.println("Phi: " + fmt.format(phi));


  }
}