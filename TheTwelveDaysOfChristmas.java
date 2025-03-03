public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    int day;
    String daySuffix;

    for (day = 1; day < 13; day++) {
      switch (day) {
        case 1:
          daySuffix = day + "st";

          break;

        case 2:
         daySuffix = day + "nd";

         break;

       case 3:
         daySuffix = day + "rd";

         break;

        default:
         daySuffix = day + "th";
      }

      System.out.println("On the " + daySuffix + "day of Christmas my true love gave to me");

      }
    }
  }
}
