package nz.org.tushar.test.model;

public class ListingFeeTiers {
	private int MinimumTierPrice;
	private int FixedFee;
	public int getMinimumTierPrice() {
		return MinimumTierPrice;
	}
	public void setMinimumTierPrice(int minimumTierPrice) {
		MinimumTierPrice = minimumTierPrice;
	}
	public int getFixedFee() {
		return FixedFee;
	}
	public void setFixedFee(int fixedFee) {
		FixedFee = fixedFee;
	}	
}
