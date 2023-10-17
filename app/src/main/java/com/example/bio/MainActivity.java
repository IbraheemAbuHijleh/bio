package com.example.bio;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView txtHobbise;

    private Button btn;


     private EditText editHobbise;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHobbise=findViewById(R.id.txtHobbise);

        btn=findViewById(R.id.btn);

        editHobbise=findViewById(R.id.editHobbise);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String S=editHobbise.getText().toString() ;

                txtHobbise.setText(S);
                txtHobbise.setVisibility(View.VISIBLE);

            }
        });
    }
}