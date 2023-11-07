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
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class QueueStatusFragmentActivity extends Fragment {
	
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
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.queue_status_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		vscroll1 = _view.findViewById(R.id.vscroll1);
		linear1 = _view.findViewById(R.id.linear1);
		textview1 = _view.findViewById(R.id.textview1);
		linear2 = _view.findViewById(R.id.linear2);
		textview5 = _view.findViewById(R.id.textview5);
		response_time = _view.findViewById(R.id.response_time);
		circle_token_container = _view.findViewById(R.id.circle_token_container);
		materialbutton1 = _view.findViewById(R.id.materialbutton1);
		textview20 = _view.findViewById(R.id.textview20);
		hscroll1 = _view.findViewById(R.id.hscroll1);
		materialbutton2 = _view.findViewById(R.id.materialbutton2);
		textview27 = _view.findViewById(R.id.textview27);
		hscroll2 = _view.findViewById(R.id.hscroll2);
		textview2 = _view.findViewById(R.id.textview2);
		textview3 = _view.findViewById(R.id.textview3);
		id_text_num = _view.findViewById(R.id.id_text_num);
		textview47 = _view.findViewById(R.id.textview47);
		linear5 = _view.findViewById(R.id.linear5);
		cardview1 = _view.findViewById(R.id.cardview1);
		cardview2 = _view.findViewById(R.id.cardview2);
		cardview3 = _view.findViewById(R.id.cardview3);
		linear6 = _view.findViewById(R.id.linear6);
		textview21 = _view.findViewById(R.id.textview21);
		textview4 = _view.findViewById(R.id.textview4);
		textview7 = _view.findViewById(R.id.textview7);
		textview22 = _view.findViewById(R.id.textview22);
		linear9 = _view.findViewById(R.id.linear9);
		textview23 = _view.findViewById(R.id.textview23);
		textview24 = _view.findViewById(R.id.textview24);
		linear7 = _view.findViewById(R.id.linear7);
		textview8 = _view.findViewById(R.id.textview8);
		textview9 = _view.findViewById(R.id.textview9);
		textview10 = _view.findViewById(R.id.textview10);
		textview11 = _view.findViewById(R.id.textview11);
		linear11 = _view.findViewById(R.id.linear11);
		textview12 = _view.findViewById(R.id.textview12);
		textview25 = _view.findViewById(R.id.textview25);
		linear8 = _view.findViewById(R.id.linear8);
		textview13 = _view.findViewById(R.id.textview13);
		textview14 = _view.findViewById(R.id.textview14);
		textview15 = _view.findViewById(R.id.textview15);
		textview16 = _view.findViewById(R.id.textview16);
		linear12 = _view.findViewById(R.id.linear12);
		textview17 = _view.findViewById(R.id.textview17);
		textview26 = _view.findViewById(R.id.textview26);
		linear13 = _view.findViewById(R.id.linear13);
		cardview4 = _view.findViewById(R.id.cardview4);
		cardview5 = _view.findViewById(R.id.cardview5);
		cardview6 = _view.findViewById(R.id.cardview6);
		linear14 = _view.findViewById(R.id.linear14);
		textview28 = _view.findViewById(R.id.textview28);
		textview29 = _view.findViewById(R.id.textview29);
		textview30 = _view.findViewById(R.id.textview30);
		textview31 = _view.findViewById(R.id.textview31);
		linear15 = _view.findViewById(R.id.linear15);
		textview32 = _view.findViewById(R.id.textview32);
		textview33 = _view.findViewById(R.id.textview33);
		linear16 = _view.findViewById(R.id.linear16);
		textview34 = _view.findViewById(R.id.textview34);
		textview35 = _view.findViewById(R.id.textview35);
		textview36 = _view.findViewById(R.id.textview36);
		textview37 = _view.findViewById(R.id.textview37);
		linear17 = _view.findViewById(R.id.linear17);
		textview38 = _view.findViewById(R.id.textview38);
		textview39 = _view.findViewById(R.id.textview39);
		linear18 = _view.findViewById(R.id.linear18);
		textview40 = _view.findViewById(R.id.textview40);
		textview41 = _view.findViewById(R.id.textview41);
		textview42 = _view.findViewById(R.id.textview42);
		textview43 = _view.findViewById(R.id.textview43);
		linear19 = _view.findViewById(R.id.linear19);
		textview44 = _view.findViewById(R.id.textview44);
		textview45 = _view.findViewById(R.id.textview45);
	}
	
	private void initializeLogic() {
		_decorateView();
	}
	
	public void _decorateView() {
		response_time.setTypeface(Typeface.createFromAsset(getContext().getAssets(),"fonts/bold.ttf"), 1);
		id_text_num.setTypeface(Typeface.createFromAsset(getContext().getAssets(),"fonts/bold.ttf"), 1);
	}
	
}