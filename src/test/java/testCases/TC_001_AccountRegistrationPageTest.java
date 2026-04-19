package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationPageTest extends BaseClass {
	
	@Test(groups={"Sanity","Master"})
	public void verify_account_registration()
	{
		logger.info("******Starting TC_001_AccountRegistrationPage***********");
		HomePage hp =new HomePage(driver);
		
		try {
		logger.info("Clicking on MyAccount link.....");
		hp.clickMyAccount();
		
		logger.info("Clicking on Register link.....");
		hp.clickRegister();
		
		AccountRegistrationPage repage= new AccountRegistrationPage(driver);
		
		logger.info("Providing customer info.....");
		repage.setFirstName(randomString().toUpperCase());
		repage.setLastname(randomString().toUpperCase());
		repage.setEmail(randomString()+"@gmail.com"); //randomly generated the email
		repage.setTelephone(randomNumber()) ;
		
		//String password=randomAlphaNumbric();
		
		String password=randomAlphaNumberic();
		repage.setPassword(password);
		repage.setConfirmpassword(password);
		repage.setPrivacypolicy();
		repage.setClickcontinue();
		
		logger.info(" Validating expected message... ");
		String confmsg =repage.getConfirmationMsg();
		
		if(confmsg.equals("Your Account Has Been Created!"))
		{
			Assert.assertTrue(true);
		}
		
		else 
		{
			logger.error("Test Failed..");
			logger.debug("Debug logs...");
			Assert.assertTrue(false);		}
		
		}
	
		catch(Exception e)
		
		{			
		Assert.fail();
	
		}
	
		logger.info("*****Finished TC_001_AccountRegistrationPage***** ");
	}
	
 }    

   