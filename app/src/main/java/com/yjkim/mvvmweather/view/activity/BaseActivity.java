package com.yjkim.mvvmweather.view.activity;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.yjkim.mvvmweather.R;
import com.yjkim.mvvmweather.databinding.ActivityMainBinding;
import com.yjkim.mvvmweather.viewmodel.BaseViewModel;
import com.yjkim.mvvmweather.viewmodel.ViewModelFactory;

abstract class BaseActivity<V extends BaseViewModel> extends AppCompatActivity {

    private V mViewModel;

    public abstract V getMainViewModel();
    public abstract void viewModelObservable();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView( R.layout.activity_main);
        this.mViewModel = mViewModel == null ? getMainViewModel() : mViewModel;


    }

}