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

import com.yjkim.mvvmweather.view.activity.MainActivity;
import com.yjkim.mvvmweather.viewmodel.BaseViewModel;

public final class MenuFragment<V extends ViewModel> extends Fragment {

    private MainActivity mActivity;
    private BaseViewModel mViewModel;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mActivity = (MainActivity) requireActivity();

//        mActivity.
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mActivity = null;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        /*ViewGroup rootView = (ViewGroup) FragmentContainerMainBinding.inflate(inflater, container, false));
        Button button = rootView.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activity.onFragmentChange(1);
            }
        });
        return rootView;*/

        return null;
    }
}
