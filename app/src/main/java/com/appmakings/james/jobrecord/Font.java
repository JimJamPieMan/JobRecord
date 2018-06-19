package com.appmakings.james.jobrecord;

import android.app.Application;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * Created by rudla on 13/11/2016.
 */

public class Font extends Application {

    private Typeface normalFont;
    private Typeface boldFont;


    // -- Fonts -- //
    public void setTypeface(TextView textView) {
        if(textView != null) {
            if(textView.getTypeface() != null && textView.getTypeface().isBold()) {
                textView.setTypeface(getBoldFont());
            } else {
                textView.setTypeface(getNormalFont());
            }
        }
    }

    private Typeface getNormalFont() {
        if(normalFont == null) {
            normalFont = Typeface.createFromAsset(getAssets(),"fonts/GoogleLogoFont.ttf");
        }
        return this.normalFont;
    }

    private Typeface getBoldFont() {
        if(boldFont == null) {
            boldFont = Typeface.createFromAsset(getAssets(),"fonts/GoogleLogoFontBold.ttf");
        }
        return this.boldFont;
    }
}