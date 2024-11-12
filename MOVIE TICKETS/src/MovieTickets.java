/**
 *
 * @author WiehanSmit ST10446545@vcconnect.edu.za ST10446545
 */

public class MovieTickets implements IMovieTickets {
    
    //Declarations
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;
    //--------------------------------------------------------------------------
    //Constructor
    public MovieTickets(String movieName, double ticketPrice, int numberOfTickets)
    {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }
    //--------------------------------------------------------------------------
    //Method to calculate ticket price
    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) 
    {
        double vatRate = 0.14;
        return numberOfTickets * ticketPrice * (1 + vatRate);
    }
    //--------------------------------------------------------------------------
    //Method to Validate the Data
    @Override
    public boolean ValidateData(MovieTicketData movieTicketData) 
    {
        return movieTicketData != null &&
               validateMovieName(movieTicketData.getMovieName()) &&
               validateTicketPrice(movieTicketData.getTicketPrice()) &&
               validateNumberOfTickets(movieTicketData.getNumberOfTickets());
    }
    //--------------------------------------------------------------------------
    //Movie Validation
    private boolean validateMovieName(String movieName) {
        return movieName != null && !movieName.trim().isEmpty();
    }
    //--------------------------------------------------------------------------
    //Ticket Validation
    private boolean validateTicketPrice(double ticketPrice) {
        return ticketPrice > 0;
    }
    //--------------------------------------------------------------------------
    //Amount of Ticket validation
    private boolean validateNumberOfTickets(int numberOfTickets) {
        return numberOfTickets > 0;
    }
    //--------------------------------------------------------------------------
    // Getters and Setters 
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
//-------------------------------- End of File ---------------------------------
