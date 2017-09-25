package com.admin.languageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.TextView.OnEditorActionListener;

public class LanguageActivity extends AppCompatActivity implements OnClickListener, OnEditorActionListener
{
    private TextView LanguageSelectionId;
    private TextView OutputViewId;
    private RadioButton EnglishRadioId;
    private RadioButton SpanishRadioId;
    private ImageButton TranslateButtonId;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        OutputViewId = (TextView) findViewById(R.id.OutputViewId);
        LanguageSelectionId = (TextView) findViewById(R.id.LanguageSelectionId);
        EnglishRadioId = (RadioButton) findViewById(R.id.EnglishRadioId);
        SpanishRadioId = (RadioButton) findViewById(R.id.SpanishRadioId);
        TranslateButtonId = (ImageButton) findViewById(R.id.TranslateButtonId);

        TranslateButtonId.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if (v.getId() == R.id.TranslateButtonId)
        {
            translate();
        }
    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event)
    {
        return false;
    }

    public void translate()
    {
        String spanishLanguageSelection = "Seleccione el idioma";
        String englishLanguageSelection = "Select Language";
        String spanishLanguageSpanishRadio = "Espanol";
        String spanishLanguageEnglishRadio = "Ingles";
        String englishLanguageEnglishRadio = "English";
        String englishLanguageSpanishRadio = "Spanish";
        String outputViewSpanish = "Ahora estás viendo en Español";
        String outputViewEnglish = "You are now viewing in English";

        if(SpanishRadioId.isChecked())
        {
            LanguageSelectionId.setText(spanishLanguageSelection);
            OutputViewId.setText(outputViewSpanish);
            EnglishRadioId.setText(spanishLanguageEnglishRadio);
            SpanishRadioId.setText(spanishLanguageSpanishRadio);
        }
        else if(EnglishRadioId.isChecked())
        {
            LanguageSelectionId.setText(englishLanguageSelection);
            OutputViewId.setText(outputViewEnglish);
            EnglishRadioId.setText(englishLanguageEnglishRadio);
            SpanishRadioId.setText(englishLanguageSpanishRadio);
        }
    }
}
