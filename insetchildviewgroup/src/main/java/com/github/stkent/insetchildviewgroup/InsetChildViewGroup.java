package com.github.stkent.insetchildviewgroup;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class InsetChildViewGroup extends ViewGroup {

    public InsetChildViewGroup(final Context context) {
        super(context);
    }

    public InsetChildViewGroup(final Context context, final AttributeSet attrs) {
        super(context, attrs);
    }

    public InsetChildViewGroup(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {

    }

}
