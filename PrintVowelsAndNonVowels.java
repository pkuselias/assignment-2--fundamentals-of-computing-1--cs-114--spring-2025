import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println();
    System.out.println("Please enter any string: ");

    String userString;
    userString = scan.nextLine();

    int stringLength = userString.length();

    String noSmallVowels = userString.replace("a", "");
    noSmallVowels = noSmallVowels.replace("e", "");
    noSmallVowels = noSmallVowels.replace("i", "");
    noSmallVowels = noSmallVowels.replace("o", "");
    noSmallVowels = noSmallVowels.replace("u", "");

    System.out.println();

    scan.close();
  }
}
