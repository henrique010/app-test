package com.example.tcc_implementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.tcc_implementation.paillier.PaillierPrivateKey;
import com.example.tcc_implementation.paillier.PaillierPublicKey;
import com.example.tcc_implementation.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
        PaillierPrivateKey keyPair = PaillierPrivateKey.create(1024);
        PaillierPublicKey publicKey = keyPair.getPublicKey();
    }
}