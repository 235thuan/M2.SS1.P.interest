import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = 1.0;
        int month =1;
        double interest_rate = 1.0;
        System.out.println("Enter investment amount: ");
        money=input.nextDouble();
        System.out.println("Enter interest rate: ");
        interest_rate= input.nextDouble();
        System.out.println("Enter investing month: ");
        month= input.nextInt();

        double total_interest=0;
        for (int i =0; i<month; i++) {
            total_interest = money*(interest_rate/100)/12*3;
        }
        System.out.println("Total of interest: " + total_interest*month);
    }
}
