package nz.org.tushar.test.model;

import java.math.BigDecimal;

public class Promotions {
	private int Id;
	private String Name;
	private String Description;
	private BigDecimal Price;
	private BigDecimal OriginalPrice;
	private boolean Recommended;
	private int MinimumPhotoCount;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public BigDecimal getPrice() {
		return Price;
	}
	public void setPrice(BigDecimal price) {
		Price = price;
	}
	public BigDecimal getOriginalPrice() {
		return OriginalPrice;
	}
	public void setOriginalPrice(BigDecimal originalPrice) {
		OriginalPrice = originalPrice;
	}
	public boolean isRecommended() {
		return Recommended;
	}
	public void setRecommended(boolean recommended) {
		Recommended = recommended;
	}
	public int getMinimumPhotoCount() {
		return MinimumPhotoCount;
	}
	public void setMinimumPhotoCount(int minimumPhotoCount) {
		MinimumPhotoCount = minimumPhotoCount;
	}	
}
