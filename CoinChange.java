import java.math.BigDecimal;

public class CoinChange {

  public static void main(String[] args) {
    CoinChange coinChange = new CoinChange();
    coinChange.giveChange(3.56);
  }

  int onePenny = 0;
  int twoPence = 0;
  int fivePence = 0;
  int tenPence = 0;
  int twentyPence = 0;
  int fiftyPence = 0;
  int onePound = 0;

  public void giveChange(double amount) {

    System.out.printf("Amount: %s \n", amount);

    do {

      amount = Math.round(amount * 100.0)/100.0;

      while (amount >= 1 && amount < 5) {
        amount -= 1;
        onePound++;
      }

      while (amount >= 0.5 && amount < 1) {
        amount -= 0.5;
        fiftyPence++;
      }

      while (amount >= 0.2 && amount < 0.5) {
        amount -= 0.2;
        twentyPence++;
      }

      while (amount >= 0.1 && amount < 0.2) {
        amount -= 0.1;
        tenPence++;
      }

      while (amount >= 0.05 && amount < 0.1) {
        amount -= 0.05;
        fivePence++;
      }

      while (amount >= 0.02 && amount < 0.05) {
        amount -= 0.02;
        fivePence++;
      }

      while (amount >= 0.01 && amount < 0.02) {
        amount -= 0.01;
        onePenny++;
      }

    } while(amount > 0);

    this.printCoinChange();
  }

  public void printCoinChange() {
    System.out.printf("%s £1 coins \n", onePound);
    System.out.printf("%s £0.5 coins \n", fiftyPence);
    System.out.printf("%s £0.2 coins \n", twentyPence);
    System.out.printf("%s £0.1 coins \n", tenPence);
    System.out.printf("%s £0.05 coins \n", fivePence);
    System.out.printf("%s £0.02 coins \n", twoPence);
    System.out.printf("%s £0.01 coins \n", onePenny);
  }

}
