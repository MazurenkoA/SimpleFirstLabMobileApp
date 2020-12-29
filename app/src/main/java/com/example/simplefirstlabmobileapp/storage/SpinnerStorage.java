package com.example.simplefirstlabmobileapp.storage;

import android.util.ArrayMap;

import com.example.simplefirstlabmobileapp.R;

/**
 * Хранилище для выпадеющего списка (Spinner).
 */
public class SpinnerStorage {

    public static ArrayMap<String, Integer> storage = new ArrayMap<>();

    static {
        storage.put("Ничего не выбрано ( ´･･)ﾉ(._.`)", R.drawable.whatdo);
        storage.put("Пользователь (^_^)", R.drawable.leo);
        storage.put("Вся суть (¬‿¬)", R.drawable.garold);
        storage.put("Путь", R.drawable.way);
    }
}
