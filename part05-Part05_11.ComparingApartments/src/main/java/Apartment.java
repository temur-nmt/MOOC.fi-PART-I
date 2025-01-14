
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public int getSquares() {
        return squares;
    }

    public int getPricePerSquare() {
        return princePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.getSquares()) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        return Math.abs((this.squares * this.princePerSquare) - (compared.getPricePerSquare() * compared.getSquares()));
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if ((this.squares * this.princePerSquare) > (compared.getPricePerSquare() * compared.getSquares())) {
            return true;
        } else {
            return false;
        }
    }
}
