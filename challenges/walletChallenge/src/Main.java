class Wallet {

    float money;

   Wallet () {
        this.money = 2000;
    }

    Wallet (float money) {
        this.money = money;
    }


    public void addMoney (float amount) {
        this.money += amount;
    }

    public void removeMoney (float amount) {
        this.money -= amount;
    }

    public void printAmount (){
        System.out.println("Aktulna wartość portfela: " + this.money);
    }
}

public class Main {
    public static void main(String[] args) {

        Wallet wallet = new Wallet(3000);

        for(int i = 0; i<6; i++){
            wallet.addMoney(5000);
            wallet.removeMoney(2000);
            wallet.removeMoney(1000);
        }

        wallet.printAmount();

    }
}