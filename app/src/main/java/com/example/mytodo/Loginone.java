package com.example.mytodo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class Loginone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginone);

        Button loginnButton = findViewById(R.id.loginnbutton);
        loginnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText emailEditText = findViewById(R.id.email1editText);
                EditText passwordEditText = findViewById(R.id.pasword1editText2);
                CheckBox rememberPasswordCheckbox = findViewById(R.id.remember_passcheckBox);

                rememberPasswordCheckbox.isChecked();

                String inputemail = emailEditText.getText().toString();
                int value = Integer.parseInt(inputemail);

                String inputpassword = passwordEditText.getText().toString();

                Authh auth = new Authh(inputemail, inputpassword);
                boolean result = auth.check();
                if (result) {
                    if (rememberPasswordCheckbox.isChecked()) {
                        Toast.makeText(Loginone.this, "คุณเลือกจำรหัสผ่าน", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Loginone.this, "คุณไม่จำรหัสผ่าน", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    new AlertDialog.Builder(Loginone.this)
                            .setTitle("Error")
                            .setMessage("Invalid email or password")
                            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .setNeutralButton("Ignore", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialogInterface, int i) {

                                }
                            })
                            .show();
                }

            }
        });
    }
}
