package com.example;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends Activity
{
    private EditText editText;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void searchApps(View view) {
        editText = (EditText)findViewById(R.id.search_editText);
        String appSearch = editText.getText().toString();

        Intent intent = new Intent(Intent.ACTION_MAIN, null);
        intent.addCategory(Intent.CATEGORY_LAUNCHER);

        PackageManager packageManager = this.getPackageManager();
        Search search = new Search(intent,packageManager,appSearch);
        search.searchIfTheEnteredTextAppExistsInTheList();

    }
}
