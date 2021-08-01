package com.example.livedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LiveDataWithIiewModel extends ViewModel {

    private MutableLiveData<Integer> likeNum;

//    LiveDataWithIiewModel() {
//        likeNum = new MutableLiveData<>();
//        likeNum.setValue(1);
//    }

    public MutableLiveData<Integer> getLikeNum() {
        if (likeNum == null) {
            likeNum = new MutableLiveData<>();
            likeNum.setValue(1);
        }
        return likeNum;
    }

    public void addNum(int x){
        likeNum.setValue(likeNum.getValue()+x);
    }
}
