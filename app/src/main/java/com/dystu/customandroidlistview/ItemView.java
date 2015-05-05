package com.dystu.customandroidlistview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2015/5/5.
 */
public class ItemView extends RelativeLayout {

    private TextView mTitleTextView;

    private TextView mDescriptionTextView;

    private ImageView mImageView;

    public static ItemView inflate(ViewGroup parent){
        ItemView itemView = (ItemView) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return  itemView;
    }

    public ItemView(Context context) {
        this(context, null);
    }

    public ItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.item_view_children,this,true);
        setUpChildren();
    }

    private void setUpChildren() {
        mTitleTextView = (TextView) findViewById(R.id.item_titleTextView);
        mDescriptionTextView = (TextView) findViewById(R.id.item_descriptionTextView);
        mImageView = (ImageView) findViewById(R.id.item_imageView);
    }

    public void setItem(Item item){
        mTitleTextView.setText(item.getTitle());
        mDescriptionTextView.setText(item.getDescription());
    }

    public TextView getTitleTextView() {
        return mTitleTextView;
    }

    public TextView getDescriptionTextView() {
        return mDescriptionTextView;
    }

    public ImageView getImageView() {
        return mImageView;
    }
}
