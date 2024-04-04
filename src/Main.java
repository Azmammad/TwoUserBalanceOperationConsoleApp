import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.print("Username : ");
            String username = sc.next();

            System.out.print("Password : ");
            sc.nextLine();
            String password = sc.nextLine();

            if (username.equals(usernameR) && password.equals(passwordR)) {
                userOpeartion(usernameR, balanceR, bankAccountR);
            } else if (username.equals(usernameE) && password.equals(passwordE)) {
                userOpeartion(usernameE, balanceE, bankAccountE);
            } else {
                System.out.println("Not found");
            }
        }
    }

    static Scanner sc = new Scanner(System.in);


    public static void userOpeartion(String username, double balance, String bankAccount) {
        while (true){
            System.out.println("Choose:" +
                    " \n1.Private office " +
                    " \n2.Withdraw amount" +
                    " \n3.Deposit amount" +
                    " \n4.Send amount" +
                    " \n5.Exit.");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(username + "\nBalance : " + balance + "\nBank account : " + bankAccount);
                    break;
                case 2:
                    System.out.println("How much do you want to withdraw?");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount <= balance && withdrawAmount > 0) {
                        balance -= withdrawAmount;
                        System.out.println("Successful. Your balance : " + balance + " AZN");
                    } else {
                        System.out.println("Please enter the amount correctly");
                    }
                    break;
                case 3:
                    System.out.println("Enter the amount you want to deposit");
                    double amount = sc.nextDouble();
                    balance += amount;
                    System.out.println("Successful. Your balance : " + balance + " AZN");
                    break;
                case 4:
                    if (username.equals(usernameR)) {
                        System.out.println("Enter the amount you want to send to Elvin: ");
                        double sendAmount = sc.nextDouble();
                        balance -= sendAmount;
                        balanceE += sendAmount;
                    } else if (username.equals(usernameE)) {
                        System.out.println("Enter the amount you want to send to Rauf: ");
                        double sendAmount = sc.nextDouble();
                        balance -= sendAmount;
                        balanceR += sendAmount;
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static String usernameR = "Rauf";
    static String passwordR = "12345";
    static double balanceR = 7600;
    static String bankAccountR = "4169 2587 4796 3512";

    static String usernameE = "Elvin";
    static String passwordE = "12345";
    static double balanceE = 5000;
    static String bankAccountE = "4169 2587 5521 4793";


}