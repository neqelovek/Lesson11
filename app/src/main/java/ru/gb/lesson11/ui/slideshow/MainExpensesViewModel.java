package ru.gb.lesson11.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainExpensesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MainExpensesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Здесь будет вестись основной расход(Камуналка, обязательные продукты питания," +
                "транспортные расходы и т.д.)");
    }

    public LiveData<String> getText() {
        return mText;
    }
}