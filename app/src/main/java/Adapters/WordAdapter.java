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
import com.example.maddy.miwok.model.Word;

import java.util.List;

/**
 * Created by Maddy on 11/11/2017.
 */

public class WordAdapter extends ArrayAdapter<Word>
{
    public WordAdapter(@NonNull Context context, int resource, @NonNull List<Word> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listitemview=convertView;
        if(listitemview==null)
        {
            listitemview=LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word objWord=getItem(position);
        TextView textViewOne=(TextView) listitemview.findViewById(R.id.txt_defaultWords);
        TextView textViewTwo=(TextView) listitemview.findViewById(R.id.txt_miwokWords);
        ImageView img_numbers=(ImageView) listitemview.findViewById(R.id.img_numbers);
        textViewOne.setText(objWord.getMewokTranslation().toString());
        textViewTwo.setText(objWord.getDefaultTranslation().toString());
        img_numbers.setImageResource(objWord.getmNumberImage());
        return listitemview;
    }
}
