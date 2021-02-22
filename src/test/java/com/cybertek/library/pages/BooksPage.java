package com.cybertek.library.pages;

import com.cybertek.library.pages.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BooksPage extends BasePage {

    @FindBy(xpath = "//table[@id='tbl_books']//th")
    public List<WebElement> tableHeader;

    public List<String> actualHeaderList(){
        List<String> headerList = new ArrayList<>();
        for (WebElement webElement : tableHeader) {
            headerList.add(webElement.getText());
        }
        return headerList;
    }
}
