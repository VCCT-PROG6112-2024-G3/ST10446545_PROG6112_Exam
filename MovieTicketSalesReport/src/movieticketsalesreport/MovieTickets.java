package movieticketsalesreport;

/**
 *
 * @author WiehanSmit ST10446545@vcconnect.edu.za ST10446545
 */

public class MovieTickets implements IMovieTickets 
{
    //Method for TMS
    @Override
    public int TotalMovieSales(int[] movieTicketSales) 
    {
        int total = 0;
        for (int sales : movieTicketSales) {
            total += sales;
        }
        return total;
    }
    //--------------------------------------------------------------------------
    //Method for TM
    @Override
    public String TopMovie(String[] movies, int[] totalSales) 
    {
        int maxSales = totalSales[0];
        String topMovie = movies[0];
        for (int i = 1; i < movies.length; i++) {
            if (totalSales[i] > maxSales) {
                maxSales = totalSales[i];
                topMovie = movies[i];
            }
        }
        return topMovie;
    }
}
//-------------------------------- End of File ---------------------------------
