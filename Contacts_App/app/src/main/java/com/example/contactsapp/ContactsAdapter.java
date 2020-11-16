package android.example.contactsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contactsapp.R;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder> {
    private Context context;
    private List<android.example.contactsapp.ContactsModel> contactModelList;
    private int colorResId;

    public ContactsAdapter(Context context, List <android.example.contactsapp.ContactsModel> list, int colorResId){

        this.context=context;
        this.contactModelList=list;
        this.colorResId = colorResId;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view= layoutInflater.inflate (R.layout.list_items, parent, false);
        ContactViewHolder contactViewHolder= new ContactViewHolder(view);
        return contactViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        holder.name.setText(contactModelList.get(position).getName());
        holder.gmail.setText(contactModelList.get(position).getEmail());
        holder.ph.setText(contactModelList.get(position).getPhno());
        int color = ContextCompat.getColor(context,colorResId);
        holder.textContainer.setBackgroundColor(color);
        if (contactModelList.get(position).hasImage()){
            holder.image.setImageResource(contactModelList.get(position).getImage());
            holder.image.setVisibility(View.VISIBLE);
        } else {
            holder.image.setVisibility(View.GONE);
        }
    }


    @Override
    public int getItemCount() {
        return contactModelList.size();
    }

    class ContactViewHolder extends RecyclerView.ViewHolder{

        TextView name, gmail, ph;
        ImageView image;
        View textContainer;

        public ContactViewHolder(@NonNull View itemview) {
            super(itemview);
            name= itemview.findViewById(R.id.tv1);
            gmail=itemview.findViewById(R.id.tv2);
            ph=itemview.findViewById(R.id.tv3);
            image=itemview.findViewById(R.id.image);
            textContainer = itemview.findViewById(R.id.text_container);
        }
    }
}