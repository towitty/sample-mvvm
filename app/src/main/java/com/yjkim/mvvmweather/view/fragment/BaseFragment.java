package com.yjkim.mvvmweather.view.fragment;

import android.content.Context;

import androidx.annotation.LayoutRes;
import androidx.fragment.app.Fragment;

import com.yjkim.mvvmweather.view.activity.MainActivity;
import com.yjkim.mvvmweather.viewmodel.BaseViewModel;

public abstract class BaseFragment<V extends BaseViewModel> extends Fragment {

    private MainActivity mMainActivity;
    private V mViewModel;

    private int mAnimationId = -1;
    private boolean mIsAnimationPerform = false;

    public abstract @LayoutRes
    int getLayoutId();

    public abstract void observeViewModel();

    public abstract V getViewModel();

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainActivity) {
            MainActivity activity = (MainActivity) context;
            this.mMainActivity = activity;
        }
    }
}