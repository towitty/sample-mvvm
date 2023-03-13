package com.yjkim.mvvmweather.viewmodel;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class ViewModelFactory implements ViewModelProvider.Factory {

//    private Context mContext;
//    private static ViewModelFactory sViewModelFactory;
//    private ViewModelFactory(Context context) {
//        this.mContext = context;
//    }

//    public static ViewModelFactory getInstance(Context context) {
//        if (sViewModelFactory == null) {
//            synchronized (ViewModelFactory.class) {
//                sViewModelFactory = new ViewModelFactory(context);
//            }
//        }
//        return sViewModelFactory;
//    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        if (modelClass == NotifyViewModel.class) {
            return (T) new NotifyViewModel();
        }
        if (modelClass == EditViewModel.class) {
            return (T) new EditViewModel();
        }
        if (modelClass == CalculatorViewModel.class) {
            return (T) new CalculatorViewModel();
        }

        throw new IllegalArgumentException(modelClass.getCanonicalName() + "is not registered!");
    }
}
