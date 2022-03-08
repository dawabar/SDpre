import java.util.Scanner;

public class Objective9Lab5 {

  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
        double num1, num2;
        boolean keepGoing = true;
        int choice;
        double answer = 0.0;

    System.out.print("Please enter a number: ");
    num1 = kb.nextDouble();
    System.out.print("Please enter another number: ");
    num2 = kb.nextDouble();

    while (keepGoing) {
        printMenu();
        System.out.print("Which would you like to do? ");
        choice = kb.nextInt();
        if (4 < choice || choice < 1) {
          System.out.println("Please choose a number 1-4");
        }

        switch (choice) {

          case 1:
            double sumResults = findSum(num1, num2);
            System.out.println("The sum of " + num1 + " and " + num2 + " is "
                                + sumResults);
            break;
          case 2:
            double averageResults = findAverage(num1, num2);
            System.out.println("The average of " + num1 + " and " + num2 + " is "
                                + averageResults);
            break;
          case 3:
            double taxResults = calcTax(num1, num2);
            System.out.println("The tax on the total of " + num1 + " and "
                                + num2 + " is " + taxResults);
            break;
          case 4:
            keepGoing = false;
            System.out.println("Goodbye");
            break;
        }
    }
    kb.close();
  }

  public static void printMenu() {
    System.out.println();
    System.out.println("======== MENU =========");
    System.out.println("|                     |");
    System.out.println("|   1. Add Numbers    |");
    System.out.println("|   2. Find Average   |");
    System.out.println("|   3. Calculate Tax  |");
    System.out.println("|   4. Exit Program   |");
    System.out.println("|                     |");
    System.out.println("=======================");
    System.out.println();

  }

  public static double findSum(double x, double y) {
    double sum = x + y;
    return sum;
  }

  public static double findAverage(double x, double y) {
    double total = findSum(x, y);
    double average = total / 2;
    return average;
  }

  public static double calcTax(double x, double y) {
    double total = findSum(x, y);
    double tax = total * 0.0831;
    return tax;
  }

}
