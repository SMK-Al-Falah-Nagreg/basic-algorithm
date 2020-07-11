import java.util.*;

public class Main {

  private static Scanner in;

  public static void main(String[] args) {
    // Scanner Init
    initScanner();

    // println("Day 1 : Odd Number");
    // oddNumber();

    // nextLine();

    // println("Day 4 : Pyramid");
    // pyramid();

    // nextLine();

    // println("Day 5 : Countdown");
    // countDown();

    // nextLine();

    // println("Day 6 : Exponent");
    // exponent();

    // println("Day 7 : Factorial");
    // factorial();

    println("Day 9 : Six Checker");
    sixChecker();
  }

  private static int amountOfNumber = 0;

  private static void oddNumber() {
    try {
      println("Enter amount of numbers");
      amountOfNumber = in.nextInt();

      int[] arrOfNumbers = new int[amountOfNumber];

      for (int i = 0; i < amountOfNumber; i++) {
        int position = i + 1;
        println("Enter number #" + position);

        arrOfNumbers[i] = in.nextInt();
      }

      for (int num : arrOfNumbers) {
        if (num % 2 != 0) {
          print(num + " ");
        }
      }

      nextLine();
      nextLine();

      println("Day 2 : Odd Number Count");
      countOddNumber(arrOfNumbers);

      nextLine();

      println("Day 3 : Sum Odd Number");
      sumOddNumber(arrOfNumbers);

      nextLine();
    } catch (Exception e) {
      e.printStackTrace();
      println("Please input number!");
    }
  }

  private static void countOddNumber(int[] arrOfNumbers) {
    int totalOddNumber = 0;

    for (int num : arrOfNumbers) {
      if (num % 2 != 0) {
        totalOddNumber += 1;
      }
    }
    println("Total Odd Number : " + totalOddNumber);
  }

  private static void sumOddNumber(int[] arrOfNumbers) {
    int sumTotalOddNumber = 0;
    for (int num : arrOfNumbers) {
      if (num % 2 != 0) {
        sumTotalOddNumber += num;
      }
    }
    println("Sum Total Odd Number : " + sumTotalOddNumber);
  }

  private static void pyramid() {
    try {
      println("Enter total rows : ");
      int row = in.nextInt();

      for (int i = 1; i <= row; i++) {
        for (int j = 0; j < i; j++) {
          print("*");
        }
        nextLine();
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void countDown() {
    nextLine();
    println("Enter limit : ");

    try {
      int limit = in.nextInt();
      if (limit < 2) {
        println("Limit minimum is 2!");
        countDown();
        return;
      }

      for (int i = limit; i > 0; i--) {
        print(i + " ");
      }

      nextLine();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void exponent() {
    try {
      println("Enter number :");
      int number = in.nextInt();

      println("Enter exponent :");
      int exponent = in.nextInt();

      int total = 1;
      for (int i = 0; i < exponent; i++) {
        total = total * number;
      }

      println("Result : " + total);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void factorial() {
    try {
      println("Enter number :");
      int number = in.nextInt();

      int result = 1;

      if (number > 0) {
        for (int i = number; i > 0; i--) {
          result = result * i;
        }
      } else if (number < 0) {
        println("Undefined. Factorial cannot be negative number!");
        return;
      }

      println("Factorial result : " + result);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static void sixChecker() {
    try {
      println("Enter number count : ");
      int numberCount = in.nextInt();

      if (numberCount <= 0) {
        println("Count number must not lower than 0 or zero!");
        sixChecker();
        return;
      }

      List<Integer> arrOfIntegers = new ArrayList<>();

      for (int i = 1; i <= numberCount; i++) {
        println("Enter " + ordinalSuffix(i) + " number : ");
        arrOfIntegers.add(in.nextInt());
      }

      if (arrOfIntegers.get(0) == 6 || arrOfIntegers.get(numberCount - 1) == 6) {
        println("Gotcha!!");
      } else {
        print("Not Gotcha!!");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static String ordinalSuffix(int num) {
    String numStr = "" + num;

    if (String.valueOf(numStr.charAt(numStr.length() - 1)) == "1") {
      return num + "st";
    }

    if (String.valueOf(numStr.charAt(numStr.length() - 1)) == "2") {
      return num + "nd";
    }

    if (String.valueOf(numStr.charAt(numStr.length() - 1)) == "3") {
      return num + "rd";
    }

    return num + "th";
  }

  private static void initScanner() {
    in = new Scanner(System.in);
  }

  private static void print(String message) {
    System.out.print(message);
  }

  private static void println(String message) {
    System.out.println(message);
  }

  private static void nextLine() {
    System.out.println();
  }
}
