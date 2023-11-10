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

public class QueueStatusActivity extends AppCompatActivity {
	
	private ScrollView vscroll1;
	private LinearLayout linear1;
	private TextView textview1;
	private LinearLayout linear2;
	private TextView textview5;
	private TextView response_time;
	private LinearLayout circle_token_container;
	private MaterialButton materialbutton1;
	private TextView textview20;
	private HorizontalScrollView hscroll1;
	private MaterialButton materialbutton2;
	private TextView textview27;
	private HorizontalScrollView hscroll2;
	private MaterialButton materialbutton3;
	private TextView textview2;
	private TextView textview3;
	private TextView id_text_num;
	private TextView textview47;
	private LinearLayout linear5;
	private CardView cardview1;
	private CardView cardview2;
	private CardView cardview3;
	private LinearLayout linear6;
	private TextView textview21;
	private TextView textview4;
	private TextView textview7;
	private TextView textview22;
	private LinearLayout linear9;
	private TextView textview23;
	private TextView textview24;
	private LinearLayout linear7;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private LinearLayout linear11;
	private TextView textview12;
	private TextView textview25;
	private LinearLayout linear8;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private LinearLayout linear12;
	private TextView textview17;
	private TextView textview26;
	private LinearLayout linear13;
	private CardView cardview4;
	private CardView cardview5;
	private CardView cardview6;
	private LinearLayout linear14;
	private TextView textview28;
	private TextView textview29;
	private TextView textview30;
	private TextView textview31;
	private LinearLayout linear15;
	private TextView textview32;
	private TextView textview33;
	private LinearLayout linear16;
	private TextView textview34;
	private TextView textview35;
	private TextView textview36;
	private TextView textview37;
	private LinearLayout linear17;
	private TextView textview38;
	private TextView textview39;
	private LinearLayout linear18;
	private TextView textview40;
	private TextView textview41;
	private TextView textview42;
	private TextView textview43;
	private LinearLayout linear19;
	private TextView textview44;
	private TextView textview45;
	
