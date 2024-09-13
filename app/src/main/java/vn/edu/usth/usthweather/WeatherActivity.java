package vn.edu.usth.usthweather;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager2.widget.ViewPager2;

import android.util.Log;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class WeatherActivity extends AppCompatActivity {
    public static final String on_command ="WeatherActivity";
    private ViewPager2 viewPager2;
    private PagerAdapter weatherPagerAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.i(on_command, "from onCreate");
        viewPager2 = findViewById(R.id.viewPager2);
        tabLayout = findViewById(R.id.tabLayout);

        weatherPagerAdapter = new PagerAdapter(this,getLifecycle());

        viewPager2.setAdapter(weatherPagerAdapter);

        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            switch (position){
                case 0:
                    tab.setText("Weather");
                    break;
                case 1:
                    tab.setText("Hanoi");
                    break;
                case 2:
                    tab.setText("Ho Chi Minh");
                    break;
            }
        }).attach();
//        if (savedInstanceState == null){
//            WeatherFragment secondFragment = new WeatherFragment();
//            getSupportFragmentManager().beginTransaction().add(R.id.fragment_weather, secondFragment)
//                    .commit();
//        }
//        if (savedInstanceState == null) {
//            ForecastFragment firstFragment = new ForecastFragment();
//
//            // Add the fragment to the 'main' ConstraintLayout
//            getSupportFragmentManager().beginTransaction()
//                    .add(R.id.fragment_forecast, firstFragment)
//                    .commit();
//        }
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(on_command, "from onResume");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(on_command, "from onStop");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(on_command, "from onStart");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(on_command, "from onDestroy");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(on_command, "from onPause");
    }
}