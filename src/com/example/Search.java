package com.example;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

import java.util.ArrayList;
import java.util.List;

public class Search {
    private ArrayList<String> results = new ArrayList();
    private Intent intent;
    private PackageManager packageManager;
    private String appSearch;
    private String searchResult;

    public Search(Intent intent, PackageManager packageManager, String appSearch){
        this.intent = intent;
        this.packageManager = packageManager;
        this.appSearch = appSearch;
    }

    public ArrayList<String> extractAllTheAppsAvailableOnTheDevice() {
        List<ResolveInfo> list = packageManager.queryIntentActivities(intent, PackageManager.PERMISSION_GRANTED);
        for(ResolveInfo rInfo : list) {
            results.add(rInfo.activityInfo.applicationInfo.loadLabel(packageManager).toString());
        }
        return results;
}

    public String searchIfTheEnteredTextAppExistsInTheList() {
        for(String appsList : extractAllTheAppsAvailableOnTheDevice()){
           if(appsList.equals(appSearch)){
               searchResult = appSearch;
               break;
           }
            else{
               searchResult = null;
           }
        }
        return searchResult;
    }

}
