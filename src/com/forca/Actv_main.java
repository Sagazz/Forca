package com.forca;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Actv_main extends Activity {
	
	public final static String EXTRA_MESSAGE = "Forca.main.MESSAGE";
	
	private EditText edPalavra;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_actv_main);
		
		edPalavra = (EditText) findViewById(R.id.edPalavra);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.actv_main, menu);
		return true;
	}
	
	public void Jogar(View view){
		
		String palavra = edPalavra.getText().toString().trim();
		
		if(palavra.length() > 20){
			
			Toast.makeText(getApplicationContext(), "Tamanho máximo da palavra = 20.", Toast.LENGTH_LONG).show();
			
		}else{
			Intent intent = new Intent(this, Actv_game.class);

	    	intent.putExtra(EXTRA_MESSAGE, palavra);
	    	
	    	startActivity(intent);
		}
		
	
	}

}
