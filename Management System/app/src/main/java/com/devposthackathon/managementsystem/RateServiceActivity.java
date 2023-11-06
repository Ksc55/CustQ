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
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class RateServiceActivity extends AppCompatActivity {
	
	private LinearLayout linear1;
	private TextView textview1;
	private ScrollView vscroll1;
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
	}
	
	private void initializeLogic() {
		_decorateView();
	}
	
	public void _decorateView() {
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bold.ttf"), 1);
	}
	
}