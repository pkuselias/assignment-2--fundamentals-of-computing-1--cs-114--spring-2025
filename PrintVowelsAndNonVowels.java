import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println();
    System.out.println("Please enter any string: ");

    System.out.println();

    String userString;
    userString = scan.nextLine();

    System.out.println();

    int stringLength = userString.length();

    int smallA = 0, smallE = 0, smallI = 0, smallO = 0, smallU = 0;

    for (int i = 0; i < stringLength; i++) {


    }

    System.out.printf("a: %s e: %s i: %s o: %s u: %s%n", smallA, smallE, smallI, smallO, smallU);



    String noSmallVowels = userString.replace("a", "");
    noSmallVowels = noSmallVowels.replace("e", "");
    noSmallVowels = noSmallVowels.replace("i", "");
    noSmallVowels = noSmallVowels.replace("o", "");
    noSmallVowels = noSmallVowels.replace("u", "");
    int noSmallVowelsLength = noSmallVowels.length();

    System.out.println("Number of non-lowercase-vowel characters: " + noSmallVowelsLength);

    System.out.println();

    scan.close();
  }
}
