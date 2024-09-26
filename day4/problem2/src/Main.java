 public class Main{
    public static void main(String[] args) {
        Bank account1 = new Bank("123456789", "Sitesh Kumar", 5000);

        account1.performTransaction(1000);

        account1.performTransaction(2000, true);

        account1.performTransaction("123456789", "987654321", 1500);

        account1.performTransaction();
    }
}