public class app {
    public static void main(String[] args) {
        System.out.println("Hello World");
        BankAccount name1 = new BankAccount("123456789", "dam", 1000000);
        System.out.println(name1.getinfo());
        name1.deposit(100000);
        System.out.println(name1.getinfo());
        name1.withdraw(80000000);
        System.out.println(name1.getinfo());
    }
}
