package com.yjkim.mvvmweather.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.yjkim.mvvmweather.databinding.FragmentNotifyEditBinding;
import com.yjkim.mvvmweather.view.activity.MainActivity;
import com.yjkim.mvvmweather.viewmodel.NotifyViewModel;
import com.yjkim.mvvmweather.viewmodel.ViewModelFactory;

public final class NotifyEditFragment extends Fragment {


    private NotifyViewModel mViewModel;
    private FragmentNotifyEditBinding mBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mBinding = FragmentNotifyEditBinding.inflate(inflater, container, false);
        return mBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = new ViewModelProvider((MainActivity) requireActivity(), new ViewModelFactory(requireContext())).get(NotifyViewModel.class);
        mBinding.setLifecycleOwner(getViewLifecycleOwner());
        mBinding.setFragment(this);
        mBinding.setActivity((MainActivity) requireActivity());
        mBinding.setViewModel(mViewModel);

//        binding.btnDone.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mViewModel.onClickDone();
//            }
//        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mViewModel = null;
    }
}