	private Intent intent = new Intent();
	private AlertDialog cust;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.queue_status);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		vscroll1 = findViewById(R.id.vscroll1);
		linear1 = findViewById(R.id.linear1);
		textview1 = findViewById(R.id.textview1);
		linear2 = findViewById(R.id.linear2);
		textview5 = findViewById(R.id.textview5);
		response_time = findViewById(R.id.response_time);
		circle_token_container = findViewById(R.id.circle_token_container);
		materialbutton1 = findViewById(R.id.materialbutton1);
		textview20 = findViewById(R.id.textview20);
		hscroll1 = findViewById(R.id.hscroll1);
		materialbutton2 = findViewById(R.id.materialbutton2);
		textview27 = findViewById(R.id.textview27);
		hscroll2 = findViewById(R.id.hscroll2);
		materialbutton3 = findViewById(R.id.materialbutton3);
		textview2 = findViewById(R.id.textview2);
		textview3 = findViewById(R.id.textview3);
		id_text_num = findViewById(R.id.id_text_num);
		textview47 = findViewById(R.id.textview47);
		linear5 = findViewById(R.id.linear5);
		cardview1 = findViewById(R.id.cardview1);
		cardview2 = findViewById(R.id.cardview2);
		cardview3 = findViewById(R.id.cardview3);
		linear6 = findViewById(R.id.linear6);
		textview21 = findViewById(R.id.textview21);
		textview4 = findViewById(R.id.textview4);
		textview7 = findViewById(R.id.textview7);
		textview22 = findViewById(R.id.textview22);
		linear9 = findViewById(R.id.linear9);
		textview23 = findViewById(R.id.textview23);
		textview24 = findViewById(R.id.textview24);
		linear7 = findViewById(R.id.linear7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		linear11 = findViewById(R.id.linear11);
		textview12 = findViewById(R.id.textview12);
		textview25 = findViewById(R.id.textview25);
		linear8 = findViewById(R.id.linear8);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		textview16 = findViewById(R.id.textview16);
		linear12 = findViewById(R.id.linear12);
		textview17 = findViewById(R.id.textview17);
		textview26 = findViewById(R.id.textview26);
		linear13 = findViewById(R.id.linear13);
		cardview4 = findViewById(R.id.cardview4);
		cardview5 = findViewById(R.id.cardview5);
		cardview6 = findViewById(R.id.cardview6);
		linear14 = findViewById(R.id.linear14);
		textview28 = findViewById(R.id.textview28);
		textview29 = findViewById(R.id.textview29);
		textview30 = findViewById(R.id.textview30);
		textview31 = findViewById(R.id.textview31);
		linear15 = findViewById(R.id.linear15);
		textview32 = findViewById(R.id.textview32);
		textview33 = findViewById(R.id.textview33);
		linear16 = findViewById(R.id.linear16);
		textview34 = findViewById(R.id.textview34);
		textview35 = findViewById(R.id.textview35);
		textview36 = findViewById(R.id.textview36);
		textview37 = findViewById(R.id.textview37);
		linear17 = findViewById(R.id.linear17);
		textview38 = findViewById(R.id.textview38);
		textview39 = findViewById(R.id.textview39);
		linear18 = findViewById(R.id.linear18);
		textview40 = findViewById(R.id.textview40);
		textview41 = findViewById(R.id.textview41);
		textview42 = findViewById(R.id.textview42);
		textview43 = findViewById(R.id.textview43);
		linear19 = findViewById(R.id.linear19);
		textview44 = findViewById(R.id.textview44);
		textview45 = findViewById(R.id.textview45);
		
		materialbutton2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ViewMoreQueueActivity.class);
				intent.putExtra("topic", textview20.getText().toString());
				startActivity(intent);
			}
		});
		
		materialbutton3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ViewMoreQueueActivity.class);
				intent.putExtra("topic", textview27.getText().toString());
				startActivity(intent);
			}
		});
		
		linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_showDialog(textview21.getText().toString(), textview7.getText().toString(), textview23.getText().toString());
			}
		});
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_showDialog(textview8.getText().toString(), textview10.getText().toString(), textview12.getText().toString());
			}
		});
		
		linear8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_showDialog(textview13.getText().toString(), textview15.getText().toString(), textview17.getText().toString());
			}
		});
		
		linear14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_showDialog(textview28.getText().toString(), textview30.getText().toString(), textview32.getText().toString());
			}
		});
		
		linear16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_showDialog(textview34.getText().toString(), textview36.getText().toString(), textview38.getText().toString());
			}
		});
		
		linear18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_showDialog(textview40.getText().toString(), textview42.getText().toString(), textview44.getText().toString());
			}
		});
	}
	
	private void initializeLogic() {
	}
	
	public void _showDialog(final String _queue_type, final String _queue_no, final String _queue_time) {
		cust = new AlertDialog.Builder(QueueStatusActivity.this).create();
		LayoutInflater custLI = getLayoutInflater();
		View custCV = (View) custLI.inflate(R.layout.join_queue_dialog, null);
		cust.setView(custCV);
		final com.google.android.material.button.MaterialButton accept = (com.google.android.material.button.MaterialButton)
		custCV.findViewById(R.id.materialbutton1);
		final com.google.android.material.button.MaterialButton decline = (com.google.android.material.button.MaterialButton)
		custCV.findViewById(R.id.materialbutton2);
		cust.setCancelable(true);
		cust.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		accept.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_dismissDialog();
				intent.setClass(getApplicationContext(), ActiveQueuesActivity.class);
				intent.putExtra("queue_type", _queue_type);
				intent.putExtra("queue_no", _queue_no);
				intent.putExtra("queue_no", _queue_time);
				startActivity(intent);
			}
		});
		decline.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_dismissDialog();
			}
		});
		cust.show();
	}
	
	
	public void _dismissDialog() {
		cust.dismiss();
	}
	
}