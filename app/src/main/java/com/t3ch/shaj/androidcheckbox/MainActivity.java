package com.t3ch.shaj.androidcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox phyBox, chemBox, cseBox;
    private Button showButton;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phyBox = findViewById(R.id.physicsID);
        chemBox = findViewById(R.id.chemistryID);
        cseBox = findViewById(R.id.cseID);
        showButton = findViewById(R.id.buttonID);
        result = findViewById(R.id.resultID);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                StringBuilder strBuild = new StringBuilder();

                if (phyBox.isChecked()) {
                    String value = phyBox.getText().toString();
                    strBuild.append(value + "is selected" + "\n");
                }
                if (chemBox.isChecked()) {
                    String value = chemBox.getText().toString();
                    strBuild.append(value + "is selected" + "\n");
                }
                if (cseBox.isChecked()) {
                    String value = cseBox.getText().toString();
                    strBuild.append(value + "is selected" + "\n");
                }
                result.setText(strBuild);


            }
        });

    }
}
