package ru.gb.lesson11.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AdditionalIncomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AdditionalIncomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Здесь будет вестись дополнительный доход");
    }

    public LiveData<String> getText() {
        return mText;
    }
}