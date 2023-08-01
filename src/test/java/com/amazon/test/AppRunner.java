package com.amazon.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppRunner {

    @Test
    public void runUnitTestInGitHubRunner(){
        int actual=1;
        Assert.assertEquals(1,actual);
    }
}
