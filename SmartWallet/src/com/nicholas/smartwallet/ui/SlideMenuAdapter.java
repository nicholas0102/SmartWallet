
package com.nicholas.smartwallet.ui;
  
import java.util.ArrayList;

import com.nicholas.smartwallet.model.SlideMenuItem;
import com.nicholas.smartwallet.ui.R;
 
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
 
public class SlideMenuAdapter extends BaseAdapter {
     
    private Context context;
    private ArrayList<SlideMenuItem> slideMenuItems;
     
    public SlideMenuAdapter(Context context, ArrayList<SlideMenuItem> slideMenuItems){
        this.context = context;
        this.slideMenuItems = slideMenuItems;
    }
 
    @Override
    public int getCount() {
        return slideMenuItems.size();
    }
 
    @Override
    public Object getItem(int position) {       
        return slideMenuItems.get(position);
    }
 
    @Override
    public long getItemId(int position) {
        return position;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.listitem_slidemenu, null);
        }
          
        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.slideIcon_image);
        TextView txtTitle = (TextView) convertView.findViewById(R.id.slideTitle_text);
          
        imgIcon.setImageResource(slideMenuItems.get(position).getIcon());        
        txtTitle.setText(slideMenuItems.get(position).getTitle());
         
        return convertView;
    }
 
}