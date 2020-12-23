import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MyPageTest {
    
    public MyPageTest() {
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
     * Test of Calendar method, of class MyPage.
     */
    @Test
    public void testCalendar() {
        System.out.println("Calendar");
        MyPage instance = new MyPage();
        instance.Calendar();
       
        
    }

    /**
     * Test of Table1 method, of class MyPage.
     */
    @Test
    public void testTable1() {
        System.out.println("Table1");
        MyPage instance = new MyPage();
        instance.Table1();
      
    }

    /**
     * Test of Account method, of class MyPage.
     */
    @Test
    public void testAccount() {
        System.out.println("Account");
        MyPage instance = new MyPage();
        instance.Account();
      
        
    }

    /**
     * Test of TransferC method, of class MyPage.
     */
    @Test
    public void testTransferC() {
        System.out.println("TransferC");
        MyPage instance = new MyPage();
        instance.TransferC();
      
        
    }

    /**
     * Test of TransferD method, of class MyPage.
     */
    @Test
    public void testTransferD() {
        System.out.println("TransferD");
        MyPage instance = new MyPage();
        instance.TransferD();
       
        
    }

    /**
     * Test of main method, of class MyPage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MyPage.main(args);
       
        
    }
    
}
