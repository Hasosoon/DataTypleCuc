package com.demoblazeTogetherShared.stepDefs;


import com.demoblazeTogetherShared.utilities.Driver;
import io.cucumber.java.*;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @BeforeAll
    public static void setUp(){
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterAll
    public static void tearDown(){
        Driver.closeDriver();
    }
}
