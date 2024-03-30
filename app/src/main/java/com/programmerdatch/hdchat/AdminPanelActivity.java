package com.programmerdatch.hdchat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.programmerdatch.hdchat.databinding.ActivityAdminPanelBinding;

public class AdminPanelActivity extends AppCompatActivity {

    ActivityAdminPanelBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAdminPanelBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.helloTxt.setText("Setted by JAVA and DATCH");


    }
}