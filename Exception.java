package Package;

public class BalanceException {
    public static void main(String[] args) {
        Bank a = new Bank(500);
        System.out.println(a.getBalance());
        a.withdraw(100);
        System.out.println(a.getBalance());
        a.withdraw(400);
        System.out.println(a.getBalance());
    }
}
