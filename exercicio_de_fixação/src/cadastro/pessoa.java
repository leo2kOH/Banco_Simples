package cadastro;

import java.util.Locale;
import java.util.Scanner;

import Banco.Conta;

public class pessoa {

	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		
		
		System.out.print("Enter account number:");
		int number = sc.nextInt();
		System.out.print("Enter account holder:");
		String holder = sc.next();
		System.out.print("Is there na initial deposit (y/n)?");
		char x = sc.next().charAt(0);
		System.out.print("Enter initial deposit value:");
		double balance = sc.nextDouble();
		
		if(x == 'y') {
			System.out.print("Enter a deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new Conta(number, holder, initialDeposit);
		}
		else {
			conta = new Conta(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Enter a withdraw value:");
		double depositWithdraw = sc.nextDouble();
		conta.deposit(depositWithdraw);
		System.out.println("Updated account data:");
		System.out.println(conta);

		
		sc.close();
			
		}
	}
