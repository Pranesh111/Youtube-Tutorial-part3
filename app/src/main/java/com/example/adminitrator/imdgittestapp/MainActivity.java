package com.example.adminitrator.imdgittestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button btn1;

    EditText edt2;





    EditText edt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.button);
        edt2=(EditText)findViewById(R.id.editText2);

        edt1=(EditText)findViewById(R.id.editText);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=edt1.getText()+"";
                if(str!=null || !str.equals("")){
                    Toast.makeText(getApplicationContext(),"fgd",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
