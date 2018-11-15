public class account {
	
	private double balance;
	private int acntNum;
	private user acntOwner;
	private int pin;
	
	
	// Getters
	public double getBalance() {
		return balance;
	}
	
	public int getAcntNum() {
		return acntNum;
	}
	
	public user getAcntOwner() {
		return acntOwner;
	}
	
	public int getPin() {
		return pin;
	}
	
	//Setters
	public account(double bal, int num, user owner, int pinNum) {
		balance = bal;
		acntNum = num;
		acntOwner = owner;
		pin = pinNum;
		return;
	}
	
	public void setBalance(double value) {
		balance = value;
		return;
	}
	
	public void setAcntNum(int value) {
		acntNum = value;
		return;
	}
	
	public void setAcntOwner(user owner) {
		acntOwner = owner;
		return;
	}
	
	public void setPin(int pinNum) {
		pin = pinNum;
		return;
	}
	
	// Other
	public void withdraw(double value) {
		balance -= value;
		
		System.out.printf("Amount withdrawn: $%.2f\nAccount Balance: $%.2f\n\n", value, getBalance());
		return;
	}
	
	public void deposit(double value) {
		balance += value;
		
		System.out.printf("Amount deposited: $%.2f\nAccount Balance: $%.2f\n\n", value, getBalance());
		return;
	}
}