package by.jonabogard.calculadora;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.*;

public class MainActivity extends Activity {
	
	EditText fn,sn;
	Button sum, res, mul, div;
	TextView result;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fn = (EditText) findViewById(R.id.bfn);
        sn = (EditText) findViewById(R.id.sn);
        
    }
    
}
