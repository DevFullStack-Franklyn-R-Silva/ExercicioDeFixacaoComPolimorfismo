package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

	public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date manuFacture;

	public UsedProduct(Date manuFacture) {
		super();
		this.manuFacture = manuFacture;
	}

	public UsedProduct(String name, Double price, Date manuFacture) {
		super(name, price);
		this.manuFacture = manuFacture;
	}

	public Date getManuFacture() {
		return manuFacture;
	}

	public void setManuFacture(Date manuFacture) {
		this.manuFacture = manuFacture;
	}

	// Methods
	@Override
	public String priceTag() {
		return super.priceTag() + " (Manufacture date: " + sdf.format(manuFacture) + ")";
	}

}
