package com.devposthackathon.managementsystem;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.net.Uri;
import android.os.*;
import android.os.Bundle;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class HomeScreenActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private FrameLayout frameLayout;
	private BottomNavigationView bottomnavigation1;
	
	private Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home_screen);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		frameLayout = findViewById(R.id.frameLayout);
		bottomnavigation1 = findViewById(R.id.bottomnavigation1);
		
		bottomnavigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(MenuItem item) {
				final int _itemId = item.getItemId();
				Fragment selectedFragment = null;
							if (item.getItemId() == R.id.navigation_item_1) {
									selectedFragment = new DashboardFragmentActivity();
							} else if (item.getItemId() == R.id.navigation_item_2) {
									selectedFragment = new QueueStatusFragmentActivity();
							}
							// Handle other navigation items here
				
							if (selectedFragment != null) {
									getSupportFragmentManager().beginTransaction()
											.replace(R.id.frameLayout, selectedFragment)
											.commit();
							}
				return true;
			}
		});
	}
	
	private void initializeLogic() {
		bottomnavigation1.setSelectedItemId(R.id.navigation_item_1);
		_showInitialFragment();
	}
	
	@Override
	public void onBackPressed() {
		com.google.android.material.snackbar.Snackbar.make(linear1, "Are you sure you want to exit", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction("Exit", new View.OnClickListener(){
			@Override
			public void onClick(View _view) {
				finishAffinity();
			}
		}).show();
	}
	public void _showInitialFragment() {
		Fragment initialFragment = new DashboardFragmentActivity(); // Replace with your desired initial fragment
				getSupportFragmentManager().beginTransaction()
				    .replace(R.id.frameLayout, initialFragment)
				    .commit();
	}
	
}