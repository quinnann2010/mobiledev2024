package vn.edu.usth.weather;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class WeatherActivity extends AppCompatActivity {

    private static final String TAG = "WeatherActivity";


    View view;

    @SuppressLint("ResourceAsColor")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// Set the user interface layout for this Activity
// The layout file is defined in the project res/layout/main_activity.xml fisetContentView(R.layout.main_activity);
// Initialize member TextView so we can manipulate it later

        Log.i(TAG,"OnCreate called");
        setContentView(R.layout.weather_activity);
        // Add ForecastFragment to the activity
        ForecastFragment forecastFragment = new ForecastFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Assuming there's a container in your activity layout with id 'fragment_container'
        fragmentTransaction.add(R.id.main, forecastFragment);
        fragmentTransaction.commit();
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy called");
    }

}