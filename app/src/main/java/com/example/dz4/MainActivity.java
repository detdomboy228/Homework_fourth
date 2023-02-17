package com.example.dz4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inputField;
    private TextView infoField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button button;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputField = findViewById(R.id.input);
        infoField = findViewById(R.id.info);
        button = findViewById(R.id.button);
        button.setOnClickListener(listener);
    }

    private final View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String ticket;
            ticket = inputField.getText().toString();
            inputField.setText("Успех!");
            String concatenatedPhrase = "К сожалению, Ваш билет не относится к счастливым. Следующий счастливый билет - " + Calculation.nextHappyTicket(ticket);
            if (Calculation.check(ticket)) infoField.setText("Поздравляем! Ваш билет счастливый!");
            else infoField.setText(concatenatedPhrase);
        }
    };
}