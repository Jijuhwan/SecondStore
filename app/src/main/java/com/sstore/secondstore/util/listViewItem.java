package com.sstore.secondstore.util;

import android.graphics.drawable.Drawable;

public class listViewItem {
    private Drawable iconDrawable;
    private String titleStr;
    private String countStr;

    public void setIcon(Drawable icon)
    {
        iconDrawable = icon;
    }
    public void setTitle(String title)
    {
        titleStr = title;
    }
    public void setCount(String count)
    {
        countStr = count;
    }

    public Drawable getIcon()
    {
        return this.iconDrawable;
    }
    public String getTitle()
    {
        return this.titleStr;
    }
    public String getCount()
    {
        return this.countStr;
    }

}
