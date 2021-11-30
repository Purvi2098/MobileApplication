package com.example.purvi;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class prac54 extends AppCompatActivity {
    Button btn;
    EditText number;
    EditText txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.btn_button);
        number=findViewById(R.id.txtnumber);
        txt=findViewById(R.id.et_mess);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW);
                String n=number.getText().toString();
                String m=txt.getText().toString();
                i.setType("vnd.android-dir/mms_sms");
                i.setData(Uri.parse("sms:"+n));
                i.putExtra("sms_body"," "+m);
                startActivity(i);
            }
        });
    }
}

