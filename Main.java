import java.util.*;


public class Main {

  public static void main(String[] args) {
    System.out.println("Day 1 : Odd Number");
    oddNumber();
  }

  private static int amountOfNumber = 0;

  private static void oddNumber() {
    Scanner in = new Scanner(System.in);

    try {
      System.out.println("Enter amount of numbers");
      amountOfNumber = in.nextInt();

      int[] arrOfNumbers = new int[amountOfNumber];

      for (int i = 0; i < amountOfNumber; i++) {
        int position = i + 1;
        System.out.println("Enter number #" + position);

        arrOfNumbers[i] = in.nextInt();
      }

      for (int num : arrOfNumbers) {
        if (num % 2 != 0) {
          System.out.print(num + " ");
        }
      }

      System.out.println();
      System.out.println();

      System.out.println("Day 2 : Odd Number Count");
      countOddNumber(arrOfNumbers);

      System.out.println();

      System.out.println("Day 3 : Sum Odd Number");
      sumOddNumber(arrOfNumbers);

    } catch(Exception e) {
      e.printStackTrace();
      System.out.println("Please input number!");
    }
  }

  private static void countOddNumber(int[] arrOfNumbers) {
    int totalOddNumber = 0;

    for (int num : arrOfNumbers) {
      if (num % 2 != 0) {
        totalOddNumber += 1;
      }
    }
    System.out.println("Total Odd Number : " + totalOddNumber);
  }

  private static void sumOddNumber(int[] arrOfNumbers) {
    int sumTotalOddNumber = 0;
    for (int num : arrOfNumbers) {
      if (num % 2 != 0) {
        sumTotalOddNumber += num;
      }
    }
    System.out.println("Sum Total Odd Number : " + sumTotalOddNumber);

    pyramid();

  }

  private static void pyramid() {
    Scanner in = new Scanner(System.in);
    
    System.out.println();
    System.out.println("Enter total rows : ");

    try {
      System.out.println("Day 4 : Pyramid");
      int row = in.nextInt();

      for (int i = 1; i <= row; i++) {
        for (int j = 0; j < i; j++) {
          System.out.print("*");
        }
        System.out.println();
      }
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
