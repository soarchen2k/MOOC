package monor.week05.exercise087_ApartmentComparison;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getPricePerSquareMeter() {
        return pricePerSquareMeter;
    }

    public void setPricePerSquareMeter(int pricePerSquareMeter) {
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment) {
        return this.getSquareMeters() > otherApartment.getSquareMeters();
    }

    public int priceDifference(Apartment otherApartment) {
        // Math.abs returns the absolute value
        return Math.abs(this.totalPrice() - otherApartment.totalPrice());
//        return this.totalPrice() > otherApartment.totalPrice() ? this.totalPrice() - otherApartment.totalPrice()
//                : otherApartment.totalPrice() - this.totalPrice();
    }

    public int totalPrice() {
        return this.pricePerSquareMeter * this.squareMeters;
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        return this.totalPrice() > otherApartment.totalPrice();
    }
}
