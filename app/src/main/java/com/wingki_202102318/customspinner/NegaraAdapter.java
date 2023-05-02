package com.wingki_202102318.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class NegaraAdapter extends BaseAdapter {
    private Context _context;
    private List<String> _negaralist;

    public NegaraAdapter(Context _context, List<String> _negaralist) {
        this._context = _context;
        this._negaralist = _negaralist;
    }

    @Override
    public int getCount() {
        //return (negaraList !=null) ? negaraLis.size() ; 0;

        if (_negaralist != null) {
            return _negaralist.size();
        }
        else {
            return 0;
        }
    }

    @Override
    public Object getItem(int i) { return null; }

    @Override
    public long getItemId(int i) { return 0; }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = LayoutInflater.from(_context);
        view = inflater.inflate(R.layout.spinner_a, null);

        TextView textView1 = (TextView)view.findViewById(R.id.textView1);
        String negara = _negaralist.get(i);
        textView1.setText(negara);

        ImageView imageView1 = (ImageView)view.findViewById(R.id.imageView1);

        switch (negara) {
            case "Albania":
                imageView1.setImageResource(R.drawable.albania);
                break;

            case "Belgia":
                imageView1.setImageResource(R.drawable.belgia);
                break;

            case "Hungary":
                imageView1.setImageResource(R.drawable.hungary);
                break;

            case "Iran":
                imageView1.setImageResource(R.drawable.iran);
                break;

            case "Slovena":
                imageView1.setImageResource(R.drawable.slovenia);
                break;
        }

        return view;
    }
}