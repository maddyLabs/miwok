package Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.maddy.miwok.R;
import com.example.maddy.miwok.model.FamilyList;
import com.example.maddy.miwok.model.WordColors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maddy on 11/15/2017.
 */

public class FamilyAdapter extends ArrayAdapter<FamilyList>
{

    public FamilyAdapter(@NonNull Context context, int resource, @NonNull ArrayList<FamilyList> objFamilyList) {
        super(context, 0, objFamilyList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {

        View listItemView=convertView;
        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.family_layout,parent,false);
        }
        FamilyList objFamilyList=getItem(position);
        TextView txtViewOne=(TextView) listItemView.findViewById(R.id.txt_defaultFamilyName);
        TextView txtViewTwo=(TextView) listItemView.findViewById(R.id.txt_miwokFamilyName);
        ImageView image_family=(ImageView) listItemView.findViewById(R.id.image_family);
        image_family.setImageResource(objFamilyList.getmImageId());
        txtViewOne.setText(objFamilyList.getmMiwokName().toString());
        txtViewTwo.setText(objFamilyList.getmDefaultName().toString());
        return listItemView;
    }
}
