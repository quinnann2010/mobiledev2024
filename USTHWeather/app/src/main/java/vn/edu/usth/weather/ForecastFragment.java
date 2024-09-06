package vn.edu.usth.weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.graphics.Color;

import androidx.fragment.app.Fragment;

public class ForecastFragment extends Fragment {

    public ForecastFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        LinearLayout layout = new LinearLayout(getActivity());
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(16, 16, 16, 16);
        layout.setBackgroundColor(Color.parseColor("#e0f7fa")); // Light blue color

        // Example of adding TextView and ImageView dynamically
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] icons = {R.drawable.sun, R.drawable.rainy, R.drawable.cloudy}; // Replace with actual icon names

        for (int i = 0; i < days.length; i++) {
            TextView dayView = new TextView(getActivity());
            dayView.setText(days[i]);
            dayView.setTextSize(16);
            dayView.setTextColor(Color.BLACK);

            ImageView weatherIcon = new ImageView(getActivity());
            weatherIcon.setImageResource(icons[i % icons.length]); // Use icons cyclically for demo

            // Add TextView and ImageView to the layout
            layout.addView(dayView);
            layout.addView(weatherIcon);
        }

        return layout;
    }

}