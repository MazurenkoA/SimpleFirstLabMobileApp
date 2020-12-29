package com.example.simplefirstlabmobileapp.custom;

import android.widget.ImageView;

import com.example.simplefirstlabmobileapp.storage.SpinnerStorage;

/**
 *  Заменяет изображение в зависимости от выбранной строки.
 */
public class ImageViewChange {

    public void setImage(ImageView imageView, String str) {
        if (SpinnerStorage.storage.get(str) != null) {
            imageView.setImageResource(SpinnerStorage.storage.get(str));
        }
    }
}
