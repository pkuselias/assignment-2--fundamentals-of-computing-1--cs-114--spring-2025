import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number of verses to be printed: ");
    int versesNumber = scan.nextInt();
    scan.close();
    System.out.println();

    if (versesNumber > 0 && versesNumber < 101) {
      for(int i = 0; i < versesNumber; i++) {
        System.out.println((100-i) + " bottles of beer on the wall");
        System.out.println((100-i) + " bottles of beer");
        System.out.println("If one of those bottles should happen to fall");
        System.out.println((100-i-1) + " bottles of beer on the wall");
        System.out.println();
      }
    } else {
      System.out.println("The input for the number of verses is invalid.");
    }
  }
}
