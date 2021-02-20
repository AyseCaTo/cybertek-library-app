package com.cybertek.library.pages;

import com.cybertek.library.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    @FindBy(xpath = "//h2[.='2844']")
    public WebElement userNumber;

    public int howManyUsers(){
        return Integer.parseInt(String.valueOf(userNumber.getText()));
    }

}
