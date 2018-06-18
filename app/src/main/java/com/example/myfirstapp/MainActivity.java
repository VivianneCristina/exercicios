package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edit;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit = findViewById(R.id.editText);
        btn = findViewById(R.id.button);

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String text = edit.getText().toString();

                        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                        Bundle bundle = new Bundle();

                        bundle.putString(“text“, text);

                        intent.putExtras(bundle);
                        startActivity(intent);

                    }
                });
    }
}
