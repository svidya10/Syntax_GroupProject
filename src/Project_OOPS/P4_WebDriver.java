package Project_OOPS;

public interface P4_WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends P4_WebDriver,TakesScreenshot {
    void navigate();
}
interface TakesScreenshot {
    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver {

    @Override
    public void navigate() {
        System.out.println("ChromeDriver-->navigate");
    }

    @Override
    public void open() {
        System.out.println("ChromeDriver-->open");
    }

    @Override
    public void close() {
        System.out.println("ChromeDriver-->close");
    }

    @Override
    public String getTitle() {
        System.out.println("ChromeDriver-->getTitle");
        return null;
    }

    @Override
    public void getScreenshot() {
        System.out.println("ChromeDriver-->Takescreenshot");
    }
}
class FirefoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Firefox-->open");
    }

    @Override
    public void close() {
        System.out.println("Firefox-->close");
    }

    @Override
    public String getTitle() {
        System.out.println("Firefox-->getTitle");
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Firefox-->navigate");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Firefox-->Takescreenshot");
    }
}
class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Safari-->Open");
    }

    @Override
    public void close() {
        System.out.println("Safari-->Close");
    }

    @Override
    public String getTitle() {
        System.out.println("Safari-->getTitle");
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Safari-->navigate");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Safari-->Takescreenshot");
    }
}
class DriverTest{
    public static void main(String args[]){
        RemoteWebDriver[] obj = {new ChromeDriver(),new FirefoxDriver(),new SafariDriver()};
        for (RemoteWebDriver driver:obj) {
            driver.open();
            driver.navigate();
            driver.getTitle();
            driver.getScreenshot();
            driver.close();
            System.out.println("----------------------------------------");
        }
    }
}