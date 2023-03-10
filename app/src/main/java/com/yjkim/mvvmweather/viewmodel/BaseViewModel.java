package com.yjkim.mvvmweather.viewmodel;


import androidx.lifecycle.ViewModel;

public class BaseViewModel extends ViewModel {

    public BaseViewModel() {
        // TODO ViewModel 이 공통으로 가지고 있어야 할 것

    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }

}
