package com.example.Black_Pink_Lyrics;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import android.content.Intent;

public class Adapter_Album extends RecyclerView.Adapter<Adapter_Album.myViewHolder> {

    Context mContext;
    List<SingingGroup> mData;
    String myGroup;

//    Activity myActivity;
//    Adapter_Album (Activity activity){
//        myActivity = activity;
//    }

    public Adapter_Album(Context mContext, List<SingingGroup> mData, String mGroup) {
        this.mContext = mContext;
        this.mData = mData;
        this.myGroup = mGroup;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.album_item, parent, false);          //card item here
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(Adapter_Album.myViewHolder holder, int position) {

//        String bs = ((ActivityAlbum)myActivity).myGroup;
//        Log.d("PASSED", bs);

        holder.tv_title.setText(mData.get(position).getProfileName());
        //holder.background_img.setImageResource(mData.get(position).getBackground());
        //holder.profile_photo.setImageResource(mData.get(position).getProfilePhoto());
        //holder.tv_nbfollowers.setText(mData.get(position).getFollowers());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        ImageView profile_photo, background_img;
        TextView tv_title, tv_nbfollowers;
        Button btn_select;

        public myViewHolder(View itemView) {
            super(itemView);


            profile_photo = itemView.findViewById(R.id.profile_photo);
            background_img = itemView.findViewById(R.id.card_background);

            tv_title = itemView.findViewById(R.id.card_title);
            tv_nbfollowers = itemView.findViewById(R.id.card_followers);

            btn_select = itemView.findViewById(R.id.btn_select);

            background_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String songName = (String) tv_title.getText();

                    Intent intent = new Intent(view.getContext(), ActivityVideoPlayer.class);

                    intent.putExtra("songName", songName);
                    intent.putExtra("groupName", myGroup);
                    mContext.startActivity(intent);
                }
            });
            btn_select.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String songName = (String) tv_title.getText();

                    Intent intent = new Intent(view.getContext(), ActivityVideoPlayer.class);

                    intent.putExtra("songName", songName);
                    intent.putExtra("groupName", myGroup);
                    mContext.startActivity(intent);
                }
            });
        }
    }
}
