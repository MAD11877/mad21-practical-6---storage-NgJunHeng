package sg.edu.np.week6practical;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder {
    public TextView name;
    public TextView des;
    public ImageView icon;
    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.textName);
        des = itemView.findViewById(R.id.textDes);
        icon = itemView.findViewById(R.id.icon);

    }
}
