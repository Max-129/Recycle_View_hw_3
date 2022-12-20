package com.example.recycle_view_hw_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycle_view_hw_3.R;

public class SocialNetworksVH extends RecyclerView.ViewHolder {

    private TextView tvSocialPhones;

    public SocialNetworksVH(@NonNull View itemView) {
        super(itemView);

        tvSocialPhones = itemView.findViewById(R.id.tv_soc_net);
    }

    public void bind2(String socialNetworks){
        tvSocialPhones.setText(socialNetworks);
    }
}
