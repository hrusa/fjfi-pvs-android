package com.itborci.gui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.itborci.R;

public class MainActivity extends BaseActivity {

    private static String TAG = "rooster-android-app";
    private SubjectDialog subjectDialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		Log.i(TAG, "onCreate");
        setContentView(R.layout.main);
    }
    
    public void onClick(View v) {
    	TextView tv = (TextView)findViewById(v.getId());
    	subjectDialog = new SubjectDialog(this, tv);
    	subjectDialog.show();
    	
    }
}

