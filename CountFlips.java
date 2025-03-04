public class CountFlips {
  public static void main(String[] args) {
    Coin flippingCoin = new Coin();
    int totalHeads = 0;
    int totalTails = 0;

    for (int flipNumber = 1; flipNumber < 101; flipNumber++) {
      flippingCoin.flip();
      if (flippingCoin.isHeads()) {
        ++totalHeads;
      } else {
        ++totalTails;
      }
    }

    System.out.println();

    System.out.println("The number of heads is " + totalHeads);
    System.out.println("The number of tails is " + totalTails);

    System.out.println();
  }
}
