import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println();
    System.out.println("Enter the number of verses to be printed: ");
    int versesNumber = scan.nextInt();
    System.out.println();

    while (versesNumber < 1 || versesNumber > 100) {
      System.out.println("The input for the number of verses is invalid. Please re-enter a valid number of verses: ");
      versesNumber = scan.nextInt();
      System.out.println();
    }

    for(int i = 0; i < versesNumber; i++) {
      System.out.println((100-i) + " bottles of beer on the wall");
      System.out.println((100-i) + " bottles of beer");
      System.out.println("If one of those bottles should happen to fall");
      System.out.println((100-i-1) + " bottles of beer on the wall");
      System.out.println();
    }

    scan.close();
  }
}
