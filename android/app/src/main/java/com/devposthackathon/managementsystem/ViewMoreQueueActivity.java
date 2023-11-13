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
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.*;
import org.json.*;

public class ViewMoreQueueActivity extends AppCompatActivity {
	
	private String queue_type1 = "";
	private String queue_time = "";
	private int queue_no = 0;
	
	private ArrayList<HashMap<String, Object>> list = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private GridView gridview1;
	private TextView queue_type;
	
	private AlertDialog cust;
	private Intent intent = new Intent();
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.view_more_queue);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		gridview1 = findViewById(R.id.gridview1);
		queue_type = findViewById(R.id.queue_type);
	}
	
	private void initializeLogic() {
		_decorateView();
		_add_grid_view_adapter();
	}
	
	public void _add_grid_view_adapter() {
		for(int _repeat10 = 0; _repeat10 < (int)(20); _repeat10++) {
			{
				HashMap<String, Object> _item = new HashMap<>();
				_item.put("Test", "Test");
				list.add(_item);
			}
			
		}
		gridview1.setAdapter(new Gridview1Adapter(list));
		int screenWidth = SketchwareUtil.getDisplayWidthPixels(getApplicationContext());
		
		int numColumns = 2;
		
		int columnWidth = screenWidth / numColumns;
		
		gridview1.setColumnWidth(columnWidth);
		
	}
	
	
	public void _decorateView() {
		queue_type.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bold.ttf"), 1);
		queue_type.setText(getIntent().getStringExtra("topic"));
	}
	
	
	public void _showDialog1(final String _queueNo, final String _tokenNo, final int _estTime) {
		cust = new AlertDialog.Builder(ViewMoreQueueActivity.this).create();
		LayoutInflater custLI = getLayoutInflater();
		View custCV = (View) custLI.inflate(R.layout.snackbar_display, null);
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
				intent.putExtra("Queue", _queueNo);
				intent.putExtra("Token", _tokenNo);
				intent.putExtra("Time", String.valueOf((int)(_estTime)));
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
				finish();
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
	
	public class Gridview1Adapter extends BaseAdapter {
		
		ArrayList<HashMap<String, Object>> _data;
		
		public Gridview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = getLayoutInflater();
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.grid_view, null);
			}
			
			final LinearLayout linear10 = _view.findViewById(R.id.linear10);
			final androidx.cardview.widget.CardView cardview1 = _view.findViewById(R.id.cardview1);
			final LinearLayout linear5 = _view.findViewById(R.id.linear5);
			final TextView textview3 = _view.findViewById(R.id.textview3);
			final TextView textview4 = _view.findViewById(R.id.textview4);
			final TextView textview7 = _view.findViewById(R.id.textview7);
			final TextView textview6 = _view.findViewById(R.id.textview6);
			final LinearLayout linear9 = _view.findViewById(R.id.linear9);
			final TextView textview5 = _view.findViewById(R.id.textview5);
			final TextView textview21 = _view.findViewById(R.id.textview21);
			
			linear10.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					
				}
			});
			
			return _view;
		}
	}
}