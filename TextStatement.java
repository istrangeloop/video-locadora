import java.util.Enumeration;

public class TextStatement extends Statement {

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

        public String formatName(String name){
            return "Rental Record for " + name +
                    "\n";
        }

        public String formatRentalData(Rental movie){
            return "\t" + movie.getMovie().getTitle()+ "\t" +
                    String.valueOf(movie.getCharge()) + "\n";
        }

        public String addFooter(Customer aCustomer){
            return "Amount owed is " +
                    String.valueOf(aCustomer.getTotalCharge()) + "\n"
                    + "You earned " +
                    String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                    " frequent renter points";
        }
}