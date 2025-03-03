import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of verses to be printed: ");
    int versesNumber = scan.nextInt();
    scan.close();

    if (versesNumber > 0 && versesNumber < 101) {

    } else {
      System.out.println("The input for the number of verses is invalid.");
    }
  }
}
