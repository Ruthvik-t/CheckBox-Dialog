package com.example.admin.checkboxdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class myActivity extends ActionBarActivity {

    CharSequence[] items={"Google","Samsung","Microsoft","Tesco"};
    boolean[] itemsChecked=new boolean[items.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        AlertDialog.Builder adlg=new AlertDialog.Builder(myActivity.this);
        adlg.setIcon(R.drawable.ic_launcher);
        adlg.setTitle("This is For Practice bro...");

        adlg.setMultiChoiceItems(items,itemsChecked,new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                Toast.makeText(myActivity.this, items[which]+(isChecked? " Checked!": " UnChecked!"),Toast.LENGTH_SHORT).show();
            }
        });

        adlg.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            Toast.makeText(myActivity.this,"Ok Clicked!",Toast.LENGTH_SHORT).show();
            }
        });

        adlg.setNegativeButton("Cancel",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(myActivity.this,"Cancel Clicked!",Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog dlg=adlg.create();
        dlg.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
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
}
