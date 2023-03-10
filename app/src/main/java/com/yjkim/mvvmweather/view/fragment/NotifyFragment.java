package com.yjkim.mvvmweather.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.yjkim.mvvmweather.databinding.FragmentNotifyBinding;
import com.yjkim.mvvmweather.viewmodel.NotifyViewModel;
import com.yjkim.mvvmweather.viewmodel.ViewModelFactory;

public class NotifyFragment extends Fragment {

    private NotifyViewModel mViewModel;
    private FragmentNotifyBinding mBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = FragmentNotifyBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mViewModel = new ViewModelProvider(requireActivity(), new ViewModelFactory(requireContext())).get(NotifyViewModel.class);
        mBinding.setViewModel(mViewModel);
        mBinding.setNotify(mViewModel.getNotifyData().getValue());

        mViewModel.getNotifyData().observe(getViewLifecycleOwner(), notifyData -> {
            mBinding.setNotify(mViewModel.getNotifyData().getValue());
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mViewModel = null;
    }

}
