package com.example.prestamo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	Persona p;
	Fecha  f = new Fecha();
	Prestamo pr = new Prestamo();
	
	private EditText rut, codigoArea, numeroTelefono;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		rut = (EditText)findViewById(R.id.rut);
		codigoArea = (EditText)findViewById(R.id.codArea);
		numeroTelefono = (EditText)findViewById(R.id.telefono);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void capturar(View v){
		// captura de persona
		p = new Persona();
		p.setRut(rut.getText().toString());
		int telef= Integer.parseInt(numeroTelefono.getText().toString());
		String codArea = codigoArea.getText().toString();
		p.setFonoCasa(new NumeroTelefonico(codArea,telef));
		
	}
}
