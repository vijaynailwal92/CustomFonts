package com.vijay.customfonts;

import android.content.Context;
import android.graphics.Typeface;

public class TypeFactory {

    private String A_BOLD= "fonts/Amble-Bold.ttf";
    private String A_LIGHT= "fonts/Amble-Light.ttf";
    private String A_REGULAR= "fonts/Amble-Regular.ttf";
    private String O_ITALIC= "fonts/OpenSans-Italic.ttf";
    private String O_REGULAR= "fonts/OpenSans-Regular.ttf";

    Typeface ambleBold;
    Typeface ambleLight;
    Typeface ambleRegular;
    Typeface openSansItalic;
    Typeface openSansRegular;

    public TypeFactory(Context context){
        ambleBold = Typeface.createFromAsset(context.getAssets(),A_BOLD);
        ambleLight = Typeface.createFromAsset(context.getAssets(),A_LIGHT);
        ambleRegular = Typeface.createFromAsset(context.getAssets(),A_REGULAR);
        openSansItalic = Typeface.createFromAsset(context.getAssets(),O_ITALIC);
        openSansRegular = Typeface.createFromAsset(context.getAssets(),O_REGULAR);
    }

}
