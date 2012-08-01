package com.example;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

import java.util.ArrayList;
import java.util.List;

public class Search {
    private ArrayList results = new ArrayList();

    public Boolean extractAllTheAppsAvailableOnTheDevice(Intent intent, PackageManager packageManager, String appBeingSearchedFor) {

        List<ResolveInfo> list = packageManager.queryIntentActivities(intent, PackageManager.PERMISSION_GRANTED);
        for (ResolveInfo rInfo : list) {
            results.add(rInfo.activityInfo.applicationInfo.loadLabel(packageManager).toString());
            System.out.println(rInfo.activityInfo.applicationInfo.loadLabel(packageManager).toString());
    }

       return false;
}
}
