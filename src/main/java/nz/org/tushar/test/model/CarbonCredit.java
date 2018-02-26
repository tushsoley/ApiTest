package nz.org.tushar.test.model;

import java.util.List;

public class CarbonCredit {
	private int CategoryId;
	private String Name;
	private String Path;
	private boolean CanListAuctions;
	private boolean CanListClassifieds;
	private boolean CanRelist;
	private String LegalNotice;
	private int DefaultDuration;
	private List<Integer> AllowedDurations;
	private Fees Fees;
	private int FreePhotoCount;
	private int MaximumPhotoCount;
	private boolean IsFreeToReList;
	private List<Promotions> Promotions;
	private List<String> EmbeddedContentOptions;
	private int MaximumTittleLength;
	private int AreaOfBusiness;
	private int DefaultReListDuration;
	
	public int getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPath() {
		return Path;
	}
	public void setPath(String path) {
		Path = path;
	}
	public boolean isCanListAuctions() {
		return CanListAuctions;
	}
	public void setCanListAuctions(boolean canListAuctions) {
		CanListAuctions = canListAuctions;
	}
	public boolean isCanListClassifieds() {
		return CanListClassifieds;
	}
	public void setCanListClassifieds(boolean canListClassifieds) {
		CanListClassifieds = canListClassifieds;
	}
	public boolean isCanReList() {
		return CanRelist;
	}
	public void setCanReList(boolean canReList) {
		CanRelist = canReList;
	}
	public String getLegalNotice() {
		return LegalNotice;
	}
	public void setLegalNotice(String legalNotice) {
		LegalNotice = legalNotice;
	}
	public int getDefaultDuration() {
		return DefaultDuration;
	}
	public void setDefaultDuration(int defaultDuration) {
		DefaultDuration = defaultDuration;
	}
	public List<Integer> getAllowedDurations() {
		return AllowedDurations;
	}
	public void setAllowedDurations(List<Integer> allowedDurations) {
		AllowedDurations = allowedDurations;
	}
	public Fees getFees() {
		return Fees;
	}
	public void setFees(Fees fees) {
		Fees = fees;
	}
	public int getFreePhotoCount() {
		return FreePhotoCount;
	}
	public void setFreePhotoCount(int freePhotoCount) {
		FreePhotoCount = freePhotoCount;
	}
	public int getMaximumPhotoCount() {
		return MaximumPhotoCount;
	}
	public void setMaximumPhotoCount(int maximumPhotoCount) {
		MaximumPhotoCount = maximumPhotoCount;
	}
	public boolean isIsFreeToReList() {
		return IsFreeToReList;
	}
	public void setIsFreeToReList(boolean isFreeToReList) {
		IsFreeToReList = isFreeToReList;
	}
	public List<Promotions> getPromotions() {
		return Promotions;
	}
	public void setPromotions(List<Promotions> promotions) {
		Promotions = promotions;
	}
	public List<String> getEmbeddedContentOptions() {
		return EmbeddedContentOptions;
	}
	public void setEmbeddedContentOptions(List<String> embeddedContentOptions) {
		EmbeddedContentOptions = embeddedContentOptions;
	}
	public int getMaximumTittleLength() {
		return MaximumTittleLength;
	}
	public void setMaximumTittleLength(int maximumTittleLength) {
		MaximumTittleLength = maximumTittleLength;
	}
	public int getAreaOfBusiness() {
		return AreaOfBusiness;
	}
	public void setAreaOfBusiness(int areaOfBusiness) {
		AreaOfBusiness = areaOfBusiness;
	}
	public int getDefaultReListDuration() {
		return DefaultReListDuration;
	}
	public void setDefaultReListDuration(int defaultReListDuration) {
		DefaultReListDuration = defaultReListDuration;
	}	
}
