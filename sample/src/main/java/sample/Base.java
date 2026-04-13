//package sample;
//
//import org.openqa.selenium.WebDriver;
//
////@Listeners(com.orangehrm.seleniumuiframework.genericutility.ListenersImplementation.class)
//public class Base {
//    public WebDriver driver;
//    public WebDriverUtility webutility;
//    public FileUtility fileUtility;
//    public WebDriverWait wait;
//    public JavascriptExecutor js;
//
//    public LoginPage loginPage;
//    public Dashboard dashboardPage;
//    public ExcelUtility excelUtility = new ExcelUtility();
//
//    @BeforeClass
//    public void launchingBrowser() throws IOException {
//
//        fileUtility = new FileUtility();
//
//        String browser = fileUtility.getPropertyKeyValue("browser");
//
//        if (browser.equalsIgnoreCase("chrome")) {
//            driver = new ChromeDriver();
//        } else if (browser.equalsIgnoreCase("firefox")) {
//            driver = new FirefoxDriver();
//        } else if (browser.equalsIgnoreCase("edge")) {
//            driver = new EdgeDriver();
//        } else {
//            throw new RuntimeException("Invalid browser name in properties file");
//        }
//
//        webutility = new WebDriverUtility(driver);
//        webutility.configMaximizedBrowser();
//        webutility.waitForElementsToLoad(30);
//
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        js = (JavascriptExecutor) driver;
//
//        loginPage = new LoginPage(driver);
//        dashboardPage = new Dashboard(driver);
//    }
//
//    @DataProvider(name = "VacancyExcelData")
//    public Object[][] getVacancyData() throws Exception {
//        return excelUtility.getExcelDataAsArray("addVacancy");
//    }
//
//    @BeforeMethod
//    public void login() throws IOException {
//        webutility.enterUrl(fileUtility.getPropertyKeyValue("url"));
//        loginPage.login(
//            fileUtility.getPropertyKeyValue("username"),
//            fileUtility.getPropertyKeyValue("password")
//        );
//    }
//
//    @AfterClass
//    public void logout() {
//        dashboardPage.logoutMethod();
//        driver.quit();
//    }
//}