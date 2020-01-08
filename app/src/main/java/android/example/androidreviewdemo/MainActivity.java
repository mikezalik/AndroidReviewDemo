package android.example.androidreviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void login(View view) {
        EditText nameEditText = findViewById(R.id.nameEditText);
        EditText passwordEditText = findViewById (R.id.passwordEditText);

        Log.i("info", "You've pressed the button!");
        Log.i ("password", passwordEditText.getText().toString());
        Log.i("Values", nameEditText.getText().toString());

        Toast.makeText(this, "Welcome!", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

