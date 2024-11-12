package movieticketsalesreport;

/**
 *
 * @author WiehanSmit ST10446545@vcconnect.edu.za ST10446545
 */
public interface IMovieTickets {
    int TotalMovieSales(int[] movieTicketSales);
    String TopMovie(String[] movies, int[] totalSales);
}
//-------------------------------- End of File ---------------------------------
