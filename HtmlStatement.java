import java.util.Enumeration;

public class HtmlStatement extends Statement {

    public String formatName(String name){
        return "<H1>Rentals for <EM>" + name +
                "</EM></H1><P>\n";
    }

    public String formatRentalData(Rental movie){
        return movie.getMovie().getTitle()+ ": " +
                String.valueOf(movie.getCharge()) + "<BR>\n";
    }

    public String addFooter(Customer aCustomer){
        return "<P>You owe <EM>" +
                String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n" + "On this rental you earned <EM>" +
                String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
    }
}