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

public class LoginActivity extends Activity {
	
	private LinearLayout linear1;
	private CardView cardview_container;
	private LinearLayout linear2;
	private ImageView imageview1;
	private TextView textview1;
	private TextView textview2;
	private CardView cardview2;
	private MaterialButton materialbutton1;
	private LinearLayout edittext_container;
	private EditText edittext2;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.login);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		cardview_container = findViewById(R.id.cardview_container);
		linear2 = findViewById(R.id.linear2);
		imageview1 = findViewById(R.id.imageview1);
		textview1 = findViewById(R.id.textview1);
		textview2 = findViewById(R.id.textview2);
		cardview2 = findViewById(R.id.cardview2);
		materialbutton1 = findViewById(R.id.materialbutton1);
		edittext_container = findViewById(R.id.edittext_container);
		edittext2 = findViewById(R.id.edittext2);
	}
	
	private void initializeLogic() {
		_designViews();
	}
	
	public void _designViews() {
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bold.ttf"), 1);
	}
	
}