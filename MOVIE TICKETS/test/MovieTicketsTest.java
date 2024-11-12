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
     * Test of CalculateTotalTicketPrice method, of class MovieTickets.
     */
    @Test
   void testCalculateTotalTicketPrice_CalculatedSuccessfully() {
        
        MovieTickets tickets = new MovieTickets("Napoleon", 100.0, 3);
        double result = tickets.CalculateTotalTicketPrice(3, 100.0);
        double expected = 342.0;
        assertEquals(expected, result, 0.01, "Total ticket price should be calculated correctly.");
    }

    /**
     * Test of ValidateData method, of class MovieTickets.
     */
    @Test
    void testValidateData_ValidData() {
        
        MovieTicketData validData = new MovieTicketData("Napoleon", 100.0, 3);
        MovieTickets tickets = new MovieTickets("Napoleon", 100.0, 3);
        boolean result = tickets.ValidateData(validData);
        assertTrue(result, "Validation should pass for valid data.");
    }

    /**
     * Test of getMovieName method, of class MovieTickets.
     */
    @Test
    void testValidateData_InvalidMovieName() {
        
        MovieTicketData invalidData = new MovieTicketData("", 100.0, 3); 
        MovieTickets tickets = new MovieTickets("", 100.0, 3);
        boolean result = tickets.ValidateData(invalidData);
        assertFalse(result, "Validation should fail for empty movie name.");
    }

    /**
     * Test of setMovieName method, of class MovieTickets.
     */
    @Test
    public void testSetMovieName()
    {
        System.out.println("setMovieName");
        String movieName = "";
        MovieTickets instance = null;
        instance.setMovieName(movieName);
  
    }

    /**
     * Test of getTicketPrice method, of class MovieTickets.
     */
    @Test
    void testValidateData_InvalidTicketPrice() {
        
        MovieTicketData invalidData = new MovieTicketData("Napoleon", -50.0, 3); 
        MovieTickets tickets = new MovieTickets("Napoleon", -50.0, 3);
        boolean result = tickets.ValidateData(invalidData);
        assertFalse(result, "Validation should fail for negative ticket price.");
    }
    /**
     * Test of getNumberOfTickets method, of class MovieTickets.
     */
    @Test
   void testValidateData_InvalidNumberOfTickets() {
        
        MovieTicketData invalidData = new MovieTicketData("Napoleon", 100.0, 0);
        MovieTickets tickets = new MovieTickets("Napoleon", 100.0, 0);
        boolean result = tickets.ValidateData(invalidData);
        assertFalse(result, "Validation should fail for zero number of tickets.");
    }

    private void assertEquals(double expected, double result, double d, String total_ticket_price_should_be_calculated_c)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertTrue(boolean result, String validation_should_pass_for_valid_data)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertFalse(boolean result, String validation_should_fail_for_empty_movie_na)
    {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
