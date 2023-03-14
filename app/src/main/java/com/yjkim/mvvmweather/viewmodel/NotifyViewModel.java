package com.yjkim.mvvmweather.viewmodel;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.yjkim.mvvmweather.model.NotifyData;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NotifyViewModel extends ViewModel {

    private MutableLiveData<NotifyData> notifyData;

    public NotifyViewModel() {
        loadNotifyData();
    }

    private LiveData<NotifyData> loadNotifyData() {
        if (notifyData == null) {
            notifyData = new MutableLiveData();
        }

        return notifyData;
    }

    public void onClickDone(Context context, String editTitle, String editContent, String editWriter) {
        String timeNow = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분").format(new Date());

        notifyData.setValue(new NotifyData(editTitle, editContent, editWriter, timeNow));
        Toast.makeText(context,"작성되었습니다.",Toast.LENGTH_SHORT).show();
    }

//    public void onClickDone(Context context, View view) {
//
//    }

    public MutableLiveData<NotifyData> getNotifyData() {
        return notifyData;
    }
}
