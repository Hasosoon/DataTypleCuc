package com.demoblazeTogetherShared.stepDefs;

import com.demoblazeTogetherShared.pages.DeletePurchase;
import com.demoblazeTogetherShared.pages.PurchasePage;
import com.demoblazeTogetherShared.utilities.BrowserUtils;
import com.demoblazeTogetherShared.utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;

import java.util.List;
import java.util.Map;

public class DeleteLowest {
    DeletePurchase deletePurchase = new DeletePurchase();
    PurchasePage purchasePage = new PurchasePage();

    @When("click on following steps")
    public void clickOnFollowingSteps(DataTable dataTable) {
        List<Map<String, String>> list = dataTable.asMaps();
        System.out.println("list = " + list);
        for (int i = 0; i < list.size(); i++) {
           purchasePage.selection(list.get(i).get("selection"));
            purchasePage.selection(list.get(i).get("items"));
            purchasePage.selection("Add to cart");
            BrowserUtils.waitFor(2);
            Alert alert = Driver.get().switchTo().alert();
            alert.accept();
            purchasePage.selection("Home");
        }
    }

    @And("User clicked {string} button")
    public void userClickedButton(String arg0) {
     purchasePage.selection(arg0);
    }

    @Then("user delete lowest price")
    public void userDeleteLowestPrice() {
        deletePurchase.DeleteLowestItems();
    }

}
