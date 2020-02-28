public class VendingMachine {
    public int changePort;
    public int money;
    private int stock;

    public void insetMoney(int money) {
        this.money += money;
    }

    public void purchase(String drink) {
        if (money == 10) {
            return;
        }
        this.changePort = this.money - 100;
        this.money = 0;
        stock -= 1;
    }

    public void addStock(String drink, int amount) {
        stock = amount;
    }

    public int showStock(String drink) {
        return stock;
    }
}
