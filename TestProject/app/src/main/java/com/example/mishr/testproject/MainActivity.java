package com.example.mishr.testproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView tx_username , tx_pin;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tx_pin = (TextView)findViewById(R.id.edittextpin);
        tx_username = (TextView)findViewById(R.id.edittextid);
        submit = (Button)findViewById(R.id.login);

          submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String data_username = tx_username.getText().toString();
                final String data_pin = tx_username.getText().toString();

                if (data_username.length() == data_pin.length()){
                    Intent intent = new Intent(MainActivity.this,TabActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this,"Something is Wrong..!! Make Sure the Length remains Constant..!!",Toast.LENGTH_SHORT).show();
                }
            }
        });



    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
