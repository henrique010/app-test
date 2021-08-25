package com.example.tcc_implementation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.tcc_implementation.ui.main.MainFragment;
import com.n1analytics.paillier.PaillierPrivateKey;
import com.n1analytics.paillier.PaillierPublicKey;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.loadLibrary("gmp");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }

        PaillierPrivateKey keyPair = PaillierPrivateKey.create(1024);

        Log.i(null, "DEU BOM");
//        PaillierPublicKey publicKey = keyPair.getPublicKey();
    }

    static {
        System.loadLibrary("gmp");
    }
}