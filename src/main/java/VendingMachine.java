public class VendingMachine {
    public int changePort;
    public int money;
    private int stock;

    public void insetMoney(int money) {
        this.money += money;
    }

    public void purchase(String drink) {
        if (money < 100) {
            return;
        }
        changePort = money - 100;
        money = 0;
        stock -= 1;
    }

    public void addStock(String drink, int amount) {
        stock = amount;
    }

    public int showStock(String drink) {
        return stock;
    }
}
