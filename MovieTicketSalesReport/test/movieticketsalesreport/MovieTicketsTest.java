
package movieticketsalesreport;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author WiehanSmit ST10446545@vcconnect.edu.za ST10446545
 */
public class MovieTicketsTest
{
    
    public MovieTicketsTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of TotalMovieSales method, of class MovieTickets.
     */
    @Test
     public void CalculateTotalSales_ReturnsExpectedTotalSales() 
     {
        MovieTickets movieTickets = new MovieTickets();
        int[] sales = {3000, 1500, 1700};
        int expectedTotal = 6200;
        assertEquals(expectedTotal, movieTickets.TotalMovieSales(sales));
    }

    /**
     * Test of TopMovie method, of class MovieTickets.
     */
    @Test
    public void TopMovieSales_ReturnsTopMovie() 
    {
        MovieTickets movieTickets = new MovieTickets();
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] totalSales = {6200, 6300};
        String expectedTopMovie = "Oppenheimer";
        assertEquals(expectedTopMovie, movieTickets.TopMovie(movies, totalSales));
    }
}