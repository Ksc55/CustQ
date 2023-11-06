package com.devposthackathon.managementsystem;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.button.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class ExitConfirmationActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private TextView textview1;
	private CardView cardview1;
	private LinearLayout linear4;
	private TextView textview4;
	private TextView textview5;
	private LinearLayout linear5;
	private LinearLayout linear2;
	private ImageView imageview1;
	private MaterialButton materialbutton1;
	private MaterialButton materialbutton2;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.exit_confirmation);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		textview1 = findViewById(R.id.textview1);
		cardview1 = findViewById(R.id.cardview1);
		linear4 = findViewById(R.id.linear4);
		textview4 = findViewById(R.id.textview4);
		textview5 = findViewById(R.id.textview5);
		linear5 = findViewById(R.id.linear5);
		linear2 = findViewById(R.id.linear2);
		imageview1 = findViewById(R.id.imageview1);
		materialbutton1 = findViewById(R.id.materialbutton1);
		materialbutton2 = findViewById(R.id.materialbutton2);
	}
	
	private void initializeLogic() {
		_decorateView();
	}
	
	public void _decorateView() {
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bold.ttf"), 1);
		materialbutton2.setStrokeWidth((int) 0.5d);
		materialbutton2.setStrokeColor(ColorStateList.valueOf(0xFF212121));
	}
	
}