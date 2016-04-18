public class CoinChange {

  int amount;
  int[] coins = {0.01, 0.02, 0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10, 10, 50};

  public void giveChange(double amount) {
    int onePenny = twoPence = fivePence = tenPence = twentyPence = fiftyPence = onePound = twoPounds = fivePounds = tenPounds = twentyPounds = fiftyPounds = 0;

  }

}

public static void main(String[] args) {
  CoinChange coinChange = new CoinChange;
  coinChange.giveChange(46.89);
}