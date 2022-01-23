package ru.gb.lesson11.ui.additionalExpenses;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AdditionalExpensesViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AdditionalExpensesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Здесь будут вестись дополнительные расходы");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
