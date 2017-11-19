package Adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maddy.miwok.R;
import com.example.maddy.miwok.model.WordColors;

import java.util.ArrayList;

/**
 * Created by Maddy on 11/15/2017.
 */

public class ColorsAdapter extends ArrayAdapter<WordColors>
{

    public ColorsAdapter(@NonNull Context context, int resource, ArrayList<WordColors> objWordColors) {
        super(context, 0, objWordColors);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItemView=convertView;
        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.colors_layout,parent,false);
        }
        WordColors obj=getItem(position);
        TextView txtViewOne=(TextView) listItemView.findViewById(R.id.txt_miwokColorName);
        TextView txtViewTwo=(TextView) listItemView.findViewById(R.id.txt_defaultColorName);
        ImageView image_colors=(ImageView) listItemView.findViewById(R.id.image_colors);
        txtViewOne.setText(obj.getMewokTranslation());
        txtViewTwo.setText(obj.getDefaultTranslation());
//        txtViewOne.setTextColor(getContext().getResources().getColor(R.color.textColor));
//        txtViewTwo.setTextColor(getContext().getResources().getColor(R.color.textColor));
        image_colors.setImageResource(obj.getmColorImage());
        return listItemView;
    }
}

