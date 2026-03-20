package manageMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class WindowMethodsDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.manage().window().minimize();
        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        Thread.sleep(2000);

        driver.manage().window().setSize(new Dimension(800, 600));
        Thread.sleep(2000);

        Dimension size = driver.manage().window().getSize();
        System.out.println("Width: " + size.getWidth());
        System.out.println("Height: " + size.getHeight());

        driver.manage().window().setPosition(new Point(200, 150));
        Thread.sleep(2000);

        Point position = driver.manage().window().getPosition();
        System.out.println("X Position: " + position.getX());
        System.out.println("Y Position: " + position.getY());

        // Close browser
        Thread.sleep(3000);
        driver.quit();
    }
}