package com.appdevzhang.androiduniqueid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) this.findViewById(R.id.unique_id_tv);
        mTextView.setText(new AppUtils(this).getUniqueID());
    }
}
