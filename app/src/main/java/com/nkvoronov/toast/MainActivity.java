package com.nkvoronov.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void onShowToast(View view) {
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(getApplicationContext(), R.string.toast_message, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastContainer = (LinearLayout) toast.getView();
        //toastContainer.setBackgroundColor(Color.TRANSPARENT);
        ImageView catImageView = new ImageView(getApplicationContext());
        catImageView.setImageResource(R.drawable.cat);
        toastContainer.addView(catImageView, 0);
        toast.show();
    }
}
