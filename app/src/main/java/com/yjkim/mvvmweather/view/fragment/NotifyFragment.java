package com.yjkim.mvvmweather.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.yjkim.mvvmweather.databinding.FragmentNotifyBinding;
import com.yjkim.mvvmweather.viewmodel.NotifyViewModel;
import com.yjkim.mvvmweather.viewmodel.ViewModelFactory;

public class NotifyFragment extends Fragment {

    private ViewModel mViewModel;
    private FragmentNotifyBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentNotifyBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mViewModel = new ViewModelProvider(requireActivity(), new ViewModelFactory()).get(NotifyViewModel.class);
    }


}
