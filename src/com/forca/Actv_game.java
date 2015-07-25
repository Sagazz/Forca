package com.forca;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Actv_game extends Activity {
	
	private String palavra;
	private TextView tv_letra, tv_resultado;
	private ImageView img_forca;
	private boolean achouUmaLetra;
	private int letrasParaVencer, erros, MAXErros;
	private AdvancedStringMath stringMath;
					 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_actv_game);
		
		Intent intent = getIntent();
	    this.palavra = intent.getStringExtra(Actv_main.EXTRA_MESSAGE);
	    
	    setLettersVisibility(this.palavra.length());
	    achouUmaLetra = false;
	    
	    stringMath = new AdvancedStringMath(palavra);
	    
	    letrasParaVencer = stringMath.countUniqueLetters();
	    
	    erros = 0;
	    MAXErros = 7;
	    
	    img_forca = (ImageView) findViewById(R.id.img_forca);
	    tv_resultado = (TextView) findViewById(R.id.tvResultado);
	    tv_resultado.setText("");
	    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.actv_game, menu);
		return true;
	}
	
	
	private void setLettersVisibility(int n){
		
		for(int i = 0; i < n; i++){
	    	
	    	switch(i){
	    		case 0: tv_letra = (TextView) findViewById(R.id.tv_letra0);
	    				tv_letra.setVisibility(View.VISIBLE);
	    				break;
	    		case 1: tv_letra = (TextView) findViewById(R.id.tv_letra1);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 2: tv_letra = (TextView) findViewById(R.id.tv_letra2);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 3: tv_letra = (TextView) findViewById(R.id.tv_letra3);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 4: tv_letra = (TextView) findViewById(R.id.tv_letra4);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 5: tv_letra = (TextView) findViewById(R.id.tv_letra5);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 6: tv_letra = (TextView) findViewById(R.id.tv_letra6);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 7: tv_letra = (TextView) findViewById(R.id.tv_letra7);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 8: tv_letra = (TextView) findViewById(R.id.tv_letra8);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 9: tv_letra = (TextView) findViewById(R.id.tv_letra9);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 10: tv_letra = (TextView) findViewById(R.id.tv_letra10);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 11: tv_letra = (TextView) findViewById(R.id.tv_letra11);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 12: tv_letra = (TextView) findViewById(R.id.tv_letra12);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 13: tv_letra = (TextView) findViewById(R.id.tv_letra13);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 14: tv_letra = (TextView) findViewById(R.id.tv_letra14);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 15: tv_letra = (TextView) findViewById(R.id.tv_letra15);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 16: tv_letra = (TextView) findViewById(R.id.tv_letra16);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 17: tv_letra = (TextView) findViewById(R.id.tv_letra17);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 18: tv_letra = (TextView) findViewById(R.id.tv_letra18);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    		case 19: tv_letra = (TextView) findViewById(R.id.tv_letra19);
						tv_letra.setVisibility(View.VISIBLE);
						break;
	    	}
	    	
	    }
	}

	private void checkLetter(char c){
		
		achouUmaLetra = false;
		char caractereCorrente;
		String novaLetra;
		
		for(int i = 0; i < palavra.length(); i++){
			
			caractereCorrente = palavra.charAt(i); 
			
			if(caractereCorrente == c){
				
				switch(i){
		    		case 0:  tv_letra = (TextView) findViewById(R.id.tv_letra0);  break;
		    		case 1:  tv_letra = (TextView) findViewById(R.id.tv_letra1);  break;
		    		case 2:  tv_letra = (TextView) findViewById(R.id.tv_letra2);  break;
		    		case 3:  tv_letra = (TextView) findViewById(R.id.tv_letra3);  break;
		    		case 4:  tv_letra = (TextView) findViewById(R.id.tv_letra4);  break;
		    		case 5:  tv_letra = (TextView) findViewById(R.id.tv_letra5);  break;
		    		case 6:  tv_letra = (TextView) findViewById(R.id.tv_letra6);  break;
		    		case 7:  tv_letra = (TextView) findViewById(R.id.tv_letra7);  break;
		    		case 8:  tv_letra = (TextView) findViewById(R.id.tv_letra8);  break;
		    		case 9:  tv_letra = (TextView) findViewById(R.id.tv_letra9);  break;
		    		case 10: tv_letra = (TextView) findViewById(R.id.tv_letra10); break;
		    		case 11: tv_letra = (TextView) findViewById(R.id.tv_letra11); break;
		    		case 12: tv_letra = (TextView) findViewById(R.id.tv_letra12); break;
		    		case 13: tv_letra = (TextView) findViewById(R.id.tv_letra13); break;
		    		case 14: tv_letra = (TextView) findViewById(R.id.tv_letra14); break;
		    		case 15: tv_letra = (TextView) findViewById(R.id.tv_letra15); break;
		    		case 16: tv_letra = (TextView) findViewById(R.id.tv_letra16); break;
		    		case 17: tv_letra = (TextView) findViewById(R.id.tv_letra17); break;
		    		case 18: tv_letra = (TextView) findViewById(R.id.tv_letra18); break;
		    		case 19: tv_letra = (TextView) findViewById(R.id.tv_letra19); break;
				}
				
				novaLetra = "";
				novaLetra = novaLetra + c;
				tv_letra.setText(novaLetra);
				achouUmaLetra = true;
			}
		}
		
		if(!achouUmaLetra){
			erros++;

			changeForca();
			
			if(erros == MAXErros){
				tv_resultado.setTextColor(Color.RED);
				tv_resultado.setText("YOU LOSE! :(");
				//Toast.makeText(getApplicationContext(), "YOU LOOOOSE! _|_ ", Toast.LENGTH_LONG).show();
				disableKeyboard();
			}	
		}else{
			letrasParaVencer--;
			
			if(letrasParaVencer == 0){
				tv_resultado.setTextColor(Color.GREEN);
				tv_resultado.setText("YOU WIN! :D");
				//Toast.makeText(getApplicationContext(), "YOU WIN !!! :D", Toast.LENGTH_LONG).show();
				disableKeyboard();
			}	
		}
			
	}
	
	private void disableKeyboard(){
		
		Button btn;
		
		btn = (Button) findViewById(R.id.btn_a); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_b); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_c); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_d); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_e); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_f); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_g); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_h); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_i); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_j); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_k); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_l); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_m); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_n); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_o); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_p); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_q); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_r); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_s); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_t); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_u); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_v); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_x); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_y); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_w); btn.setEnabled(false);
		btn = (Button) findViewById(R.id.btn_z); btn.setEnabled(false);
		
	}

	
	public void pressionou_a(View view){ checkLetter('a'); Button btn; btn = (Button) findViewById(R.id.btn_a); btn.setEnabled(false);}
	public void pressionou_b(View view){ checkLetter('b'); Button btn; btn = (Button) findViewById(R.id.btn_b); btn.setEnabled(false);}
	public void pressionou_c(View view){ checkLetter('c'); Button btn; btn = (Button) findViewById(R.id.btn_c); btn.setEnabled(false);}
	public void pressionou_d(View view){ checkLetter('d'); Button btn; btn = (Button) findViewById(R.id.btn_d); btn.setEnabled(false);}
	public void pressionou_e(View view){ checkLetter('e'); Button btn; btn = (Button) findViewById(R.id.btn_e); btn.setEnabled(false);}
	public void pressionou_f(View view){ checkLetter('f'); Button btn; btn = (Button) findViewById(R.id.btn_f); btn.setEnabled(false);}
	public void pressionou_g(View view){ checkLetter('g'); Button btn; btn = (Button) findViewById(R.id.btn_g); btn.setEnabled(false);}
	public void pressionou_h(View view){ checkLetter('h'); Button btn; btn = (Button) findViewById(R.id.btn_h); btn.setEnabled(false);}
	public void pressionou_i(View view){ checkLetter('i'); Button btn; btn = (Button) findViewById(R.id.btn_i); btn.setEnabled(false);}
	public void pressionou_j(View view){ checkLetter('j'); Button btn; btn = (Button) findViewById(R.id.btn_j); btn.setEnabled(false);}
	public void pressionou_k(View view){ checkLetter('k'); Button btn; btn = (Button) findViewById(R.id.btn_k); btn.setEnabled(false);}
	public void pressionou_l(View view){ checkLetter('l'); Button btn; btn = (Button) findViewById(R.id.btn_l); btn.setEnabled(false);}
	public void pressionou_m(View view){ checkLetter('m'); Button btn; btn = (Button) findViewById(R.id.btn_m); btn.setEnabled(false);}
	public void pressionou_n(View view){ checkLetter('n'); Button btn; btn = (Button) findViewById(R.id.btn_n); btn.setEnabled(false);}
	public void pressionou_o(View view){ checkLetter('o'); Button btn; btn = (Button) findViewById(R.id.btn_o); btn.setEnabled(false);}
	public void pressionou_p(View view){ checkLetter('p'); Button btn; btn = (Button) findViewById(R.id.btn_p); btn.setEnabled(false);}
	public void pressionou_q(View view){ checkLetter('q'); Button btn; btn = (Button) findViewById(R.id.btn_q); btn.setEnabled(false);}
	public void pressionou_r(View view){ checkLetter('r'); Button btn; btn = (Button) findViewById(R.id.btn_r); btn.setEnabled(false);}
	public void pressionou_s(View view){ checkLetter('s'); Button btn; btn = (Button) findViewById(R.id.btn_s); btn.setEnabled(false);}
	public void pressionou_t(View view){ checkLetter('t'); Button btn; btn = (Button) findViewById(R.id.btn_t); btn.setEnabled(false);}
	public void pressionou_u(View view){ checkLetter('u'); Button btn; btn = (Button) findViewById(R.id.btn_u); btn.setEnabled(false);}
	public void pressionou_v(View view){ checkLetter('v'); Button btn; btn = (Button) findViewById(R.id.btn_v); btn.setEnabled(false);}
	public void pressionou_x(View view){ checkLetter('x'); Button btn; btn = (Button) findViewById(R.id.btn_x); btn.setEnabled(false);}
	public void pressionou_y(View view){ checkLetter('y'); Button btn; btn = (Button) findViewById(R.id.btn_y); btn.setEnabled(false);}
	public void pressionou_w(View view){ checkLetter('w'); Button btn; btn = (Button) findViewById(R.id.btn_w); btn.setEnabled(false);}
	public void pressionou_z(View view){ checkLetter('z'); Button btn; btn = (Button) findViewById(R.id.btn_z); btn.setEnabled(false);}
	
	
	private void changeForca(){
		
		switch(erros){
			case 0: img_forca.setImageResource(R.drawable.forca_0); break;
			case 1: img_forca.setImageResource(R.drawable.forca_1); break;
			case 2: img_forca.setImageResource(R.drawable.forca_2); break;
			case 3: img_forca.setImageResource(R.drawable.forca_3); break;
			case 4: img_forca.setImageResource(R.drawable.forca_4); break;
			case 5: img_forca.setImageResource(R.drawable.forca_5); break;
			case 6: img_forca.setImageResource(R.drawable.forca_6); break;
			case 7: img_forca.setImageResource(R.drawable.forca_f); break;
		}
	}
}
