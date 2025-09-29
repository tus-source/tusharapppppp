package com.example.tusharapppppp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
// It seems org.w3c.dom.Text was an accidental import, removing it.
// import org.w3c.dom.Text; // Remove this line

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView tvDemoLabel;
    Button changeColourButton; // Renamed for consistency

    @Override // Added @Override annotation
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize views here, inside onCreate
        tvDemoLabel = findViewById(R.id.tvDemoLabel);
        changeColourButton = findViewById(R.id.btnChangeColourClick); // This line
        // Corrected variable name and removed extra parenthesis

        // Set OnClickListener for the button
        changeColourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call your changeTextClick method or implement the logic directly here
                changeTextClick(v); // Assuming you want to call this method
                // Or you could directly change the text here:
                // tvDemoLabel.setText("Hello World! Changed from Button");
            }
        });
    }

    // This method can be called from the button's OnClickListener
    // or if you've set the onClick attribute in your XML layout for another view.
    public void changeTextClick(View view) {
        tvDemoLabel.setText("Hello World! Changed");
    }
}



