package com.quinnbanet.linearlayour;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText city;
    EditText state;
    EditText zip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickEvent(View view) {
        Toast submitToast = Toast.makeText(this, "Data Submitted", Toast.LENGTH_SHORT);
        submitToast.show();
        String logger = String.format("Name: , City: , State: , Zip: ",
                name.getText().toString(), city.getText().toString(),
                state.getText().toString(), zip.getText().toString());
        Log.d("Submit",logger);
    }
}
