package com.yjkim.mvvmweather.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.yjkim.mvvmweather.R;
import com.yjkim.mvvmweather.databinding.ActivityMainBinding;
import com.yjkim.mvvmweather.viewmodel.NotifyViewModel;
import com.yjkim.mvvmweather.viewmodel.ViewModelFactory;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        BottomNavigationView bottomNavigationView = mBinding.navigationMain;

//        Theme 색상 bottom icon 에 미적용
//        bottomNavigationView.setItemIconTintList(null);

        Fragment container = getSupportFragmentManager().findFragmentById(R.id.container_main);
        NavController navController = container != null ? NavHostFragment.findNavController(container) : null;

        if (navController != null) {
            NavigationUI.setupWithNavController(bottomNavigationView, navController);
        }
//        mViewModel = new ViewModelProvider(this, new ViewModelFactory(this)).get(NotifyViewModel.class);

    }

}