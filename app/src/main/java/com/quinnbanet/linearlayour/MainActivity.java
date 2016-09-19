package com.quinnbanet.linearlayour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickEvent(View view) {
        Toast submitToast = Toast.makeText(this, "Data Submitted", Toast.LENGTH_SHORT);
        submitToast.show();

        EditText name = (EditText) findViewById(R.id.name);
        EditText city = (EditText) findViewById(R.id.city);
        EditText state = (EditText) findViewById(R.id.state);
        EditText zip = (EditText) findViewById(R.id.zip);


            String userInfo = String.format("Name: %1$s City: %2$s State: %3$s Zip: %4$s",
                name.getText().toString(), city.getText().toString(),
                state.getText().toString(), zip.getText().toString());
       Log.d("Submit",userInfo);

        /* couldn't get log to file to work, using log.d
        try {
            File file = new File("/sdcard/userInfoLogFile.txt");

            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fileWritter = new FileWriter(file.getName(), true);
            BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
            bufferWritter.write(userInfo);
            bufferWritter.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        } */

    }
}
