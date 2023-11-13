package com.devposthackathon.managementsystem;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.Intent;
import android.content.res.*;
import android.graphics.*;
import android.graphics.Typeface;
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
import android.view.View;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.button.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.regex.*;
import org.json.*;

public class RateServiceActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private LinearLayout linear1;
	private TextView textview1;
	private ScrollView vscroll1;
	private LinearLayout linear5;
	private CardView cardview1;
	private LinearLayout linear2;
	private TextView textview2;
	private TextView textview3;
	private RadioButton radiobutton1;
	private RadioButton radiobutton2;
	private RadioButton radiobutton3;
	private RadioButton radiobutton4;
	private RadioButton radiobutton5;
	private LinearLayout linear3;
	private MaterialButton materialbutton1;
	private EditText edittext1;
	
	private Intent intent = new Intent();
	private TimerTask timer;
	private AlertDialog cust;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.rate_service);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		textview1 = findViewById(R.id.textview1);
		vscroll1 = findViewById(R.id.vscroll1);
		linear5 = findViewById(R.id.linear5);
		cardview1 = findViewById(R.id.cardview1);
		linear2 = findViewById(R.id.linear2);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		radiobutton1 = findViewById(R.id.radiobutton1);
		radiobutton2 = findViewById(R.id.radiobutton2);
		radiobutton3 = findViewById(R.id.radiobutton3);
		radiobutton4 = findViewById(R.id.radiobutton4);
		radiobutton5 = findViewById(R.id.radiobutton5);
		linear3 = findViewById(R.id.linear3);
		materialbutton1 = findViewById(R.id.materialbutton1);
		edittext1 = findViewById(R.id.edittext1);
		
		radiobutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (radiobutton1.isChecked()) {
					radiobutton1.setChecked(false);
				}
			}
		});
		
		radiobutton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (radiobutton2.isChecked()) {
					radiobutton1.setChecked(false);
				}
			}
		});
		
		radiobutton3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (radiobutton2.isChecked()) {
					radiobutton1.setChecked(false);
				}
			}
		});
		
		radiobutton4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (radiobutton2.isChecked()) {
					radiobutton1.setChecked(false);
				}
			}
		});
		
		radiobutton5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (radiobutton2.isChecked()) {
					radiobutton1.setChecked(false);
				}
			}
		});
		
		materialbutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_show_snackbar();
			}
		});
	}
	
	private void initializeLogic() {
		_decorateView();
	}
	
	@Override
	public void onBackPressed() {
		intent.setClass(getApplicationContext(), HomeScreenActivity.class);
		intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
		startActivity(intent);
		finish();
	}
	public void _decorateView() {
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bold.ttf"), 1);
		linear3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)10, (int)0.5d, 0xFF212121, Color.TRANSPARENT));
	}
	
	
	public void _show_snackbar() {
		cust = new AlertDialog.Builder(RateServiceActivity.this).create();
		LayoutInflater custLI = getLayoutInflater();
		View custCV = (View) custLI.inflate(R.layout.snackbar_display, null);
		cust.setView(custCV);
		final TextView text = (TextView)
		custCV.findViewById(R.id.textview1);
		final ImageView img = (ImageView)
		custCV.findViewById(R.id.imageview1);
		cust.setCancelable(true);
		cust.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		text.setText("Submitted");
		img.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				cust.dismiss();
			}
		});
		cust.setOnDismissListener(new DialogInterface.OnDismissListener() {
			@Override
			public void onDismiss(DialogInterface dialogInterface) {
				intent.setClass(getApplicationContext(), HomeScreenActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
				finish();
			} 
		});
		cust.show();
	}
	
}