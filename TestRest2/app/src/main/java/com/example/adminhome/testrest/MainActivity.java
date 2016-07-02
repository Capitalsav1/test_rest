package com.example.adminhome.testrest;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button getData = (Button) findViewById(R.id.getServiceData);
        getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String restURL = "http://www.androidexample.com/webservice/data/JSONReturn.php";
            }
        });

    }
}
