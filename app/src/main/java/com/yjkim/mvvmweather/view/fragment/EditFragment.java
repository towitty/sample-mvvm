package com.yjkim.mvvmweather.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.yjkim.mvvmweather.databinding.FragmentEditBinding;
import com.yjkim.mvvmweather.viewmodel.EditViewModel;
import com.yjkim.mvvmweather.viewmodel.NotifyViewModel;
import com.yjkim.mvvmweather.viewmodel.ViewModelFactory;

public final class EditFragment extends Fragment {


    private ViewModel mViewModel;
    private FragmentEditBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentEditBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = new ViewModelProvider(requireActivity(), new ViewModelFactory()).get(EditViewModel.class);
        binding.setViewModel((NotifyViewModel) mViewModel);
    }
}
