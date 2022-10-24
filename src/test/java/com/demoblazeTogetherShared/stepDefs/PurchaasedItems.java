package com.demoblazeTogetherShared.stepDefs;

import com.demoblazeTogetherShared.pages.PurchasePage;
import com.demoblazeTogetherShared.utilities.BrowserUtils;
import com.demoblazeTogetherShared.utilities.ConfigurationReader;
import com.demoblazeTogetherShared.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class PurchaasedItems {
    PurchasePage purchasePage = new PurchasePage();
    @Given("User logged in the page")
    public void user_logged_in_the_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @Given("click on {string} button")
    public void click_on_button(String select) {
     purchasePage.selection(select);
    }
    @When("{string} are selected")
    public void are_selected(String items) {
        purchasePage.selection(items);
    }
    @And("{string} selected items")
    public void selectedItems(String arg0) {
        purchasePage.selection(arg0);
    }

    @Then("user should see the same {string} in cart and Dashboard page")
    public void userShouldSeeTheSameInCartAndDashboardPage(String arg0) {
        BrowserUtils.waitFor(2);
        Alert alert = Driver.get().switchTo().alert();
        alert.accept();
        BrowserUtils.waitFor(2);
        purchasePage.selection("Cart");
        BrowserUtils.waitFor(2);
        Assert.assertEquals(arg0,purchasePage.total.getText());
    }

}
