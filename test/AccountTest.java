import static java.lang.Thread.sleep;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AccountTest {

    private JTextField inputTest;
    
    public AccountTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

  
    /**
     * Test of randomMICR method, of class Account.
     */
    @Test
    public void testRandomMICR() {
        System.out.println("randomMICR");
        Account instance = new Account();
        instance.randomMICR();
        
       
    }

    /**
     * Test of randomPin method, of class Account.
     */
    @Test
    public void testRandomPin() {
        System.out.println("randomPin");
        Account instance = new Account();
        instance.randomPin();
      
    }

    /**
     * Test of Bal method, of class Account.
     */
    @Test
    public void testBal() {
        System.out.println("Bal");
        Account instance = new Account();
        instance.Bal();
      
        
    }

    /**
     * Test of main method, of class Account.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Account.main(args);
   
        
    }

}
