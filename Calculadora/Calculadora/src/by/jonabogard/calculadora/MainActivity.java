package by.jonabogard.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	EditText a, b;
	Button suma, resta, multiplicacion, division, limpiar;
	TextView resultado;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    a = (EditText) findViewById(R.id.na);
    b = (EditText) findViewById(R.id.nb);
    suma = (Button) findViewById(R.id.suma);
    resta = (Button) findViewById(R.id.resta);
    division = (Button) findViewById(R.id.division);
    multiplicacion = (Button) findViewById(R.id.multiplicacion);
    resultado = (TextView) findViewById(R.id.resultado);
    limpiar = (Button) findViewById(R.id.limpiar);
    limpiar.setOnClickListener(new OnClickListener() {

    	public void onClick(View arg0) {
    	a.setText("");
    	b.setText("");
    	resultado.setText("");
    	}
    	});
  };

	public void suma(View v) {

		int n1 = Integer.parseInt(a.getText().toString());

		int n2 = Integer.parseInt(b.getText().toString());
		resultado.setText("Suma: " + (n1 + n2));
	}

	public void resta(View v) {
		int n1 = Integer.parseInt(a.getText().toString());
		int n2 = Integer.parseInt(b.getText().toString());
		resultado.setText("Resta: " + (n1 - n2));
	}

	public void division(View v) {
		int n1 = Integer.parseInt(a.getText().toString());
		int n2 = Integer.parseInt(b.getText().toString());
		resultado.setText("Division: " + (n1 / n2));
	}

	public void multiplicacion(View v) {
		int n1 = Integer.parseInt(a.getText().toString());
		int n2 = Integer.parseInt(b.getText().toString());
		resultado.setText("multiplicacion: " + (n1 * n2));

	}

}
