package com.demoblazeTogetherShared.pages;

import com.demoblazeTogetherShared.utilities.Driver;
import io.cucumber.java.sl.In;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static afu.org.checkerframework.checker.units.UnitsTools.min;
import static java.lang.Double.MAX_VALUE;

public class DeletePurchase {

    public DeletePurchase(){
        PageFactory.initElements(Driver.get(),this);
    }
    public void DeleteLowestItems(){
        List<WebElement> minimumPrice = Driver.get().findElements(By.xpath("//tbody/tr/td[3]"));
        List<Integer> prices = new ArrayList<>();

        for (int i = 0; i < minimumPrice.size(); i++) {
             String price = minimumPrice.get(i).getText();
             Integer priceDouble = Integer.valueOf(price);
               prices.add(priceDouble);
        }
        System.out.println("prices = " + prices);

        Collections.sort(prices);
        Integer min = prices.get(0);
        System.out.println("min = " + min);

//        for (int i = 0; i < prices.size(); i++) {
//             if (prices.get(i)<min){
//                 min = prices.get(i);
//             }
//            System.out.println("min = " + min);
//        }
      Driver.get().findElement(By.xpath("//tbody/tr/td[contains(text(),'"+min+"')]/../td[4]/a")).click();
    }
}
