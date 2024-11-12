/**
 *
 * @author WiehanSmit ST10446545@vcconnect.edu.za ST10446545
 */

public class MovieTicketData 
{
//Declarations    
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;
    //--------------------------------------------------------------------------
    //Constructor
    public MovieTicketData(String movieName, double ticketPrice, int numberOfTickets)
    {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }
    //--------------------------------------------------------------------------
    //Getters
    public String getMovieName() {
        return movieName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }
}
//-------------------------------- End of File ---------------------------------
