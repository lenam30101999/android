package com.example.listview2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ListAdapter extends BaseAdapter {

    private Activity context;
    private List<Person> persons;
    private int layout;

    public ListAdapter(Activity context, List<Person> persons, int layout) {
        this.context = context;
        this.persons = persons;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return persons.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);

        TextView txtNV = convertView.findViewById(R.id.ma_ten);
        ImageView imgNv = convertView.findViewById(R.id.icon1);
        CheckBox checkBox = convertView.findViewById(R.id.checkBox3);

        Person person = persons.get(position);

        imgNv.setImageResource(person.getImgId());
        txtNV.setText(person.getMaSV()+" - "+person.getNameSV());
        if (person.getGender().equals("Nữ")){
            checkBox.setChecked(true);
        }
        return convertView;
    }
}
