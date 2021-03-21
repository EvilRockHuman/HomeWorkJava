package Task12;

public class Account {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.toString());
    }
    int id=10;
    String code = "'123-456-789'";
    int balance = 2000;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", code=" + code +
                ", balance=" + balance +
                '}';
    }
}
