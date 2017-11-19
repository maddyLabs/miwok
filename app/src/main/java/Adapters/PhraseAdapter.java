package Adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.maddy.miwok.Colors;
import com.example.maddy.miwok.R;
import com.example.maddy.miwok.model.PhrasesList;

import java.util.List;

/**
 * Created by Maddy on 11/15/2017.
 */

public class PhraseAdapter extends ArrayAdapter<PhrasesList>
{

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        if (convertView==null)
        {
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.phrases_view_layout,parent,false);
        }
        PhrasesList objPhraseList=getItem(position);
        TextView textViewOne=(TextView) convertView.findViewById(R.id.txt_textOnePhrases);
        TextView textViewTwo=(TextView) convertView.findViewById(R.id.txt_textTwoPhrases);
        //textViewOne.setTextColor(getContext().getResources().getColor(R.color.colorPrimary));
        //textViewTwo.setTextColor(getContext().getResources().getColor(R.color.colorPrimary));
        //textViewOne.setTypeface(Typeface.MONOSPACE);
        textViewOne.setText(objPhraseList.getmMiwokPhrase().toString());
        textViewTwo.setText(objPhraseList.getmDefaultPhrase().toString());
        return convertView;
    }

    public PhraseAdapter(@NonNull Context context, int resource, @NonNull List<PhrasesList> objects)
    {
        super(context, resource, objects);
    }
}
