public class Main {
    public static void main(String[] args) {
        double creditCardBalance = 5000;
        double interestRate = 0.17;
        double interestDueMonth1;
        double interestDueMonth2;
        double totalBalanceMonth1;
        double totalBalanceMonth2;

        interestDueMonth1 = creditCardBalance * interestRate;
        totalBalanceMonth1 = creditCardBalance - interestDueMonth1;

        interestDueMonth2 = totalBalanceMonth1 * interestRate;
        totalBalanceMonth2 = totalBalanceMonth1 - interestDueMonth2;

        System.out.println("Your interest due Month 1: $" + interestDueMonth1);
        System.out.println("Your total balance in Month 1: $" + totalBalanceMonth1);

        System.out.println("Your interest due Month 2: $" + interestDueMonth2);
        System.out.println("Your total balance in Month 2: $" + totalBalanceMonth2);
    }
}