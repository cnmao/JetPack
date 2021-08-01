package com.example.livedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.livedata.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private LiveDataWithIiewModel liveDataWithIiewModel;
    ActivityMainBinding binding  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this , R.layout.activity_main);

        MyViewModelFactory myViewModelFactory = new MyViewModelFactory();
        liveDataWithIiewModel = new ViewModelProvider(this, myViewModelFactory).get(LiveDataWithIiewModel.class);

        binding.setData(liveDataWithIiewModel);
        binding.setLifecycleOwner(this);
    }
}