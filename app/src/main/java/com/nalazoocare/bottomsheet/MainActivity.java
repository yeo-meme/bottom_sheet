package com.nalazoocare.bottomsheet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.nalazoocare.bottomsheet.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private BottomSheetBehavior mBottomSheetBehavior;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);



        binding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showBottom();
            }
        });
    }

    private void showBottom() {
//        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);

                new FullBottomSheetDialogFragment().show(getSupportFragmentManager(),"modalSheetDialog");
            }
    }
