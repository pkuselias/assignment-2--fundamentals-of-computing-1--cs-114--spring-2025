import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println();
    System.out.println("Please enter any string: ");

    String userString = scan.nextLine();

    System.out.println();

    int smallA = 0, smallE = 0, smallI = 0, smallO = 0, smallU = 0; //Create counter for each small vowel

    for (int i = 0; i < userString.length(); i++) {
      String stringCharacter = "" + userString.charAt(i); //Individually check each character of user's string
      if (stringCharacter.equals("a")) {
        ++smallA;
      }
      if (stringCharacter.equals("e")) {
        ++smallE;
      }
      if (stringCharacter.equals("i")) {
        ++smallI;
      }
      if (stringCharacter.equals("o")) {
        ++smallO;
      }
      if (stringCharacter.equals("u")) {
        ++smallU;
      }
    }

    System.out.printf("a: %s%ne: %s%ni: %s%no: %s%nu: %s%n", smallA, smallE, smallI, smallO, smallU);

    userString = userString.toLowerCase();

    userString = userString.replace("a", "");
    userString = userString.replace("e", "");
    userString = userString.replace("i", "");
    userString = userString.replace("o", "");
    userString = userString.replace("u", "");

    System.out.println("Number of non-lowercase-vowel characters: " + userString.length());

    System.out.println();

    scan.close();
  }
}
