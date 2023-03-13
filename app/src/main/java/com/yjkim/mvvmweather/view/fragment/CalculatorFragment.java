package com.yjkim.mvvmweather.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.yjkim.mvvmweather.databinding.FragmentCalculatorBinding;
import com.yjkim.mvvmweather.viewmodel.CalculatorViewModel;
import com.yjkim.mvvmweather.viewmodel.ViewModelFactory;

public class CalculatorFragment extends Fragment {

    private CalculatorViewModel viewModel;
    private FragmentCalculatorBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentCalculatorBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        viewModel = new ViewModelProvider(this, new ViewModelFactory()).get(CalculatorViewModel.class);
    }
}
