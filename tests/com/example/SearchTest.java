package com.example;
import android.content.Intent;
import android.content.pm.PackageManager;
import junit.framework.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class SearchTest {

    @Test
    public void searchAppExistsOnTheDevice() {
        Search search = new Search();
        Intent intent = mock(Intent.class);
        PackageManager packageManager = mock(PackageManager.class);
        String searchApp = "Calender";
        Boolean result = search.extractAllTheAppsAvailableOnTheDevice(intent,packageManager,searchApp);
//        Assert.assertEquals(true,result);
        Assert.assertTrue(result);
    }
}
