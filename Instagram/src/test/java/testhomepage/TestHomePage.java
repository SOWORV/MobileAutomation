package testhomepage;

import base.MobileAPI2;
import com.gargoylesoftware.htmlunit.Page;
import homepage.HomePage;
import org.openqa.selenium.support.PageFactory;

public class TestHomePage extends MobileAPI2 {

    HomePage testhomepage;

    public void intialixation(){
        testhomepage = PageFactory.initElements(appiumDriver, HomePage.class);
    }
}
