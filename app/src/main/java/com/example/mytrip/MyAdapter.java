package com.example.mytrip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.mtp.MtpDeviceInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {

    private ArrayList<MyItem> mItems = new ArrayList<>();


    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public MyItem getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Context context = parent.getContext();
        int pos = position;

        if ( convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.placelist_custom, parent, false);
        }

        ImageView image = (ImageView) convertView.findViewById(R.id.img);
        TextView name = (TextView) convertView.findViewById(R.id.title);
        TextView content = (TextView) convertView.findViewById(R.id.context);

        MyItem myItem = getItem(position);

        image.setImageDrawable(myItem.getIcon());
        name.setText(myItem.getName());
        content.setText(myItem.getContents());

        convertView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Toast.makeText(context, (pos + 1) + " 번째 리스트가 클릭 되었습니다.", Toast.LENGTH_SHORT).show();;
            }
        });

        return convertView;
    }

    public void addItem(Drawable img, String name, String contents){

        MyItem mItem = new MyItem();

        mItem.setIcon(img);
        mItem.setName(name);
        mItem.setContents(contents);

        mItems.add(mItem);

    }
}
