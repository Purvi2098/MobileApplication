package com.example.purvi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class prac55 extends AppCompatActivity {
    Button btn;
    EditText mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn_button);
        mail=findViewById(R.id.et_mail);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_SENDTO);
                String n=mail.getText().toString();
                i.setType("message/rfc822");
                i.setData(Uri.parse("mailto:"+n));
                i.putExtra(Intent.EXTRA_SUBJECT,"try");
                i.putExtra(Intent.EXTRA_TEXT,"Hello");
                startActivity(i);
            }
        });
    }
}
