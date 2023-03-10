package com.yjkim.mvvmweather.view.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModel;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;

import com.yjkim.mvvmweather.databinding.ActivityMainBinding;
import com.yjkim.mvvmweather.view.fragment.BingoFragment;
import com.yjkim.mvvmweather.view.fragment.MatchPictureFragment;
import com.yjkim.mvvmweather.view.fragment.MenuFragment;
import com.yjkim.mvvmweather.view.fragment.QuizFragment;

public class MainActivity extends AppCompatActivity {

//    private final ViewModel mMainViewModel;
    private ActivityMainBinding mBinding;
    private FragmentManager mContainer;

    private MenuFragment mMenu;
    private BingoFragment mBingo;
    private MatchPictureFragment mMatchPicture;
    private QuizFragment mQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(mBinding.getRoot());
        mContainer = getSupportFragmentManager();

        mBinding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                getSupportFragmentManager().beginTransaction().remove().commit();
            }
        });

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

    private void setMenuIcon() {

    }
}