public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    int day;
    String daySuffix;

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


  }
}
