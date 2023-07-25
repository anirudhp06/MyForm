package com.example.myform;

import static com.example.myform.MainActivity.Edp;
import static com.example.myform.MainActivity.Efn;
import static com.example.myform.MainActivity.Eusn;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        TextView name=(TextView) findViewById(R.id.second_name);
        TextView usn=(TextView) findViewById(R.id.second_usn);
        TextView dept=(TextView) findViewById(R.id.second_dept);
        Intent ii=getIntent();

        String receivedName=ii.getStringExtra(Efn);
        String receivedUsn=ii.getStringExtra(Eusn);
        String receivedDept=ii.getStringExtra(Edp);

// Ignore the Log.d() commands wrote them for debugging
//        Log.d("DisplayActivity","Received Name:"+receivedName);
//        Log.d("DisplayActivity","Received Name:"+receivedUsn);
//        Log.d("DisplayActivity","Received Name:"+receivedDept);

        name.setText(receivedName);
        usn.setText(receivedUsn);
        dept.setText(receivedDept);
    }
}
