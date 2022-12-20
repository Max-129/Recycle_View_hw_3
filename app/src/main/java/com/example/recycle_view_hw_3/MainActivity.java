package com.example.recycle_view_hw_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView gamesRV;
    private ArrayList<String> gamesList = new ArrayList<>();

    private RecyclerView mobilePhonesVH;
    private ArrayList<String> mobilePhonesList = new ArrayList<>();

    private RecyclerView socialNetworksVH;
    private ArrayList<String> socialNetworksList = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gamesRV = findViewById(R.id.recycler_view_games);
        loadData();
        GameAdapter adapter = new GameAdapter(gamesList);
        gamesRV.setAdapter(adapter);


        mobilePhonesVH = findViewById(R.id.recycler_view_mobile_phones);
        loadData1();
        MobilePhonesAdapter adapter1 = new MobilePhonesAdapter(mobilePhonesList);
        mobilePhonesVH.setAdapter(adapter1);

        socialNetworksVH = findViewById(R.id.recycler_view_social_networks);
        loadData2();
        SocialNetworksAdapter adapter2 = new SocialNetworksAdapter(socialNetworksList);
        socialNetworksVH.setAdapter(adapter2);
    }

    private void loadData2() {
        socialNetworksList.add("Telegram");
        socialNetworksList.add("WhatsApp");
        socialNetworksList.add("Instagram");
        socialNetworksList.add("VK");
        socialNetworksList.add("Viber");
        socialNetworksList.add("FaceBook");
        socialNetworksList.add("TikTok");
    }


    private void loadData() {
        gamesList.add("Crysis 3");
        gamesList.add("FarCry 3");
        gamesList.add("Plants VS Zombies");
        gamesList.add("S.T.A.L.K.E.R. Call Of Chernobyl");
        gamesList.add("Minecraft");
        gamesList.add("Battlefield 2");
        gamesList.add("Roblox");
    }



    private void loadData1() {
        mobilePhonesList.add("Xiaomi");
        mobilePhonesList.add("Huavei");
        mobilePhonesList.add("Google Pixel");
        mobilePhonesList.add("Honor");
        mobilePhonesList.add("IPhone");
        mobilePhonesList.add("Samsung");
        mobilePhonesList.add("OnePlus");
        mobilePhonesList.add("RealMe");
    }

}