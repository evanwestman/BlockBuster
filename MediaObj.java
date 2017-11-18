
public abstract class MediaObj {
    
    // Fields
    public String name;
    public double rate;
    public Integer dateRented;
    public Integer dateDue;
    public Integer rentalPeriod;
    public Integer points;
    public Integer stock;
    
    // Constructors
    public MediaObj() {
        name = null;
        rate = 0.0;
        dateRented = null;
        dateDue = null;
        rentalPeriod = null;
        points = null;
        stock = null;
    }
    
    public MediaObj(String aName, double aRate, Integer aDateRented, Integer aDateDue, Integer aRentalPeriod,
                    Integer pointVal, Integer aStock) {
        name = aName;
        rate = aRate;
        dateRented = aDateRented;
        dateDue = aDateDue;
        rentalPeriod = aRentalPeriod;
        points = pointVal;
        stock = aStock;
    }
    
    // Setters
    public void setName(String aName) {
        name = aName;
    }
    public void setRate(double aRate) {
        rate = aRate;
    }
    public void setDateRented(Integer aDateRented) {
        dateRented = aDateRented;
    }
    public void setDateDue(Integer aDateDue) {
        dateDue = aDateDue;
    }
    
    public abstract void setRentalPeriod(Integer aRentalPeriod);
    
    public void setPoints(Integer pointVal) {
        points = pointVal;
    }
    public void setStock(Integer aStock) {
        stock = aStock;
    }
    
    // Getters
    public String getName() {
        return name;
    }
    public double getRate() {
        return rate;
    }
    public Integer getDateRented() {
        return dateRented;
    }
    public Integer getDateDue() {
        return dateDue;
    }
    public Integer getRentalPeriod() {
        return rentalPeriod;
    }
    
    public Integer getPoints() {
        return points;
    }
    public Integer getStock() {
        return stock;
    }
    
    // Methods
    public Boolean checkStock() {
        if (stock == 0) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public void incrementStock() {
        stock = stock + 1;
    }
    
    public void decrementStock() {
        stock = stock - 1;
    }
    
    public String printDateElement(Integer aDate) { //mmddyy
        StringBuilder str = new StringBuilder();
        
        int month = aDate / 100000;
        int day = (aDate - (month*100000)) / 100;
        int year = aDate - (month*100000) - (day*100);
        
        str.append(month + "/" + day + "/" + year);
        
        return str.toString();
    }
}
