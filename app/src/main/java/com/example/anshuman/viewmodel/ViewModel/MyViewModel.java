package com.example.anshuman.viewmodel.ViewModel;

import android.arch.lifecycle.ViewModel;

/**
 * Created by anshuman on 30-01-2018.
 */

public class MyViewModel extends ViewModel {
    public String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
