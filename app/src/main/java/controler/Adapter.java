package controler;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import model.Model;
import view.ViewHolder;

/**
 * Created by muridjonrahimov on 11/21/17.
 */

public class Adapter extends RecyclerView.Adapter<ViewHolder> {

    public Adapter(List<Model>list) {


    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
