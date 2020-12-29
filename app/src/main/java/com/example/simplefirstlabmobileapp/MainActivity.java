package com.example.simplefirstlabmobileapp;

import com.example.simplefirstlabmobileapp.custom.DatePickerDialogFragment;
import com.example.simplefirstlabmobileapp.custom.ImageViewChange;
import com.example.simplefirstlabmobileapp.custom.TextViewListener;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener {

    private final static String SELECT_DATE = "Выбранная дата: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = findViewById(R.id.editText);
        TextView editTextView = findViewById(R.id.editTextView);
        TextView dateTextView = findViewById(R.id.dateTextView);

        editText.addTextChangedListener(new TextViewListener(editTextView));

        dateTextView.setOnClickListener(v -> {
            DialogFragment datePicker = new DatePickerDialogFragment();
            datePicker.show(getSupportFragmentManager(), "date picker");
        });

        spinnerListener();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        String selectedDate = SELECT_DATE +  dayOfMonth + "." + (month + 1) + "." + year;

        TextView dateTextView = findViewById(R.id.dateTextView);
        dateTextView.setText(selectedDate);
    }

    private void spinnerListener() {
        ImageView imageView = findViewById(R.id.imageChoiceSpinner);
        Spinner spinner = findViewById(R.id.spinner);
        ImageViewChange changeImage = new ImageViewChange();

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent,
                                       View itemSelected, int selectedItemPosition, long selectedId) {

                String[] choose = getResources().getStringArray(R.array.spinnerStorage);
                changeImage.setImage(imageView, choose[selectedItemPosition]);
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }
}