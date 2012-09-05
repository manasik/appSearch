package com.applicationsearch;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.applicationsearch.search.Search;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;

public class SearchTest {

    @Test
    public void searchForAnAppInTheList() {
        Intent intent = mock(Intent.class);
        PackageManager packageManager = mock(PackageManager.class);
        String appSearch="Dev Tools";
        Search search = new Search(intent,packageManager,appSearch);
        search.extractAllTheAppsAvailableOnTheDevice().addAll(0,mockApplicationsList());

        String expectedAppSearchResult = search.searchIfTheEnteredTextAppExistsInTheList();

        Assert.assertEquals(appSearch, expectedAppSearchResult);
    }

    @Test
    public void shouldReturnNullWhenNoAppFound() {
        Intent intent = mock(Intent.class);
        PackageManager packageManager = mock(PackageManager.class);
        String appSearch="hello";
        Search search = new Search(intent,packageManager,appSearch);
        search.extractAllTheAppsAvailableOnTheDevice().addAll(0,mockApplicationsList());

        String expectedAppSearchResult = search.searchIfTheEnteredTextAppExistsInTheList();

        Assert.assertEquals(null,expectedAppSearchResult);
    }

    private ArrayList<String> mockApplicationsList() {
        ArrayList<String> applicationList = new ArrayList<String>();
        applicationList.add("Clock");
        applicationList.add("Dev Tools");
        applicationList.add("Calendar");
        applicationList.add("Camera");
        applicationList.add("Music");
        return applicationList;
    }

}
