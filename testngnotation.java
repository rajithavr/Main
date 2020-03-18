import org.testng.annotations.*;

public class DummyTest {
    @BeforeSuite
    public void setup(){
        System.out.println("Setting up SuitLevel");
    }
    @BeforeTest
    public void setup1(){
        System.out.println("Setting up TestLevel");
    }
    @BeforeClass
    public void setup2(){
        System.out.println("Setting up ClassLevel");
    }
    @BeforeMethod
    public void setup3(){
        System.out.println("Setting up MethodLevel");
    }
    @Test
    public void testcase1(){
        System.out.println("This is TestCase 1");
    }
    @Test
    public void testcase2(){
        System.out.println("This is TestCase 2");
    }
    @Test
    public void loginWeb(){
        System.out.println("Student login through web");
    }
    @AfterTest
    public void tearDown1(){
        System.out.println("Destroying the Test");
    }
    @AfterClass
    public void tearDown2(){
        System.out.println("Destroying the Class");
    }
    @AfterMethod
    public void tearDown3(){
        System.out.println("Destroying the Method");
    }
    @AfterSuite
    public void tearDown(){
        System.out.println("Destroying the Suit");
    }
}