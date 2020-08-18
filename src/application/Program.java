package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bank = new Bank(number, holder, initialDeposit);
		}
		else {
			bank = new Bank(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bank);
		
		while (response != 'e') {
		System.out.println();
		System.out.print("Enter d to deposit, w to wihtdraw or e to exit: ");
		response = sc.next().charAt(0);
		if (response == 'd') {
			System.out.print("Enter deposit value: ");
			double depositValue = sc.nextDouble();
			bank.deposit(depositValue);
			System.out.println();
			System.out.printf("Deposited: %.2f%n", depositValue);
			System.out.println(bank);
		}
		else if ( response == 'w'){
			System.out.println();
			System.out.println("Enter a withdraw value: ");
			double withDrawValue = sc.nextDouble();
			bank.withDraw(withDrawValue);
			System.out.println();
			System.out.printf("Withdraw: %.2f%n", withDrawValue);
			System.out.println(bank);
		} 
	}		
			System.out.println();
			System.out.println(bank);
			System.out.println();
			System.out.println("Thank you for using our bank");
		
		sc.close();
	}

}
