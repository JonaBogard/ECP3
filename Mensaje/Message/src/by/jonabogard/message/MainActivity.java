package by.jonabogard.message;

import android.os.Bundle;
import android.widget.*;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
EditText message;
Button Ver, Borrar;
TextView Res;

@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
message = (EditText) findViewById(R.id.message);
Ver = (Button) findViewById(R.id.btnVer);
Borrar = (Button) findViewById(R.id.btnBorrar);
Res = (TextView) findViewById(R.id.txtRes);
Borrar.setOnClickListener(new OnClickListener() {

@Override
public void onClick(View arg0) {
Res.setText("");
message.setText("");
}
});
Ver.setOnClickListener(new OnClickListener() {
public void onClick(View arg0) {
Res.setText("mensaje:" + message.getText());
}
});
}
}
