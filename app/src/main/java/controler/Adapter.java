package controler;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import model.Model;
import nyc.c4q.watsismyaddress.R;
import view.ViewHolder;

/**
 * Created by muridjonrahimov on 11/21/17.
 */

public class Adapter extends RecyclerView.Adapter<ViewHolder> {


    private List<String> list;

    public Adapter(List<String> list) {
        this.list = list;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.onBind(list.get(position));



    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
