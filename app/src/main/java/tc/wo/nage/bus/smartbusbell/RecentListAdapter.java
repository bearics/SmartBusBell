package tc.wo.nage.bus.smartbusbell;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by na on 2017-08-20.
 */

public class RecentListAdapter extends ArrayAdapter<BusInformation> {
    RecentListAdapter(Context context, BusInformation[] items) {
        super(context, R.layout.recent_list_item, items);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = inflater.inflate(R.layout.recent_list_item, parent, false);
        TextView busID = (TextView) view.findViewById(R.id.busID);
        TextView busDestination = (TextView) view.findViewById(R.id.busDestination);
        busID.setText(getItem(position).getBusID());
        busDestination.setText(getItem(position).getBusDestination());
        return view;
    }
}
