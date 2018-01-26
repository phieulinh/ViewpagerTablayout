package com.framgia.viewpagertablayout2;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Tieu Long Ha on 26/01/2018.
 */

public class TextItemViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;


        public TextItemViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.list_item);
        }

        public void bind(String text) {
            textView.setText(text);


    }

}
