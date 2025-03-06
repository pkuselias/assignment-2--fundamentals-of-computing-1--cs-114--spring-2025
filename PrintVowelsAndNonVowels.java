import java.util.Scanner;

public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println();
    System.out.println("Please enter any string: ");

    String userString = scan.nextLine();

    System.out.println();

    int smallA = 0, smallE = 0, smallI = 0, smallO = 0, smallU = 0, nonVowels = 0; //Create counter for each small vowel

    for (int i = 0; i < userString.length(); i++) {
      char stringCharacter = userString.charAt(i); //Individually check each character of user's string
      switch (stringCharacter) {
        case 'a':
          ++smallA;

          break;

        case 'e':
          ++smallE;

          break;

        case 'i':
          ++smallI;

          break;

        case 'o':
          ++smallO;

          break;

        case 'u':
          ++smallU;

          break;

        default:
          String consonants = "BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxYyZz";
          for (int index = 0; index < consonants.length(); index++) {
            if (stringCharacter == consonants.charAt(index)) {
              nonVowels++;
            }
          }
      }
    }

    System.out.printf("a: %s%ne: %s%ni: %s%no: %s%nu: %s%n", smallA, smallE, smallI, smallO, smallU);

    System.out.println("Number of non-vowel characters: " + nonVowels);

    System.out.println();

    scan.close();
  }
}
