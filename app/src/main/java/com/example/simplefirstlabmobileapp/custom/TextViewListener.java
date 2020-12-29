package com.example.simplefirstlabmobileapp.custom;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

/**
 * Класс, отслеживаюший изменения компонента TextView.
 */
public class TextViewListener implements TextWatcher {

    private TextView textView;

    private static final String DEFAULT_VALUE = "Введите текст чуть ниже";

    public TextViewListener(TextView textView) {
        super();
        this.textView = textView;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        checkEditTextView();
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        textView.setText(s);
    }

    @Override
    public void afterTextChanged(Editable s) {
        checkEditTextView();
    }

    private void checkEditTextView() {
        if (textView.getText() != null) {
            if ((textView.getText().toString().isEmpty()) || textView.getText().toString().trim().equals("")) {
                textView.setText(DEFAULT_VALUE);
            }
        }
    }
}
