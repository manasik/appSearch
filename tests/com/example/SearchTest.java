package com.example;
import android.content.Intent;
import android.content.pm.PackageManager;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class SearchTest {

    @Test
    public void searchAppExistsOnTheDevice() {
        Search search = new Search();
        Intent intent = mock(Intent.class);
        PackageManager packageManager = mock(PackageManager.class);
        String searchApp = "Calender";
        search.extractAllTheAppsAvailableOnTheDevice(intent,packageManager,searchApp);


    }
}
