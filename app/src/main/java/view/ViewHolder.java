package view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.watsismyaddress.R;

/**
 * Created by muridjonrahimov on 11/21/17.
 */

public class ViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;

    public ViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.item_view_textview);
    }
    public void onBind(String email) {


    }
}
