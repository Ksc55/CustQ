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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;

public class DashboardFragmentActivity extends Fragment {
	
	private ArrayList<HashMap<String, Object>> listMap = new ArrayList<>();
	
	private LinearLayout linear2;
	private ScrollView vscroll2;
	private LinearLayout linear13;
	private LinearLayout linear1;
	private LinearLayout linear3;
	private TextView textview18;
	private LinearLayout linear8;
	private TextView shop_name;
	private TextView textview1;
	private TextView textview19;
	private TextView name;
	private TextView textview20;
	private HorizontalScrollView hscroll1;
	private MaterialButton materialbutton1;
	private LinearLayout linear4;
	private CardView cardview1;
	private CardView cardview2;
	private CardView cardview3;
	private LinearLayout linear5;
	private TextView textview3;
	private TextView textview4;
	private TextView textview7;
	private TextView textview6;
	private LinearLayout linear9;
	private TextView textview5;
	private TextView textview21;
	private LinearLayout linear6;
	private TextView textview8;
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
	
	private AlertDialog cust;
	private Intent intent = new Intent();
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.dashboard_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		linear2 = _view.findViewById(R.id.linear2);
		vscroll2 = _view.findViewById(R.id.vscroll2);
		linear13 = _view.findViewById(R.id.linear13);
		linear1 = _view.findViewById(R.id.linear1);
		linear3 = _view.findViewById(R.id.linear3);
		textview18 = _view.findViewById(R.id.textview18);
		linear8 = _view.findViewById(R.id.linear8);
		shop_name = _view.findViewById(R.id.shop_name);
		textview1 = _view.findViewById(R.id.textview1);
		textview19 = _view.findViewById(R.id.textview19);
		name = _view.findViewById(R.id.name);
		textview20 = _view.findViewById(R.id.textview20);
		hscroll1 = _view.findViewById(R.id.hscroll1);
		materialbutton1 = _view.findViewById(R.id.materialbutton1);
		linear4 = _view.findViewById(R.id.linear4);
		cardview1 = _view.findViewById(R.id.cardview1);
		cardview2 = _view.findViewById(R.id.cardview2);
		cardview3 = _view.findViewById(R.id.cardview3);
		linear5 = _view.findViewById(R.id.linear5);
		textview3 = _view.findViewById(R.id.textview3);
		textview4 = _view.findViewById(R.id.textview4);
		textview7 = _view.findViewById(R.id.textview7);
		textview6 = _view.findViewById(R.id.textview6);
		linear9 = _view.findViewById(R.id.linear9);
		textview5 = _view.findViewById(R.id.textview5);
		textview21 = _view.findViewById(R.id.textview21);
		linear6 = _view.findViewById(R.id.linear6);
		textview8 = _view.findViewById(R.id.textview8);
		textview9 = _view.findViewById(R.id.textview9);
		textview10 = _view.findViewById(R.id.textview10);
		textview11 = _view.findViewById(R.id.textview11);
		linear11 = _view.findViewById(R.id.linear11);
		textview12 = _view.findViewById(R.id.textview12);
		textview23 = _view.findViewById(R.id.textview23);
		linear7 = _view.findViewById(R.id.linear7);
		textview13 = _view.findViewById(R.id.textview13);
		textview14 = _view.findViewById(R.id.textview14);
		textview15 = _view.findViewById(R.id.textview15);
		textview16 = _view.findViewById(R.id.textview16);
		linear12 = _view.findViewById(R.id.linear12);
		textview17 = _view.findViewById(R.id.textview17);
		textview25 = _view.findViewById(R.id.textview25);
		
		materialbutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getContext().getApplicationContext(), ViewMoreQueueActivity.class);
				intent.putExtra("queue_type", textview18.getText().toString());
				startActivity(intent);
			}
		});
		
		linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_showDialog1(textview3.getText().toString(), textview7.getText().toString(), Integer.parseInt(textview5.getText().toString()));
			}
		});
		
		linear6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_showDialog1(textview8.getText().toString(), textview10.getText().toString(), Integer.parseInt(textview12.getText().toString()));
			}
		});
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_showDialog1(textview13.getText().toString(), textview15.getText().toString(), Integer.parseInt(textview17.getText().toString()));
			}
		});
	}
	
	private void initializeLogic() {
		_decorateView();
	}
	
	public void _decorateView() {
		materialbutton1.setStrokeWidth((int) 0.5d);
		materialbutton1.setText("VIEW MORE");
		materialbutton1.setStrokeColor(ColorStateList.valueOf(0xFF343434));
		name.setTypeface(Typeface.createFromAsset(getContext().getAssets(),"fonts/bold.ttf"), 1);
		shop_name.setTypeface(Typeface.createFromAsset(getContext().getAssets(),"fonts/bold.ttf"), 1);
	}
	
	
	public void _showDialog1(final String _queueNo, final String _tokenNo, final int _estTime) {
		cust = new AlertDialog.Builder(getActivity()).create();
		LayoutInflater custLI = getActivity().getLayoutInflater();
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
				intent.setClass(getContext().getApplicationContext(), ActiveQueuesActivity.class);
				intent.putExtra("Queue", _queueNo);
				intent.putExtra("Token", _tokenNo);
				intent.putExtra("Time", String.valueOf((int)(_estTime)));
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
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