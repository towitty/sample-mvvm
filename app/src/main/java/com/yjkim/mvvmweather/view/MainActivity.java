package com.yjkim.mvvmweather.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import com.yjkim.mvvmweather.R;
import com.yjkim.mvvmweather.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    /*
     *    TODO - 이미지 미리보기 추가
     *    TODO - fasfaf
     *
     */

    private ActivityMainBinding binding;
    private ViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        viewModel = ViewModelProvider.of(this).get(ViewModel.class);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }
}