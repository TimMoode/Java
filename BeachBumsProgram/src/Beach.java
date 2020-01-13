import java.text.DecimalFormat;

//Constructors, Getters, Setters, all that good stuff
//Author Timothy Alec Moode
//Date - Late 2019 Maybe Early 2020
public class Beach {
    static final private double TAX_RATE = 0.055;
    private String beachName;
    private int snowQuantity;
    private double snowPrice;
    private int cornQuantity;
    private double cornPrice;
    private double subtotal;
    private double taxAmount;
    private double grandTotal;

    /**
     * Default Constructor
     */
    public Beach() {
        this.beachName = "Mission";
        this.snowQuantity = 9;
        this.snowPrice = 1.99;
        this.cornQuantity = 6;
        this.cornPrice = 0.99;
    }

    /**
     * Overloaded Constructor
     * @param beachName
     * @param snowQuantity
     * @param snowPrice
     * @param cornQuantity
     * @param cornPrice
     */
    public Beach(String beachName, int snowQuantity, double snowPrice, int cornQuantity, double cornPrice) {
        this.setBeachName(beachName);
        this.setSnowQuantity(snowQuantity);
        this.setSnowPrice(snowPrice);
        this.setCornQuantity(cornQuantity);
        this.setCornPrice(cornPrice);
    }

    //getters and setters
    public String getBeachName(){
        return beachName;
    }

    public int getSnowQuantity() {
        return snowQuantity;
    }

    public double getSnowPrice() {
        return snowPrice;
    }

    public int getCornQuantity() {
        return cornQuantity;
    }

    public double getCornPrice() {
        return cornPrice;
    }

    public void setBeachName(String beachName) {
        this.beachName = beachName;
    }

    public void setSnowQuantity(int snowQuantity) {
        this.snowQuantity = snowQuantity;
    }

    public void setSnowPrice(double snowPrice) {
        this.snowPrice = snowPrice;
    }

    public void setCornQuantity(int cornQuantity) {
        this.cornQuantity = cornQuantity;
    }

    public void setCornPrice(double cornPrice) {
        this.cornPrice = cornPrice;
    }

    public void calcs() {
        //im not sure if i did these calculations the way that was intended
        //but it works
        subtotal = (getCornPrice() * getCornQuantity()) + (getSnowPrice() * getSnowQuantity());
        taxAmount = subtotal * TAX_RATE;
        grandTotal = subtotal + taxAmount;
    }

    public String toString() {
        //formatting what needs to be formatted
        String pattern = "$#,###.00";
        DecimalFormat moneyFormat = new DecimalFormat(pattern);
         String oSnowPrice = moneyFormat.format(getSnowPrice());
         String oCornPrice = moneyFormat.format(getCornPrice());
         String oSubtotal = moneyFormat.format(subtotal);
         String oTax = moneyFormat.format(taxAmount);
         String oTotal = moneyFormat.format(grandTotal);
        return "Beach Name: " + getBeachName() + "\nAmount of Snowcones Purchased: " + getSnowQuantity() +
                "\nPrice of an Individual Snowcone: " + oSnowPrice + "\nAmount of Corndogs Purchased: " +
                getCornQuantity() + "\nPrice of Individual Corndog: " + oCornPrice +
                "\nSubtotal: " + oSubtotal + "\nTax: " + oTax + "\nGrand Total: " + oTotal;
    }
}
