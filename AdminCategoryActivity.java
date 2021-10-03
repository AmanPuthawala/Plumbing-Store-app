package com.app.shopping;


import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class AdminCategoryActivity extends AppCompatActivity {
    private ImageView tShirts, sportsTShirts, femaleDresses, sweathers;
    private ImageView glasses, hatsCaps, walletsBagsPurses, shoes;
    private ImageView headPhonesHandFree, Laptops, watches, mobilePhones;
    private Button LogoutBtn, CheckOrdersBtn;
    float v = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        getSupportActionBar().hide();

        LogoutBtn = (Button) findViewById(R.id.admin_logout_btn);
        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
            }
        });
        CheckOrdersBtn = (Button) findViewById(R.id.check_orders_btn);


        CheckOrdersBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(AdminCategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
            }
        });



        femaleDresses = (ImageView) findViewById(R.id.te);
        sweathers = (ImageView) findViewById(R.id.nintydigryband);

        glasses = (ImageView) findViewById(R.id.pipes);
        hatsCaps = (ImageView) findViewById(R.id.band);
        walletsBagsPurses = (ImageView) findViewById(R.id.walve);
        shoes = (ImageView) findViewById(R.id.rwalve);



        femaleDresses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Tee");
                startActivity(intent);
            }
        });


        sweathers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Ninety Degree valve");
                startActivity(intent);
            }
        });


        glasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Pipes");
                startActivity(intent);
            }
        });


        hatsCaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Band");
                startActivity(intent);
            }
        });



        walletsBagsPurses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Valve");
                startActivity(intent);
            }
        });


        shoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, com.app.shopping.AdminAddNewProductActivity.class);
                intent.putExtra("category", "Rvalve");
                startActivity(intent);
            }
        });


        femaleDresses.setTranslationY(300);
        sweathers.setTranslationY(300);
        glasses.setTranslationY(300);
        hatsCaps.setTranslationY(300);
        walletsBagsPurses.setTranslationY(300);
        shoes.setTranslationY(300);
        CheckOrdersBtn.setTranslationX(300);
        LogoutBtn.setTranslationX(300);

        femaleDresses.setAlpha(v);
        sweathers.setAlpha(v);
        glasses.setAlpha(v);
        hatsCaps.setAlpha(v);
        walletsBagsPurses.setAlpha(v);
        shoes.setAlpha(v);
        CheckOrdersBtn.setAlpha(v);
        LogoutBtn.setAlpha(v);

        femaleDresses.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400);
        sweathers.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400);
        glasses.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400);
        hatsCaps.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400);
        walletsBagsPurses.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400);
        shoes.animate().translationY(0).alpha(1).setDuration(1000).setStartDelay(400);
        CheckOrdersBtn.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(900);
        LogoutBtn.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(900);
    }
}
