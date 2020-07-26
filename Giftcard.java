package assi;

public class Giftcard {

	private long cardNo;
	private double balence;
	private boolean active;
	
	public GiftCard(long cardNo, double balence, boolean active) {
		super();
		this.cardNo = cardNo;
		this.balence = balence;
		this.active = active;
	}
	
	public GiftCard() {
		// TODO Auto-generated constructor stub
	}

	
	public void rechargeCard(double amount) {
		if(this.active == true) {
			this.balence = this.balence + amount;
			System.out.println("The transaction is successful.");
			System.out.println("New Balence :"+ this.balence);
		}
		else {
			System.out.println("Sorry no transaction possible since account is not active");
		}
			
	}
	 public void swipeCard(double amount) {
		if(this.active== true) {
			this.balence = this.balence- amount;
			if(this.balence>0) {
				System.out.println("Amount to be withdrawn :"+amount);
				System.out.println("Existing balence in account :"+ this.balence);
				System.out.println("Transaction success");
			}
			else {
				System.out.println("Not sufficient funds to continue transaction.");
			}
		}
		else {
			System.out.println("Account not active");
			
			
		}
	 }

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public double getBalence() {
		return balence;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	

}

}
