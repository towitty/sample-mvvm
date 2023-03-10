package com.yjkim.mvvmweather.viewmodel;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class ViewModelFactory implements ViewModelProvider.Factory {

//    private Context mContext;

    public ViewModelFactory() {
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass == MainActivityViewModel.class) {
            return (T) new MainActivityViewModel();
        }

        throw new IllegalArgumentException(modelClass.getCanonicalName() + "is not registered!");
    }
}
