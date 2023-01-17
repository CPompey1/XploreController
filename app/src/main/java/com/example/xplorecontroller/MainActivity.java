package com.example.xplorecontroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import java.net.*;
import java.util.*;
import java.io.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Hello");

        //Get Buttons

        //Set Buttons onclick


    }

    public void startConnection(){
        try {
            NetworkInterface ethInterface = NetworkInterface.getByName("eth0");
            final InetAddress ip = (InetAddress) Collections.list(ethInterface.getInetAddresses()).get(1);
        }

        catch (IOException i){
            print(i);
        }

        catch (SocketException i){

        }
    }

    public void


}