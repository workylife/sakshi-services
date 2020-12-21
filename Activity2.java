package com.workylife.SakshiServices;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    private static final int MY_PERMISSION_REQUEST__SEND_SMS=0;
    ImageButton btn1,btn2,btn3,btn4,btn5,btn6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
//////////////////////////////////////////////////////////////////////////////////////////////////
        btn1 = (ImageButton) findViewById(R.id.imageButton1);
        btn2 = (ImageButton) findViewById(R.id.imageButton2);
        btn3 = (ImageButton) findViewById(R.id.imageButton3);
        btn4 = (ImageButton) findViewById(R.id.imageButton4);
        btn5 = (ImageButton) findViewById(R.id.imageButton5);
        btn6 = (ImageButton) findViewById(R.id.imageButton6);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS)!= PackageManager.PERMISSION_GRANTED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.SEND_SMS)){

            }
            else{
                //pop up
                ActivityCompat.requestPermissions(this,new String[ ]{Manifest.permission.SEND_SMS},MY_PERMISSION_REQUEST__SEND_SMS);
            }
        }
////////////////////////////////////////////////////////////////////////////////////////////////////
        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want a electrician";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
            }
        });
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want Plumber";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
            }
        });
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want car with driver";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
            }
        });
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want carpainter";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
            }
        });
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

        btn5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want to do water proofing";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
            }
        });
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

        btn6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String phonenumer="9324155815";
                String message="I want Painter";
                SmsManager smsManager=SmsManager.getDefault();
                smsManager.sendTextMessage(phonenumer,null,message,null,null);
            }
        });
//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }
////////////////////////////////////////////////////////////////////////////////////////////////////
    public void onRequestPermissionResult(int requestCode,String permission[],int[] grantResults){
        switch (requestCode){
            case MY_PERMISSION_REQUEST__SEND_SMS:{
                if(grantResults.length>0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    Toast.makeText(this,"Thanks For Permitting!",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(this,"Please allow the permission",Toast.LENGTH_LONG).show();
                }
            }
        }
    }


}