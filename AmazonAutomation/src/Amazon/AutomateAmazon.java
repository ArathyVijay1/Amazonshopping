package Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;




public class AutomateAmazon {
	public static void main(String args[])
	{
      // Set the path for the ChromeDriver executable
		System.setProperty("webdriver.chrome.driver","C:\\Eclipse\\Chromedriver\\chromedriver.exe");
		
	 // Set up the WebDriver
		WebDriver driver = new ChromeDriver();
		
	 // Open the Amazon login page
		driver.get("https://www.amazon.com/ap/signin");
		driver.manage().window().maximize();
		
	//Sleep for manually entering the captcha, please enter the captcha in 12 seconds and wait for continue shopping button to be clicked		
		 try {
             Thread.sleep(12000); // Wait for 12 seconds 
         } catch (InterruptedException e1) {
             e1.printStackTrace();
         }
		 
	//Click on continue shopping button
		 WebElement continueShoppingButton = driver.findElement(By.className("a-button-text"));
         continueShoppingButton.click();
		 
		 
	// Click the "Home" link		 
		 WebElement homeButton = driver.findElement(By.xpath("//*[@id=\"ap_error_return_home\"]/a"));
         homeButton.click();
         
    //Wait for the page to load     
        
         try {
             Thread.sleep(2000); 
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
		
	//Click on Address Dismiss button        
        WebElement keyBoardButton = driver.findElement(By.className("a-button-inner"));
        keyBoardButton.click(); 
        
        
      //Wait for sign in button to load  
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
      //Click on Sign in button
        WebElement signInButton = driver.findElement(By.id("nav-link-accountList"));
        signInButton.click();
        
       //Wait 
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Enter email/phone number
        WebElement emailField = driver.findElement(By.id("ap_email"));
        emailField.sendKeys("9207204455"); 
        
        //Wait
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }              
        
        
     // Click the 'Continue' button
        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();
        
     //Wait   
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
     // Enter password
        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys("password@123");
        
        
     // Click on the 'Sign in' button
        WebElement loginButton = driver.findElement(By.id("signInSubmit"));
        loginButton.click();   
        
        
      //Wait
        try {
            Thread.sleep(2000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }   
        

     // Search for a product (example: "toy car")
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("bugatti hot wheels"); 
        searchBox.sendKeys(Keys.RETURN);
        
        
     // Wait until the search results are loaded
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Bugatti Bolide, HW Exotics 3/10 [Black/red] 185/250']")));   
        
            
      // Click on the first product in the search results
        WebElement firstProduct = driver.findElement(By.xpath("//span[text()='Bugatti Bolide, HW Exotics 3/10 [Black/red] 185/250']"));
        firstProduct.click();
        
        
        
        
     // Wait until the product page is loaded
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[title*='See All Buying Options']")));  
        
     // Click the "See all buying options" button
        WebElement seeAllBuyingOptionsButton = driver.findElement(By.cssSelector("[title*='See All Buying Options']"));
        seeAllBuyingOptionsButton.click();      
        
        
      
     // Wait until the product page is loaded
        WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait11.until(ExpectedConditions.visibilityOfElementLocated(By.name("submit.addToCart")));
        
     // Click the "Add to Cart" button
        WebElement addToCartButton = driver.findElement(By.name("submit.addToCart"));
        addToCartButton.click();

     
        
     // Wait until proceed to checkout (optional, might require login depending on account status)
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait2.until(ExpectedConditions.elementToBeClickable(By.name("proceedToRetailCheckout")));
        
     //Click on Check out button 
        WebElement checkoutButton = driver.findElement(By.name("proceedToRetailCheckout"));
        checkoutButton.click();
        
     // Close the browser
        driver.quit();
        
        System.out.println("The process is completed till payment");
        
	}
	
}
        
        
        
        	
        
        
	

	

