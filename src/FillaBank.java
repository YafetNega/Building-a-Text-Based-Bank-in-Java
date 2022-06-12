import java.util.Scanner;

public class FillaBank {
    public static void main(String[] args){
        System.out.println("Bank Admin Menu");
        System.out.println("Please Enter a Menu Option");
        System.out.println("(1) Add Customer to Bank");
        System.out.println("(2) Change Customer Name");
        System.out.println("(3) Check Account Balance");
        System.out.println("(4) Modify Account Balance");
        System.out.println("(5) Summary of All Accounts");
        System.out.println("(-1) Quit");
        Scanner input = new Scanner(System.in);

        int size = 0;
        double[] accountBalances = new double[250];
        String[] accountNames = new String[250];

        int userInput = input.nextInt();

        if (userInput == 1){
            System.out.println("Bank Add Customer Menu");
            System.out.println("Please Enter an Account Balance: ");
            double balance = input.nextDouble();
            accountBalances[size] = balance;
            System.out.println("Please Enter the Account Name: ");
            input.nextLine();
            String name = input.nextLine();
            accountNames[size] = name;
            System.out.println("Customer ID is: " + size);
            size++;
        }else if (userInput == 2) {
            System.out.println("Bank Change Name Menu");
            System.out.println("Please Enter Customer ID: ");
            int customerId = input.nextInt();
            System.out.println("What is the customer's new name? ");
            input.nextLine();
            accountNames[customerId] = input.nextLine();
        }else if (userInput == 3) {
            System.out.println("Bank Check Account Balance Menu");
            System.out.println("Please Enter Customer ID: ");
            int customerId = input.nextInt();
            double balance = accountBalances[customerId];
            System.out.println("This customer has $ " + balance + " in their account.");

        }else if (userInput == 4) {
            System.out.println("Bank Modify Account Balance Menu");
            System.out.println("Please Enter Customer ID: ");
            int customerId = input.nextInt();
            System.out.println("Please enter the new balance");
            accountBalances[customerId] = input.nextDouble();
        }else if (userInput == 5) {
            System.out.println("Bank All Customer Summary Menu");
            double total = 0;
            for (int i = 0; i < size; i++){
                total = total + accountBalances[i];
            }
        }else if (userInput == -1) {

        }else {

        }


    }
}
