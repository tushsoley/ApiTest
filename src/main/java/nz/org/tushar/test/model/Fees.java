package nz.org.tushar.test.model;

import java.math.BigDecimal;
import java.util.List;

public class Fees {
	private BigDecimal Bundle;
	private BigDecimal EndDate;
	private BigDecimal Feature;
	private BigDecimal Gallery;
	private BigDecimal Listing;
	private BigDecimal Reserve;
	private BigDecimal Subtittle;
	private BigDecimal TenDays;
	private List<ListingFeeTiers> ListingFeeTiers;
	private BigDecimal SecondCategory;
	
	public BigDecimal getBundle() {
		return Bundle;
	}
	public void setBundle(BigDecimal bundle) {
		Bundle = bundle;
	}
	public BigDecimal getEndDate() {
		return EndDate;
	}
	public void setEndDate(BigDecimal endDate) {
		EndDate = endDate;
	}
	public BigDecimal getFeature() {
		return Feature;
	}
	public void setFeature(BigDecimal feature) {
		Feature = feature;
	}
	public BigDecimal getGallery() {
		return Gallery;
	}
	public void setGallery(BigDecimal gallery) {
		Gallery = gallery;
	}
	public BigDecimal getListing() {
		return Listing;
	}
	public void setListing(BigDecimal listing) {
		Listing = listing;
	}
	public BigDecimal getReserve() {
		return Reserve;
	}
	public void setReserve(BigDecimal reserve) {
		Reserve = reserve;
	}
	public BigDecimal getSubtittle() {
		return Subtittle;
	}
	public void setSubtittle(BigDecimal subtittle) {
		Subtittle = subtittle;
	}
	public BigDecimal getTenDays() {
		return TenDays;
	}
	public void setTenDays(BigDecimal tenDays) {
		TenDays = tenDays;
	}
	public List<ListingFeeTiers> getListingFeeTiers() {
		return ListingFeeTiers;
	}
	public void setListingFeeTiers(List<ListingFeeTiers> listingFeeTiers) {
		ListingFeeTiers = listingFeeTiers;
	}
	public BigDecimal getSecondCategory() {
		return SecondCategory;
	}
	public void setSecondCategory(BigDecimal secondCategory) {
		SecondCategory = secondCategory;
	}
	
}
