import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.example.androidversionapp.R; // <-- Add this line with your real package name

public class AndroidVersionAdapter extends BaseAdapter {

    Context context;
    List<AndroidVersion> versionList;

    public AndroidVersionAdapter(Context context, List<AndroidVersion> versionList) {
        this.context = context;
        this.versionList = versionList;
    }

    @Override
    public int getCount() {
        return versionList.size();
    }

    @Override
    public Object getItem(int position) {
        return versionList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);

        ImageView imageView = view.findViewById(R.id.item_image);
        TextView titleView = view.findViewById(R.id.item_title);
        TextView subtitleView = view.findViewById(R.id.item_subtitle);

        AndroidVersion version = versionList.get(position);

        imageView.setImageResource(version.image);
        titleView.setText(version.title);
        subtitleView.setText(version.description);

        return view;
    }
}
