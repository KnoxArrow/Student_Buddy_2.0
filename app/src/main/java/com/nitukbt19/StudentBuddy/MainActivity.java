package com.nitukbt19.StudentBuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.nitukbt19.StudentBuddy.Adapter.FragmentAdapter;
import com.nitukbt19.StudentBuddy.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.viewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager()));
        binding.tablayout.setupWithViewPager(binding.viewPager);
       binding.tablayout.getTabAt(0).setText("Student");
        binding.tablayout.getTabAt(1).setText("Teacher");
    }

}