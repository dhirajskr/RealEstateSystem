
public class Sale {

	private String saleID;
	private String propertyAddress;
	private int currentOffer;
	private int reservePrice;
	private boolean acceptingOffers;
		
	public Sale(String saleID, String propertyAddress, int currentOffer, int reservePrice, boolean acceptingOffers) {
		this.saleID = saleID;
		this.propertyAddress = propertyAddress;
		this.currentOffer = currentOffer;
		this.reservePrice = reservePrice;
		this.acceptingOffers = acceptingOffers;
	}

	public String getSaleID() {
		return saleID;
	}

	public String getPropertyAddress() {
		return propertyAddress;
	}

	public int getCurrentOffer() {
		return currentOffer;
	}

	public int getReservePrice() {
		return reservePrice;
	}

	public boolean getAcceptingOffers() {
		return acceptingOffers;
	}

	public void setCurrentOffer(int currentOffer) {
		this.currentOffer = currentOffer;
	}

	public void setAcceptingOffers(boolean acceptingOffers) {
		this.acceptingOffers = acceptingOffers;
	}
	
	public boolean makeOffer(int offerPrice) {
		if((getAcceptingOffers() == false) || (offerPrice <= getCurrentOffer())) {
			return false;
		}
		else if(currentOffer >= reservePrice) {
			currentOffer = offerPrice;
			acceptingOffers = false;
			}
		
		return true;
		}
	
	public String getPropertyStatus() {
		if(getAcceptingOffers() == true) {
			return "ON SALE";
		} else 
			return "SOLD";
	}
	
	public String getSaleDetails() {
		String firstLine = String.format("%-20s %s\n", "Sale ID:", saleID);
		String secondLine = String.format("%-20s %s\n", "Property Address", propertyAddress);
		String thirdLine = String.format("%-20s %s\n", "Current Offer", currentOffer);
		String fourthLine = String.format("%-20s %s\n", "Reserve Price", reservePrice);
		String fifthLine = String.format("%-20s %s\n", "Accepting Offers", acceptingOffers);
		String sixthLine = String.format("%-20s %s\n", "Sale Status", getPropertyStatus());

		return firstLine + secondLine + thirdLine + fourthLine + fifthLine + sixthLine;


	}

}

