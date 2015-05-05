package com.dystu.customandroidlistview;

/**
 * Created by Administrator on 2015/5/5.
 */
public class Item {
    private String mImageUrl;

    private String mTitle;

    private String mDescription;

    public Item(String mImageUrl, String mTitle, String mDescription) {
        this.mImageUrl = mImageUrl;
        this.mTitle = mTitle;
        this.mDescription = mDescription;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
