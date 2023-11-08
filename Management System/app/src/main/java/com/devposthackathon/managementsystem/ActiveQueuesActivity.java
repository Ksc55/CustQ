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
import android.widget.HorizontalScrollView;
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
import java.util.regex.*;
import org.json.*;

public class ActiveQueuesActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private TextView queue_no;
	private TextView textview2;
	private LinearLayout linear3;
	private TextView textview4;
	private TextView textview7;
	private TextView textview8;
	private LinearLayout circle_token_container;
	private TextView textview49;
	private TextView textview48;
	private MaterialButton materialbutton1;
	private TextView textview20;
	private HorizontalScrollView hscroll1;
	private TextView textview3;
	private TextView queue_time;
	private TextView textview6;
	private TextView id_text_num;
	private LinearLayout linear4;
	private CardView cardview1;
	private CardView cardview2;
	private CardView cardview3;
	private LinearLayout linear5;
	private TextView textview50;
	private TextView textview51;
	private TextView textview52;
	private TextView textview53;
	private LinearLayout linear9;
	private TextView textview5;
	private TextView textview21;
	private LinearLayout linear6;
	private TextView textview54;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private LinearLayout linear11;
	private TextView textview12;
	private TextView textview23;
	private LinearLayout linear7;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private LinearLayout linear12;
	private TextView textview17;
	private TextView textview25;
	
	private Intent intent = new Intent();
	private com.google.android.material.bottomsheet.BottomSheetDialog bottomSheet;
	private AlertDialog cust;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.active_queues);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		vscroll1 = findViewById(R.id.vscroll1);
		linear2 = findViewById(R.id.linear2);
		queue_no = findViewById(R.id.queue_no);
		textview2 = findViewById(R.id.textview2);
		linear3 = findViewById(R.id.linear3);
		textview4 = findViewById(R.id.textview4);
		textview7 = findViewById(R.id.textview7);
		textview8 = findViewById(R.id.textview8);
		circle_token_container = findViewById(R.id.circle_token_container);
		textview49 = findViewById(R.id.textview49);
		textview48 = findViewById(R.id.textview48);
		materialbutton1 = findViewById(R.id.materialbutton1);
		textview20 = findViewById(R.id.textview20);
		hscroll1 = findViewById(R.id.hscroll1);
		textview3 = findViewById(R.id.textview3);
		queue_time = findViewById(R.id.queue_time);
		textview6 = findViewById(R.id.textview6);
		id_text_num = findViewById(R.id.id_text_num);
		linear4 = findViewById(R.id.linear4);
		cardview1 = findViewById(R.id.cardview1);
		cardview2 = findViewById(R.id.cardview2);
		cardview3 = findViewById(R.id.cardview3);
		linear5 = findViewById(R.id.linear5);
		textview50 = findViewById(R.id.textview50);
		textview51 = findViewById(R.id.textview51);
		textview52 = findViewById(R.id.textview52);
		textview53 = findViewById(R.id.textview53);
		linear9 = findViewById(R.id.linear9);
		textview5 = findViewById(R.id.textview5);
		textview21 = findViewById(R.id.textview21);
		linear6 = findViewById(R.id.linear6);
		textview54 = findViewById(R.id.textview54);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		linear11 = findViewById(R.id.linear11);
		textview12 = findViewById(R.id.textview12);
		textview23 = findViewById(R.id.textview23);
		linear7 = findViewById(R.id.linear7);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		textview16 = findViewById(R.id.textview16);
		linear12 = findViewById(R.id.linear12);
		textview17 = findViewById(R.id.textview17);
		textview25 = findViewById(R.id.textview25);
		
		materialbutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ExitConfirmationActivity.class);
				startActivity(intent);
			}
		});
	}
	
	private void initializeLogic() {
		_decorateView();
		_show_snackbar();
	}
	
	@Override
	public void onBackPressed() {
		com.google.android.material.snackbar.Snackbar.make(linear1, "Are you sure you want to exit queue", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction("Exit", new View.OnClickListener(){
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ExitConfirmationActivity.class);
				startActivity(intent);
			}
		}).show();
	}
	public void _decorateView() {
		textview8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bold.ttf"), 1);
		textview48.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bold.ttf"), 1);
	}
	
	
	public void _show_snackbar() {
		cust = new AlertDialog.Builder(ActiveQueuesActivity.this).create();
		LayoutInflater custLI = getLayoutInflater();
		View custCV = (View) custLI.inflate(R.layout.snackbar_display, null);
		cust.setView(custCV);
		final TextView text = (TextView)
		custCV.findViewById(R.id.textview1);
		final ImageView img = (ImageView)
		custCV.findViewById(R.id.imageview1);
		cust.setCancelable(true);
		cust.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		text.setText("You Are In");
		img.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				cust.dismiss();
			}
		});
		cust.show();
	}
	
}