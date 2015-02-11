/* 
  Gabe Lafontant glafonta@gmail.com
*/


import.java.Scanner;

public class BodyMassIndex {
  public static void main(String[] args) {

    double height, weight, bmi;

    Scanner scan = new Scanner(System.in);

    System.out.println("Hi, this program is a Body Mass Index converter.\n Please enter your height in inches and your weight in pounds.")
    
    System.out.print("Pleas enter your height: ")
    height = scan.nextDouble();

    Sytem.out.print("Pleas enter your weight: ")
    weight = scan.nextDouble();

    bmi = (weight * 703) / (Math.pow(height, 2));

    System.out.println(bmi);

    
  }
}