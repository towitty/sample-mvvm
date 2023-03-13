package com.yjkim.mvvmweather.view.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.yjkim.mvvmweather.R;
import com.yjkim.mvvmweather.databinding.ActivityMainBinding;
import com.yjkim.mvvmweather.view.fragment.EditFragment;
import com.yjkim.mvvmweather.viewmodel.NotifyViewModel;
import com.yjkim.mvvmweather.viewmodel.ViewModelFactory;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;
    private ViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        BottomNavigationView bottomNavigationView = mBinding.navigationMain;

//        Theme 색상 bottom icon 에 미적용
//        bottomNavigationView.setItemIconTintList(null);

        Fragment container = getSupportFragmentManager().findFragmentById(R.id.container_main);
        NavController navController = container != null ? NavHostFragment.findNavController(container) : null;

        if (navController != null) {
            NavigationUI.setupWithNavController(bottomNavigationView, navController);
        }
        mViewModel = new ViewModelFactory().create(NotifyViewModel.class);

    }

//    private ViewModel getViewModel() {
//
//    }
}