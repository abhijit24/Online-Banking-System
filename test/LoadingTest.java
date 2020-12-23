import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class LoadingTest {
    
    public LoadingTest() {
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
     * Test of setUpLoading method, of class Loading.
     */
    @Test
    public void testSetUpLoading() {
        System.out.println("setUpLoading");
        Loading instance = new Loading();
        instance.setUpLoading();
        
        
    }

    /**
     * Test of run method, of class Loading.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Loading instance = new Loading();
        instance.run();
        
        
    }

    /**
     * Test of main method, of class Loading.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Loading.main(args);
    
    }
    
}
