package com.nidhi.intent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText= findViewById(R.id.edittext);
    }

    public void mainactivity(View view) {

        String value = editText.getText().toString();

        if (value.length() ==0){
            editText.setError("NO VALUE");
        }
        else{
            Intent intent = new
                    Intent(MainActivity.this, MainActivity2.class);

            Bundle bundle = new Bundle();

            bundle.putString("name", value);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }
}