import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = formatName(aCustomer.getName());
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += formatRentalData(each);
        }
        //add footer lines
        result += addFooter(aCustomer);
        return result;
    }

    abstract String formatName(String name);
    abstract String formatRentalData(Rental movie);
    abstract String addFooter(Customer aCustomer);

}