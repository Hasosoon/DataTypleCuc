package com.demoblazeTogetherShared.pages;

import com.demoblazeTogetherShared.utilities.BrowserUtils;
import com.demoblazeTogetherShared.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PurchasePage {

    public PurchasePage(){
        PageFactory.initElements(Driver.get(), this);
    }

    public void selection(String str){
        BrowserUtils.waitFor(3);
      Driver.get().findElement(By.xpath("//a[contains(text(),'"+str+"')]")).click();

    }
    @FindBy(id = "totalp")
    public WebElement total;

}
