import java.util.Enumeration;

public class HtmlStatement extends Statement {
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

    private String formatName(String name){
        return "<H1>Rentals for <EM>" + name +
                "</EM></H1><P>\n";
    }

    private String formatRentalData(Rental movie){
        return movie.getMovie().getTitle()+ ": " +
                String.valueOf(movie.getCharge()) + "<BR>\n";
    }

    private String addFooter(Customer aCustomer){
        return "<P>You owe <EM>" +
                String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" + "On this rental you earned <EM>" +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
    }
}