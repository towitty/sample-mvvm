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

    private void setNotify(TextView tvTitle, TextView tvContent, TextView tvWriter) {
        String title = tvTitle.getText().toString();
        String content = tvContent.getText().toString();
        String writer = tvWriter.getText().toString();
        String time = getNowTime();

        notifyData.setValue(new NotifyData(title, content, writer, time));
    }

    private String getNowTime() {
        return new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분").format(new Date());
    }

//    public void onClickDone(Context context, View view) {
//        Toast.makeText(context,"Button Click",Toast.LENGTH_SHORT).show();
//    }
}
