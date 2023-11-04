package com.devposthackathon.managementsystem;

import android.animation.*;
import android.app.*;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.*;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class OtpActivity extends Activity {
	
	private LinearLayout linear1;
	private CardView cardview1;
	private LinearLayout linear2;
	private ImageView imageview1;
	private TextView textview1;
	private TextView textview2;
	private LinearLayout linear3;
	private MaterialButton materialbutton1;
	private CardView cardview_otp_container;
	private CardView cardview2_otp_container;
	private CardView cardview3_otp_container;
	private CardView cardview4_otp_container;
	private CardView cardview5_otp_container;
	private CardView cardview6_otp_container;
	private LinearLayout linear_container;
	private EditText otp_edittext;
	private LinearLayout linear4;
	private EditText edittext1;
	private LinearLayout linear5;
	private EditText edittext2;
	private LinearLayout linear6;
	private EditText edittext3;
	private LinearLayout linear7;
	private EditText edittext4;
	private LinearLayout linear8;
	private EditText edittext5;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.otp);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		cardview1 = findViewById(R.id.cardview1);
		linear2 = findViewById(R.id.linear2);
		imageview1 = findViewById(R.id.imageview1);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		linear3 = findViewById(R.id.linear3);
		materialbutton1 = findViewById(R.id.materialbutton1);
		cardview_otp_container = findViewById(R.id.cardview_otp_container);
		cardview2_otp_container = findViewById(R.id.cardview2_otp_container);
		cardview3_otp_container = findViewById(R.id.cardview3_otp_container);
		cardview4_otp_container = findViewById(R.id.cardview4_otp_container);
		cardview5_otp_container = findViewById(R.id.cardview5_otp_container);
		cardview6_otp_container = findViewById(R.id.cardview6_otp_container);
		linear_container = findViewById(R.id.linear_container);
		otp_edittext = findViewById(R.id.otp_edittext);
		linear4 = findViewById(R.id.linear4);
		edittext1 = findViewById(R.id.edittext1);
		linear5 = findViewById(R.id.linear5);
		edittext2 = findViewById(R.id.edittext2);
		linear6 = findViewById(R.id.linear6);
		edittext3 = findViewById(R.id.edittext3);
		linear7 = findViewById(R.id.linear7);
		edittext4 = findViewById(R.id.edittext4);
		linear8 = findViewById(R.id.linear8);
		edittext5 = findViewById(R.id.edittext5);
	}
	
	private void initializeLogic() {
		_decorateViews();
	}
	
	public void _decorateViews() {
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bold.ttf"), 1);
	}
	
}