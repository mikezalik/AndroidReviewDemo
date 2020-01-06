package android.example.androidreviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view)   {
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);

        Log.i("info", "You've pressed the button!");
        Log.i("Values", nameEditText.getText().toString());
    }

    public void passwordFunction (View view) {
        EditText passwordEditText = (EditText) findViewById (R.id.passwordEditText);

        Log.i ("password", passwordEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
