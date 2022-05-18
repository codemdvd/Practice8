package ru.mirea.apasov.livedata;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.lifecycle.Observer;
import android.os.Handler;

public class MainActivity extends AppCompatActivity implements Observer<String> {
    private TextView networkNameTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        networkNameTextView = findViewById(R.id.textView);
        TimeLiveData.getDate().observe(this, this);
        Handler handler = new Handler();
        handler.postDelayed(TimeLiveData::setTime,1000);
    }
    @Override
    public void onChanged(@Nullable String s) {
        Log.d(MainActivity.class.getSimpleName(), s + "");
        networkNameTextView.setText("" + s);
    }
}