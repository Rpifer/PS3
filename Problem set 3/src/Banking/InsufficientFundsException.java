package Banking;

@SuppressWarnings("serial")
public class InsufficientFundsException extends Exception {
	private double amount;

	public InsufficientFundsException(double amount){
		super("Not enough funds! Need :$" + amount);
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}
}
