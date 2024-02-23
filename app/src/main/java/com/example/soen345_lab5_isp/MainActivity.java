//Dominique Isbister, 40210056
//Zaheer Quraishi, 40115706


package com.example.soen345_lab5_isp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText angle1EditText, angle2EditText, angle3EditText;
    Button checkAnglesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the EditTexts
        angle1EditText = findViewById(R.id.angle1EditText);
        angle2EditText = findViewById(R.id.angle2EditText);
        angle3EditText = findViewById(R.id.angle3EditText);

        // Initialize the Button
        checkAnglesButton = findViewById(R.id.checkAnglesButton);

        // Set up a click listener for the button
        checkAnglesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int angle1 = Integer.parseInt(angle1EditText.getText().toString());
                    int angle2 = Integer.parseInt(angle2EditText.getText().toString());
                    int angle3 = Integer.parseInt(angle3EditText.getText().toString());

                    if (isTriangle(angle1, angle2, angle3)) {
                        Toast.makeText(MainActivity.this, "The angles form a valid triangle.", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "The angles do not form a valid triangle.", Toast.LENGTH_SHORT).show();
                    }
                } catch (NumberFormatException e) {
                    Toast.makeText(MainActivity.this, "Please enter valid numbers for all angles.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public static boolean isTriangle(int a1, int a2, int a3) {
        return a1 > 0 && a2 > 0 && a3 > 0 && (a1 + a2 + a3 == 180);
    }
}
