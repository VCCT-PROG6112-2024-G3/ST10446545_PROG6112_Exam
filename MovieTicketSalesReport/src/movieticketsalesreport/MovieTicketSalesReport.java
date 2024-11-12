package movieticketsalesreport;

/**
 *
 * @author WiehanSmit ST10446545@vcconnect.edu.za ST10446545
 */
public class MovieTicketSalesReport 
{
    public static void main(String[] args) 
    {
        //Movies
        String[] movies = {"Napoleon", "Oppenheimer"};
        //----------------------------------------------------------------------
        //Sales
        int[][] sales = {
            {3000, 1500, 1700},  //Nap
            {3500, 1200, 1600}   //Opp
        };
        //----------------------------------------------------------------------
        //Print report
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println("              JAN    FEB    MAR");
        System.out.println("-----------------------------------------");


        int[] totalSales = new int[movies.length];
        for (int i = 0; i < movies.length; i++) {
            System.out.printf("%-10s", movies[i]);
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%7d", sales[i][j]);
                totalSales[i] += sales[i][j];
            }
            System.out.println();
        }
        //----------------------------------------------------------------------
        //Print total sales
        System.out.println("\nTotal movie ticket sales for " + movies[0] + " " + totalSales[0]);
        System.out.println("Total movie ticket sales for " + movies[1] + " " + totalSales[1]);

        //Print the top performing movie
        String topMovie = totalSales[0] > totalSales[1] ? movies[0] : movies[1];
        System.out.println("\nTop performing movie: " + topMovie);
    }
}
//-------------------------------- End of File ---------------------------------
