package ru.gb.lesson11.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BasicIncomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BasicIncomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Здесь будет вестись основной доход");
    }

    public LiveData<String> getText() {
        return mText;
    }
}