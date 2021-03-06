package com.example.helloanna;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Anna", "button clicked");
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 findViewById(R.id.rootView).setBackgroundColor(
                         getResources().getColor(R.color.periwinkle));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (TextUtils.isEmpty(inputText)) {
                    ((TextView) findViewById(R.id.textView)).setText("Hello From Anna");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(inputText);
                }

            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));
                ((TextView) findViewById(R.id.textView)).setText("Hello From Anna");
            }
        });

    }
}