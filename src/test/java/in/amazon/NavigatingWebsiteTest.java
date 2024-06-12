package in.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v103.browser.Browser;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NavigatingWebsiteTest {
	@Test
	public void navigationTest() {
		
//1.Exception handling in case webpage doesn’t load properly as expected-using try, catch and Finally
		try {
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
//2.Need of thread.sleep() functionality, in case of loading page or waiting for search results
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch bllock
				e.printStackTrace();
			}

			System.out.println("Login is successful");

			// maximize browser window
			driver.manage().window().maximize();
//2.Need of thread.sleep() functionality, in case of loading page or waiting for search results
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

// 3.Navigate to the website

			String url = "https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fb%2Fref%3Dnav_signin%3F_encoding%3DUTF8%26node%3D27981257031%26pf_rd_r%3D087C0NB2NNWQ9S8CXA0B%26pf_rd_p%3D21e4dafd-38b2-4803-9636-bbe8db5697a8%26pd_rd_r%3D8651caf1-8828-4aa4-ba74-6763998f81df%26pd_rd_w%3DE9gex%26pd_rd_wg%3DOEBWg%26ref_%3Dpd_gw_unk&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
			driver.get(url);
			System.out.println("Page is opened");

//4.Login to the portal (login form can be on the different window, or as a dropdown, or as a pop-up)			

			// enter username
			WebElement username = driver.findElement(By.id("ap_email"));
			username.sendKeys("meeta.msc@gmail.com");

			WebElement continueButton = driver.findElement(By.id("continue"));
			continueButton.click();

			// enter password
			WebElement password = driver.findElement(By.id("ap_password"));
			password.sendKeys("Mini@92295#");

			WebElement submitButton = driver.findElement(By.id("signInSubmit"));
			submitButton.click();

			System.out.println("Logged in successfully");

//5. Showcase interaction with the Dynamic and Static elements- The search bar and Navigation bar.
//6. Usage of locator types, whether to use CSS selector or Xpath
			
			WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
			WebElement searchIcon = driver.findElement(By.id("nav-search-submit-button"));
			
			searchBar.sendKeys("books");
			searchIcon.click();

//2.Need of thread.sleep() functionality, in case of loading page or waiting for search results
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

//8. Usage of Dynamic Xpath or tags vs Static Xpath.
			WebElement newreleasesNavigation = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_apay']"));
			newreleasesNavigation.click();
			
			
//2.Need of thread.sleep() functionality, in case of loading page or waiting for search results
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			WebElement videogamesNavigation = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_gc']"));
			videogamesNavigation.click();
//2.Need of thread.sleep() functionality, in case of loading page or waiting for search results
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			
			
//2.Need of thread.sleep() functionality, in case of loading page or waiting for search results
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement giftCardImgSelection = driver.findElement(By.xpath("//img[@alt='Email gift cards']"));
			giftCardImgSelection.click();
			
//2.Need of thread.sleep() functionality, in case of loading page or waiting for search results
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement giftCardAmtSelection = driver.findElement(By.xpath("//img[@alt='GC 7']"));
			giftCardAmtSelection.click();
			
			WebElement giftCardAmtSelection1 = driver.findElement(By.id("gc-mini-picker-design-swatch-image-2"));
			giftCardAmtSelection1.click();
			WebElement giftCardAmtSelection2 = driver.findElement(By.id("gc-mini-picker-amount-1"));
			giftCardAmtSelection2.click();
			WebElement giftCardAmtSelection3 = driver.findElement(By.id("gc-delivery-mechanism-button-Email-announce"));
			giftCardAmtSelection3.click();
	
//2.Need of thread.sleep() functionality, in case of loading page or waiting for search results
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement giftCardEmailSelection = driver.findElement(By.id("gc-order-form-recipients"));
			giftCardEmailSelection.click();		
			giftCardEmailSelection.sendKeys("assignmentTest@test.com");
			
//2.Need of thread.sleep() functionality, in case of loading page or waiting for search results
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement addToCartButton = driver.findElement(By.id("gc-buy-box-atc"));
			addToCartButton.click();	
			
//2.Need of thread.sleep() functionality, in case of loading page or waiting for search results
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement viewCartButton = driver.findElement(By.id("nav-cart-count"));
			viewCartButton.click();

//7. Extract web elements such as table or list
		
			WebElement searchDropdown1 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']")); //dynamic xpath
			searchDropdown1.click();
			
//2.Need of thread.sleep() functionality, in case of loading page or waiting for search results
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			WebElement searchValue1 = driver.findElement(By.xpath("//option[@value='search-alias=amazon-pharmacy']")); 
			searchValue1.click();
			WebElement searchbar2 = driver.findElement(By.id("twotabsearchtextbox"));
			searchbar2.sendKeys("crocin");	
			WebElement searchIcon2 = driver.findElement(By.id("nav-search-submit-button"));
			searchIcon2.click();
//2.Need of thread.sleep() functionality, in case of loading page or waiting for search results
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement scroll = driver.findElement(By.xpath("//a[@aria-label='Go to page 2']"));
			scroll.click();
//2.Need of thread.sleep() functionality, in case of loading page or waiting for search results
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
		
			//logout-hover over the element
			Actions a=new Actions(driver);
			a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).perform();
			
			WebElement signout1 = driver.findElement(By.xpath("//a[@id='nav-item-signout']")); 
			signout1.click();
			
			System.out.println("Logout is successful.");
			driver.quit();

		} catch (Exception e) {
			System.out.println("Page could not be loaded properly.");
		} finally {     
			Browser.close();
		}

	}
}
