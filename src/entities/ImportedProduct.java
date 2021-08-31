package entities;

public class ImportedProduct extends Product {

	private Double customsFee;

	public ImportedProduct(Double customsFee) {
		super();
		this.customsFee = customsFee;
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	// Methods
	public Double totalPrice() {
		return super.getPrice() + customsFee;
	}

	@Override
	public String priceTag() {
		return super.priceTag()+" (Customs fee: $ "+String.format("%.2f",totalPrice())+")";
	}
}
