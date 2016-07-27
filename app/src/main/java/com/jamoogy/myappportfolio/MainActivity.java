package com.jamoogy.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void makeToast(View view) {
        String buttonName = ((Button) view).getText().toString();
        Toast.makeText(this,
                getString(R.string.toast_message, buttonName),
                Toast.LENGTH_SHORT).show();
    }
}
