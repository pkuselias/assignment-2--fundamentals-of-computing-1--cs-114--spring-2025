public class CountFlips {
  public static void main(String[] args) {
    Coin flippingCoin = new Coin();
    int flipNumber = 1;
    int totalHeads = 0;
    int totalTails = 0;

    while (flipNumber < 101) {
      flippingCoin.flip();

      if (flippingCoin.isHeads()) {
        ++totalHeads;
      } else {
        ++totalTails;
      }

      flipNumber++;
    }

    System.out.println();

    System.out.println("The number of heads is " + totalHeads);
    System.out.println("The number of tails is " + totalTails);

    System.out.println();

  }
}
