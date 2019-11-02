package nichat.com.dummynews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8;
    Intent i;
    Bundle b=new Bundle();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView)findViewById(R.id.tv1);
        tv2 = (TextView)findViewById(R.id.tv2);
        tv3 = (TextView)findViewById(R.id.tv3);
        tv4 = (TextView)findViewById(R.id.tv4);
        tv5 = (TextView)findViewById(R.id.tv5);
        tv6 = (TextView)findViewById(R.id.tv6);
        tv7 = (TextView)findViewById(R.id.tv7);
        tv8 = (TextView)findViewById(R.id.tv8);
        tv1.setOnClickListener(this);
        tv2.setOnClickListener(this);
        tv3.setOnClickListener(this);
        tv4.setOnClickListener(this);
        tv5.setOnClickListener(this);
        tv6.setOnClickListener(this);
        tv7.setOnClickListener(this);
        tv8.setOnClickListener(this);
        if(getIntent().getBooleanExtra("exit",false)){
            finish();}
    }

    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.tv1:
                i = new Intent(MainActivity.this, Activity2.class);
                b.putInt("news",1);
                i.putExtras(b);
                startActivity(i);
                finish();
                break;
            case R.id.tv2:
                i = new Intent(MainActivity.this,Activity2.class);
                b.putInt("news",2);
                i.putExtras(b);
                startActivity(i);
                finish();
                break;
            case R.id.tv3:
                i = new Intent(MainActivity.this,Activity2.class);
                b.putInt("news",3);
                i.putExtras(b);
                startActivity(i);
                finish();
                break;
            case R.id.tv4:
                i = new Intent(MainActivity.this,Activity2.class);
                b.putInt("news",4);
                i.putExtras(b);
                startActivity(i);
                finish();
                break;
            case R.id.tv5:
                i = new Intent(MainActivity.this,Activity2.class);
                b.putInt("news",5);
                i.putExtras(b);
                startActivity(i);
                finish();
                break;
            case R.id.tv6:
                i = new Intent(MainActivity.this,Activity2.class);
                b.putInt("news",6);
                i.putExtras(b);
                startActivity(i);
                finish();
                break;
            case R.id.tv7:
                i = new Intent(MainActivity.this,Activity2.class);
                b.putInt("news",7);
                i.putExtras(b);
                startActivity(i);
                finish();
                break;
            case R.id.tv8:
                i = new Intent(MainActivity.this,Activity2.class);
                b.putInt("news",8);
                i.putExtras(b);
                startActivity(i);
                finish();
                break;
        }
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.sp:
                return showIntent("sp");
            case R.id.en:
                return showIntent("en");
            case R.id.tc:
                return showIntent("tc");
            case R.id.po:
                return showIntent("po");
            case R.id.se:
                return showIntent("se");
            case R.id.ex:
                return showIntent("ex");
            default:
                return true;
        }
    }
    public boolean showIntent(String option)
    {
        if(option.equalsIgnoreCase("sp"))
        {
            i=new Intent(getBaseContext(),Activity4.class);
            startActivity(i);
            finish();
        }
        if(option.equalsIgnoreCase("en"))
        {
            i=new Intent(getBaseContext(),Activity5.class);
            startActivity(i);
            finish();
        }
        if(option.equalsIgnoreCase("tc"))
        {
            i=new Intent(getBaseContext(),Activity6.class);
            startActivity(i);
            finish();
        }
        if(option.equalsIgnoreCase("po"))
        {
            i=new Intent(getBaseContext(),Activity7.class);
            startActivity(i);
            finish();
        }
        if(option.equalsIgnoreCase("se"))
        {
            i=new Intent(getBaseContext(),Activity3.class);
            startActivity(i);
            finish();
        }
        if(option.equalsIgnoreCase("ex"))
        {
            Intent i4=new Intent(MainActivity.this,MainActivity.class);
            i4.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            i4.putExtra("exit", true);
            startActivity(i4);
            finish();
        }
        return true;
    }
}
