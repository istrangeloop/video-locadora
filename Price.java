public abstract class Price {
    public abstract int getPriceCode();
    public abstract double getCharge(int daysRented);
    //Adicionar o trecho de código extraído.
    //determine amounts for aRental line

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

}
