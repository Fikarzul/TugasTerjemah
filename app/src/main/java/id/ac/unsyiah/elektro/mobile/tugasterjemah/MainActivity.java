package id.ac.unsyiah.elektro.mobile.tugasterjemah;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.view.MenuItem;




public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onClickTombolTerjemah(View view){
        TextView txtTulisan = (TextView) findViewById(R.id.txtTulisan);
        String coba = getString(R.string.indo);
        txtTulisan.setText(coba);

    }
     public void onClickTombolTerjemah2(View view){
        TextView txtTulisan = (TextView) findViewById(R.id.txtTulisan);
        String cuma = getString(R.string.ingg);
        txtTulisan.setText(cuma);

    }
    public void onClickTombolTerjemah3(View view){
        TextView txtTulisan = (TextView) findViewById(R.id.txtTulisan);
        String cuti = getString(R.string.aceh);
        txtTulisan.setText(cuti);
    }
}