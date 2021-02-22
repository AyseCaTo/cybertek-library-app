package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.BooksPage;
import com.cybertek.library.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class DataTable_StepDefinitions {

    HomePage homePage = new HomePage();
    BooksPage booksPage = new BooksPage();

    @When("User click on {string} link")
    public void user_click_on_link(String string) {
        homePage.getUsersLink.click();
    }

    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(int expectedDefault) {
        Assert.assertEquals(expectedDefault, homePage.defaultValue());
    }
    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String> expectedList) {
        Assert.assertEquals(homePage.actualList(), expectedList);
    }

    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> expectedList) {
        Assert.assertEquals(homePage.columnNamesList(), expectedList);
    }


    @Then("the user should see the table headers")
    public void theUserShouldSeeTheTableHeaders(List<String> expectedHeaderList) {
        Assert.assertEquals(booksPage.actualHeaderList(), expectedHeaderList);
    }
}
