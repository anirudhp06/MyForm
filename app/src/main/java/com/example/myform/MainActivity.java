package com.example.myform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public static final String Efn="com.example.myform.Efn";
    public static final String Eusn="com.example.myform.Eusn";
    public static final String Edp="com.example.myform.Edp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button) findViewById(R.id.submit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                displayActivity();
            }
        });

    }

    public void displayActivity(){
        TextView t1=(TextView) findViewById(R.id.main_name);
        TextView t2=(TextView) findViewById(R.id.main_usn);
        TextView t3=(TextView) findViewById(R.id.main_dept);

        String name=t1.getText().toString();
        String usn=t2.getText().toString();
        String dept=t3.getText().toString();

        Intent i=new Intent(this,DisplayActivity.class);
        i.putExtra(Efn,name);
        i.putExtra(Eusn,usn);
        i.putExtra(Edp,dept);
// Ignore the Lod.d() command used it for debugging
//        Log.d("MainActivity","Sent:"+Efn+":"+name);
//        Log.d("MainActivity","Sent:"+Eusn+":"+usn);
//        Log.d("MainActivity","Sent:"+Edp+":"+dept);
        startActivity(i);
    }
}