import java.util.Scanner;

public class ATM {

	private account acnt;
	
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		ATM atm = new ATM(new account(500, 12345, new user("Will", 1234567890, "Nowhere's Ville", 1234567890), 12345));
		
		// Credentials: Acnt Num: 12345, pin: 12345
		
		atm.login();
		
		atm.menu();
	}
	
	public ATM(account acnt) {
		this.acnt = acnt;
	}
	
	public void login() {
		int pin = acnt.getPin();
		int num = acnt.getAcntNum();
		
		System.out.print("Account Number: ");
		int inNum = input.nextInt();
		System.out.print("Pin Number: ");
		int inPin = input.nextInt();
		
		if (pin != inPin || num != inNum) {
			System.out.println("Incorrect Credentials\n");
			login();
		}
		return;
	}
	
	public void menu() {
		System.out.print("\n************************\n\nDeposit:      [1]\nWithdraw:     [2]\nView Balance: [3]\nExit:         [4]\n\nPlease choose an action: ");
		int response = (int) Math.round(input.nextDouble());
		System.out.print("\n");
		
		double balance = acnt.getBalance();
		double value;
		
		switch (response) {
			case 1:
				boolean gettingDeposit = true;
				do {
					System.out.print("Deposit Amount: ");
					value = input.nextDouble();
					if (value < 0) {
						System.out.println("Invalid value entered: " + value + "\n");
					} else {
						gettingDeposit = false;
					}
				} while (gettingDeposit);
				
				acnt.deposit(value);
				break;
			case 2:
				boolean gettingWithdraw = true;
				do {
					System.out.print("Withdraw Amount: ");
					value = input.nextDouble();
					if (value > balance) {
						System.out.println("Insufficient Funds.\nWithdrawl: " + value + "\nBalance: " + balance + "\n");
					} else if (value < 0) {
						System.out.println("Invalid value entered: " + value + "\n");
					} else {
						gettingWithdraw = false;
					}
				} while (gettingWithdraw);
				
				acnt.withdraw(value);
				break;
			case 3:
				System.out.printf("$%.2f\n\n", balance);
				break;
			case 4:
				System.out.println("Have a nice day");
				return;
			default:
				System.out.println("Invalid input\n");
				break;				
		}
		
		System.out.println("Continue: [ENTER]");
		input.nextLine();
		input.nextLine();
		
		menu();
	}	
}