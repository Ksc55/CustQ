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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.*;
import java.io.*;
import java.io.InputStream;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class HomeScreenActivity extends AppCompatActivity {
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private ScrollView vscroll2;
	private LinearLayout linear13;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private TextView textview18;
	private LinearLayout linear8;
	private TextView shop_name;
	private TextView textview1;
	private TextView textview19;
	private TextView name;
	private TextView textview20;
	private HorizontalScrollView hscroll1;
	private MaterialButton materialbutton1;
	private TextView textview27;
	private HorizontalScrollView hscroll2;
	private MaterialButton materialbutton2;
	private LinearLayout linear5;
	private CardView cardview1;
	private CardView cardview2;
	private CardView cardview3;
	private LinearLayout linear6;
	private TextView textview3;
	private TextView textview4;
	private TextView textview7;
	private TextView textview6;
	private LinearLayout linear9;
	private TextView textview5;
	private TextView textview21;
	private LinearLayout linear7;
	private TextView textview8;
	private TextView textview9;
	private TextView textview10;
	private TextView textview11;
	private LinearLayout linear11;
	private TextView textview12;
	private TextView textview23;
	private LinearLayout linear10;
	private TextView textview13;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private LinearLayout linear12;
	private TextView textview17;
	private TextView textview25;
	private LinearLayout linear14;
	private CardView cardview4;
	private CardView cardview5;
	private CardView cardview6;
	private LinearLayout linear15;
	private TextView textview28;
	private TextView textview29;
	private TextView textview30;
	private TextView textview31;
	private LinearLayout linear16;
	private TextView textview32;
	private TextView textview33;
	private LinearLayout linear17;
	private TextView textview34;
	private TextView textview35;
	private TextView textview36;
	private TextView textview37;
	private LinearLayout linear18;
	private TextView textview38;
	private TextView textview39;
	private LinearLayout linear19;
	private TextView textview40;
	private TextView textview41;
	private TextView textview42;
	private TextView textview43;
	private LinearLayout linear20;
	private TextView textview44;
	private TextView textview45;
	private LinearLayout _drawer_linear1;
	private LinearLayout _drawer_linear2;
	private LinearLayout _drawer_linear5;
	private LinearLayout _drawer_linear3;
	private LinearLayout _drawer_linear4;
	private ImageView _drawer_imageview1;
	private CardView _drawer_cardview1;
	private LinearLayout _drawer_linear6;
	private TextView _drawer_textview4;
	private TextView _drawer_textview3;
	private TextView _drawer_textview1;
	private TextView _drawer_textview2;
	
	private Intent intent = new Intent();
	private AlertDialog cust;
	
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home_screen);
		initialize(_savedInstanceState);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		_app_bar = findViewById(R.id._app_bar);
		_coordinator = findViewById(R.id._coordinator);
		_toolbar = findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(HomeScreenActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = findViewById(R.id._nav_view);
		
		linear1 = findViewById(R.id.linear1);
		linear2 = findViewById(R.id.linear2);
		vscroll2 = findViewById(R.id.vscroll2);
		linear13 = findViewById(R.id.linear13);
		linear3 = findViewById(R.id.linear3);
		linear4 = findViewById(R.id.linear4);
		textview18 = findViewById(R.id.textview18);
		linear8 = findViewById(R.id.linear8);
		shop_name = findViewById(R.id.shop_name);
		textview1 = findViewById(R.id.textview1);
		textview19 = findViewById(R.id.textview19);
		name = findViewById(R.id.name);
		textview20 = findViewById(R.id.textview20);
		hscroll1 = findViewById(R.id.hscroll1);
		materialbutton1 = findViewById(R.id.materialbutton1);
		textview27 = findViewById(R.id.textview27);
		hscroll2 = findViewById(R.id.hscroll2);
		materialbutton2 = findViewById(R.id.materialbutton2);
		linear5 = findViewById(R.id.linear5);
		cardview1 = findViewById(R.id.cardview1);
		cardview2 = findViewById(R.id.cardview2);
		cardview3 = findViewById(R.id.cardview3);
		linear6 = findViewById(R.id.linear6);
		textview3 = findViewById(R.id.textview3);
		textview4 = findViewById(R.id.textview4);
		textview7 = findViewById(R.id.textview7);
		textview6 = findViewById(R.id.textview6);
		linear9 = findViewById(R.id.linear9);
		textview5 = findViewById(R.id.textview5);
		textview21 = findViewById(R.id.textview21);
		linear7 = findViewById(R.id.linear7);
		textview8 = findViewById(R.id.textview8);
		textview9 = findViewById(R.id.textview9);
		textview10 = findViewById(R.id.textview10);
		textview11 = findViewById(R.id.textview11);
		linear11 = findViewById(R.id.linear11);
		textview12 = findViewById(R.id.textview12);
		textview23 = findViewById(R.id.textview23);
		linear10 = findViewById(R.id.linear10);
		textview13 = findViewById(R.id.textview13);
		textview14 = findViewById(R.id.textview14);
		textview15 = findViewById(R.id.textview15);
		textview16 = findViewById(R.id.textview16);
		linear12 = findViewById(R.id.linear12);
		textview17 = findViewById(R.id.textview17);
		textview25 = findViewById(R.id.textview25);
		linear14 = findViewById(R.id.linear14);
		cardview4 = findViewById(R.id.cardview4);
		cardview5 = findViewById(R.id.cardview5);
		cardview6 = findViewById(R.id.cardview6);
		linear15 = findViewById(R.id.linear15);
		textview28 = findViewById(R.id.textview28);
		textview29 = findViewById(R.id.textview29);
		textview30 = findViewById(R.id.textview30);
		textview31 = findViewById(R.id.textview31);
		linear16 = findViewById(R.id.linear16);
		textview32 = findViewById(R.id.textview32);
		textview33 = findViewById(R.id.textview33);
		linear17 = findViewById(R.id.linear17);
		textview34 = findViewById(R.id.textview34);
		textview35 = findViewById(R.id.textview35);
		textview36 = findViewById(R.id.textview36);
		textview37 = findViewById(R.id.textview37);
		linear18 = findViewById(R.id.linear18);
		textview38 = findViewById(R.id.textview38);
		textview39 = findViewById(R.id.textview39);
		linear19 = findViewById(R.id.linear19);
		textview40 = findViewById(R.id.textview40);
		textview41 = findViewById(R.id.textview41);
		textview42 = findViewById(R.id.textview42);
		textview43 = findViewById(R.id.textview43);
		linear20 = findViewById(R.id.linear20);
		textview44 = findViewById(R.id.textview44);
		textview45 = findViewById(R.id.textview45);
		_drawer_linear1 = _nav_view.findViewById(R.id.linear1);
		_drawer_linear2 = _nav_view.findViewById(R.id.linear2);
		_drawer_linear5 = _nav_view.findViewById(R.id.linear5);
		_drawer_linear3 = _nav_view.findViewById(R.id.linear3);
		_drawer_linear4 = _nav_view.findViewById(R.id.linear4);
		_drawer_imageview1 = _nav_view.findViewById(R.id.imageview1);
		_drawer_cardview1 = _nav_view.findViewById(R.id.cardview1);
		_drawer_linear6 = _nav_view.findViewById(R.id.linear6);
		_drawer_textview4 = _nav_view.findViewById(R.id.textview4);
		_drawer_textview3 = _nav_view.findViewById(R.id.textview3);
		_drawer_textview1 = _nav_view.findViewById(R.id.textview1);
		_drawer_textview2 = _nav_view.findViewById(R.id.textview2);
		
		materialbutton1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), ViewMoreQueueActivity.class);
				intent.putExtra("topic", textview20.getText().toString());
				startActivity(intent);
			}
		});
		
		materialbutton2.setOnClickListener(new View.OnClickListener() {
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
				_showDialog(textview3.getText().toString(), textview7.getText().toString(), textview5.getText().toString());
			}
		});
		
		linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_showDialog(textview8.getText().toString(), textview10.getText().toString(), textview12.getText().toString());
			}
		});
		
		linear10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_showDialog(textview13.getText().toString(), textview15.getText().toString(), textview17.getText().toString());
			}
		});
		
		linear15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), QueueStatusActivity.class);
				startActivity(intent);
			}
		});
		
		linear17.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), QueueStatusActivity.class);
				startActivity(intent);
			}
		});
		
		linear19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				intent.setClass(getApplicationContext(), QueueStatusActivity.class);
				startActivity(intent);
			}
		});
		
		_drawer_linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_linear3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_showDialog_version_number();
			}
		});
		
		_drawer_linear4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Logout successfully");
				intent.setClass(getApplicationContext(), LoginActivity.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				startActivity(intent);
				finish();
			}
		});
	}
	
	private void initializeLogic() {
		setTitle("Dashboard");
		_drawer_textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/bold.ttf"), 1);
		_click_effect(_drawer_linear4, "#9E9E9E");
		_click_effect(_drawer_linear3, "#9E9E9E");
	}
	
	@Override
	public void onBackPressed() {
		com.google.android.material.snackbar.Snackbar.make(linear1, "Are you sure you want to exit", com.google.android.material.snackbar.Snackbar.LENGTH_SHORT).setAction("Exit", new View.OnClickListener(){
			@Override
			public void onClick(View _view) {
				finishAffinity();
			}
		}).show();
	}
	public void _showDialog(final String _queue_type, final String _queue_no, final String _queue_time) {
		cust = new AlertDialog.Builder(HomeScreenActivity.this).create();
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
	
	
	public void _click_effect(final View _view, final String _c) {
		_view.setBackground(Drawables.getSelectableDrawableFor(Color.parseColor(_c)));
		_view.setClickable(true);
		
	}
	
	public static class Drawables {
		    public static android.graphics.drawable.Drawable getSelectableDrawableFor(int color) {
			        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
				            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_pressed},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_focused},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            return stateListDrawable;
				        } else {
				            android.content.res.ColorStateList pressedColor = android.content.res.ColorStateList.valueOf(color);
				            android.graphics.drawable.ColorDrawable defaultColor = new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"));
				            
				android.graphics.drawable.Drawable rippleColor = getRippleColor(color);
				            return new android.graphics.drawable.RippleDrawable(
				                pressedColor,
				                defaultColor,
				                rippleColor
				            );
				        }
			    }
		
		    private static android.graphics.drawable.Drawable getRippleColor(int color) {
			        float[] outerRadii = new float[8];
			        Arrays.fill(outerRadii, 0);
			        android.graphics.drawable.shapes.RoundRectShape r = new android.graphics.drawable.shapes.RoundRectShape(outerRadii, null, null);
			        
			android.graphics.drawable.ShapeDrawable shapeDrawable = new 
			android.graphics.drawable.ShapeDrawable(r);
			        shapeDrawable.getPaint().setColor(color);
			        return shapeDrawable;
			    }
		 
		    private static int lightenOrDarken(int color, double fraction) {
			        if (canLighten(color, fraction)) {
				            return lighten(color, fraction);
				        } else {
				            return darken(color, fraction);
				        }
			    }
		 
		    private static int lighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = lightenColor(red, fraction);
			        green = lightenColor(green, fraction);
			        blue = lightenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static int darken(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = darkenColor(red, fraction);
			        green = darkenColor(green, fraction);
			        blue = darkenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			 
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static boolean canLighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        return canLightenComponent(red, fraction)
			            && canLightenComponent(green, fraction)
			            && canLightenComponent(blue, fraction);
			    }
		 
		    private static boolean canLightenComponent(int colorComponent, double fraction) {
			        int red = Color.red(colorComponent);
			        int green = Color.green(colorComponent);
			        int blue = Color.blue(colorComponent);
			        return red + (red * fraction) < 255
			            && green + (green * fraction) < 255
			            && blue + (blue * fraction) < 255;
			    }
		 
		    private static int darkenColor(int color, double fraction) {
			        return (int) Math.max(color - (color * fraction), 0);
			    }
		 
		    private static int lightenColor(int color, double fraction) {
			        return (int) Math.min(color + (color * fraction), 255);
			    }
	}
	public static class CircleDrawables {
		    public static android.graphics.drawable.Drawable getSelectableDrawableFor(int color) {
			        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
				            android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_pressed},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{android.R.attr.state_focused},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            stateListDrawable.addState(
				                new int[]{},
				                new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"))
				            );
				            return stateListDrawable;
				        } else {
				            android.content.res.ColorStateList pressedColor = android.content.res.ColorStateList.valueOf(color);
				            android.graphics.drawable.ColorDrawable defaultColor = new android.graphics.drawable.ColorDrawable(Color.parseColor("#00ffffff"));
				            
				android.graphics.drawable.Drawable rippleColor = getRippleColor(color);
				            return new android.graphics.drawable.RippleDrawable(
				                pressedColor,
				                defaultColor,
				                rippleColor
				            );
				        }
			    }
		
		    private static android.graphics.drawable.Drawable getRippleColor(int color) {
			        float[] outerRadii = new float[180];
			        Arrays.fill(outerRadii, 80);
			        android.graphics.drawable.shapes.RoundRectShape r = new android.graphics.drawable.shapes.RoundRectShape(outerRadii, null, null);
			        
			android.graphics.drawable.ShapeDrawable shapeDrawable = new 
			android.graphics.drawable.ShapeDrawable(r);
			        shapeDrawable.getPaint().setColor(color);
			        return shapeDrawable;
			    }
		 
		    private static int lightenOrDarken(int color, double fraction) {
			        if (canLighten(color, fraction)) {
				            return lighten(color, fraction);
				        } else {
				            return darken(color, fraction);
				        }
			    }
		 
		    private static int lighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = lightenColor(red, fraction);
			        green = lightenColor(green, fraction);
			        blue = lightenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static int darken(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        red = darkenColor(red, fraction);
			        green = darkenColor(green, fraction);
			        blue = darkenColor(blue, fraction);
			        int alpha = Color.alpha(color);
			 
			        return Color.argb(alpha, red, green, blue);
			    }
		 
		    private static boolean canLighten(int color, double fraction) {
			        int red = Color.red(color);
			        int green = Color.green(color);
			        int blue = Color.blue(color);
			        return canLightenComponent(red, fraction)
			            && canLightenComponent(green, fraction)
			            && canLightenComponent(blue, fraction);
			    }
		 
		    private static boolean canLightenComponent(int colorComponent, double fraction) {
			        int red = Color.red(colorComponent);
			        int green = Color.green(colorComponent);
			        int blue = Color.blue(colorComponent);
			        return red + (red * fraction) < 255
			            && green + (green * fraction) < 255
			            && blue + (blue * fraction) < 255;
			    }
		 
		    private static int darkenColor(int color, double fraction) {
			        return (int) Math.max(color - (color * fraction), 0);
			    }
		 
		    private static int lightenColor(int color, double fraction) {
			        return (int) Math.min(color + (color * fraction), 255);
		}
	}
	
	public void drawableclass() {
	}
	
	
	public void _showDialog_version_number() {
		cust = new AlertDialog.Builder(HomeScreenActivity.this).create();
		LayoutInflater custLI = getLayoutInflater();
		View custCV = (View) custLI.inflate(R.layout.version_number_layout, null);
		cust.setView(custCV);
		final TextView text = (TextView)
		custCV.findViewById(R.id.textview2);
		cust.setCancelable(true);
		cust.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
		text.setText(AppVersionUtil.getAppVersionName(this));
		cust.show();
	}
	
}