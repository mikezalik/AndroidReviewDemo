package android.example.androidreviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view)   {
        EditText nameEditText = findViewById(R.id.nameEditText);
        EditText passwordEditText = findViewById (R.id.passwordEditText);

        Log.i ("password", passwordEditText.getText().toString());
        Log.i("info", "You've pressed the button!");
        Log.i("Values", nameEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
