package com.androidexample.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewAndroidExample extends Activity {
	ListView listView ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_view_android_example);
		
		listView = (ListView) findViewById(R.id.list);
		String[] values = new String[] { "Anna Karenina, de León Tolstoi", "Madame Bovary, de Gustave Flaubert", "Guerra y paz, de León Tolstoi",
		  "Lolita, de Vladimir Nabokov", "Las aventuras de Huckleberry Finn, de Mark Twain", "Hamlet, de William Shakespeare", "El gran Gatsby, de Scott Fitzgerald",
		  "En busca del tiempo perdido, Marcel Proust","Cuentos de Anton Chejov, de Anton Chejov"};

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		  android.R.layout.simple_list_item_1, android.R.id.text1, values);


		listView.setAdapter(adapter); 
		
		listView.setOnItemClickListener(new OnItemClickListener() {
			  @Override
			  public void onItemClick(AdapterView<?> parent, View view,
				  int position, long id) {
				  int itemPosition     = position;
				  String  itemValue    = (String) listView.getItemAtPosition(position);
				  
				  // Show Alert 
				  Toast.makeText(getApplicationContext(),
						  "Posición :"+itemPosition+"  ListItem : " +itemValue , Toast.LENGTH_LONG).show();
			 
			  }
		}); 
	}

}
