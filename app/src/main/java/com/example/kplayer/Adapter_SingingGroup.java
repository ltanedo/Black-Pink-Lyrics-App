package com.example.kplayer;

import android.content.Context;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter_SingingGroup extends RecyclerView.Adapter<Adapter_SingingGroup.myViewHolder> {

    Context mContext;
    List<SingingGroup> mData;
    String myGroup;

    public Adapter_SingingGroup(Context mContext, List<SingingGroup> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.singing_group_item, parent, false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(Adapter_SingingGroup.myViewHolder holder, int position) {
        holder.tv_title.setText(mData.get(position).getProfileName());
        holder.background_img.setImageResource(mData.get(position).getBackground());
        //holder.profile_photo.setImageResource(mData.get(position).getProfilePhoto());
        holder.tv_nbfollowers.setText(mData.get(position).getFollowers());
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

//            String text = (String) tv_title.getText();
//            Log.d("variable", text);


//            background_img.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    String groupName = (String) tv_title.getText();
////                    Log.d("variable", text)
//                    Intent intent = new Intent(view.getContext(), ActivityAlbum.class);
//                    intent.putExtra("group_name", groupName);
//                    mContext.startActivity(intent);
//                }
//            });
//            btn_select.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    String groupName = (String) tv_title.getText();
////                    Log.d("variable", text)
//                    Intent intent = new Intent(view.getContext(), ActivityAlbum.class);
//                    intent.putExtra("group_name", groupName);
//                    mContext.startActivity(intent);
//                }
//            });
            background_img.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String songName = (String) tv_title.getText();
                    String subtitleName = songName.replaceAll(" ", "");
                    subtitleName = subtitleName.replaceAll("'", "");
                    subtitleName = subtitleName.replaceAll("-", "");
                    String urlResource = subtitleName + "_URL";

                    Intent intent = new Intent(view.getContext(), ActivityVideoPlayer.class);

                    intent.putExtra("songName", songName);
                    intent.putExtra("urlResource", urlResource);
                    mContext.startActivity(intent);
                }
            });
            btn_select.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String songName = (String) tv_title.getText();
                    String subtitleName = songName.replaceAll(" ", "");
                    subtitleName = subtitleName.replaceAll("'", "");
                    subtitleName = subtitleName.replaceAll("-", "");
                    String urlResource = subtitleName + "_URL";

                    Intent intent = new Intent(view.getContext(), ActivityVideoPlayer.class);

                    intent.putExtra("songName", songName);
                    intent.putExtra("urlResource", urlResource);
                    mContext.startActivity(intent);
                }
            });
        }
    }
}
