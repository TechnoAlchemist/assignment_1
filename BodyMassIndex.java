/* 
  Gabe Lafontant glafonta@gmail.com
*/


import java.util.Scanner;
import java.text.DecimalFormat;

public class BodyMassIndex {
  public static void main(String[] args) {

    double height, weight, bmi;

    Scanner scan = new Scanner(System.in);

    System.out.println("Hi, this program is a Body Mass Index converter.\n Please enter your height in inches and your weight in pounds.");
    
    System.out.print("Please enter your height: ");
    height = scan.nextDouble();

    System.out.print("Please enter your weight: ");
    weight = scan.nextDouble();

    bmi = (weight * 703) / (Math.pow(height, 2));

    DecimalFormat fmt = new DecimalFormat("0.#");


    if (bmi >= 30) {
      System.out.println("You're BMI is: " + fmt.format(bmi) + ". \nAccording to the Dept. of HHS, you are classfied as 'Obese'.");
    }
    else {
      if (bmi < 18.5) {
        System.out.println("You're BMI is: " + fmt.format(bmi) + ". \nAccording to the Dept. HHS, you are classfied as 'Underweight'."); 
       } 
      else if (bmi >= 18.5 && bmi <= 24.9) {
        System.out.println("You're BMI is: " + fmt.format(bmi) + ". \nAccording to the Dept. of HHS, you are classfied as 'Normal'.");
      }
      else if (bmi >= 25 && bmi <= 29.9) {
        System.out.println("You're BMI is: " + fmt.format(bmi) + ". \nAccording to the Dept. of HHS, you are classfied as 'Overweight'.");
      }

    }
    
  }
}