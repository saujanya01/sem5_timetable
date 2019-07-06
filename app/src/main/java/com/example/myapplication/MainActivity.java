package com.example.myapplication;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


public class MainActivity extends AppCompatActivity
{
    Spinner spinner;
    String[] mont={"10:00-11:00","11:00-12:00","14:00-15:00","16:00-17:00"};
    String[] monp={"Electrical Machines II","MPMC","Power Electronics","Breadth Paper"};

    String[] tuet={"10:00-11:00","11:00-12:00","14:00-17:00"};
    String[] tuep={"Power Electronics","Power System I","MP-I/PE-II (Lab)"};

    String[] wedt={"08:00-09:00","09:00-12:00","16:00-17:00"};
    String[] wedp={"MPMC","PE-I/EM-II(Lab)","Breadth Paper"};

    String[] thut={"09:00-10:00","10:00-11:00","11:00-12:00","14:00-17:00"};
    String[] thup={"Power System I","Electrical Machines II","Power Electronics","MP-II/EM-I (Lab)"};

    String[] frit={"08:00-09:00","09:00-10:00","10:00-11:00","11:00-12:00","16:00-17:00"};
    String[] frip={"Power System I","Electrical Machine II","MPMC","Power Electronics","Breadth Paper"};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,days);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                String str = spinner.getSelectedItem().toString();
                addData(str);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView)
            {

            }
        });
        //        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
//        {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
//            {
//                String str = spinner.getSelectedItem().toString();
//                addData(str);
//            }
//        });
    }
    private TextView getTextView(int id, String title, int color, int typeface, int bgColor)
    {
        TextView tv = new TextView(this);
        tv.setId(id);
        tv.setText(title.toUpperCase());
        tv.setTextColor(color);
        tv.setPadding(5, 5, 5, 5);
        tv.setTypeface(Typeface.DEFAULT, typeface);
        tv.setBackgroundColor(bgColor);
        tv.setLayoutParams(getLayoutParams());
        return tv;
    }

    @NonNull
    private TableRow.LayoutParams getLayoutParams() {
        TableRow.LayoutParams params = new TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.MATCH_PARENT);
        params.setMargins(2, 0, 0, 2);
        return params;
    }

    @NonNull
    private TableLayout.LayoutParams getTblLayoutParams() {
        return new TableLayout.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.MATCH_PARENT);
    }

    public void addData(String str)
    {
        int i,l;
        TableLayout tl;
//        TableRow tr = new TableRow(this);
        if (str=="Monday")
        {
            l = monp.length;
            tl = findViewById(R.id.table);
            if (tl.getParent()!=null)
            {
                tl.removeAllViews();
            }
            for (i=0;i<l;i++)
            {
                TableRow tr = new TableRow(this);
                tr.setLayoutParams(getLayoutParams());
                tr.addView(getTextView(i+1,mont[i], Color.BLACK,Typeface.NORMAL, ContextCompat.getColor(this, R.color.colorAccent)));
                tr.addView(getTextView(i+l,monp[i], Color.BLACK,Typeface.NORMAL, ContextCompat.getColor(this, R.color.colorAccent)));
                tl.addView(tr, getTblLayoutParams());
            }
        }
        else if (str=="Tuesday")
        {
            l = tuep.length;
            tl = findViewById(R.id.table);
            if (tl.getParent()!=null)
            {
                tl.removeAllViews();
            }
            for (i=0;i<l;i++)
            {
                TableRow tr = new TableRow(this);
                tr.setLayoutParams(getLayoutParams());
                tr.addView(getTextView(i+1,tuet[i], Color.BLACK,Typeface.NORMAL, ContextCompat.getColor(this, R.color.colorAccent)));
                tr.addView(getTextView(i+l,tuep[i], Color.BLACK,Typeface.NORMAL, ContextCompat.getColor(this, R.color.colorAccent)));
                tl.addView(tr, getTblLayoutParams());
            }
        }
        else if (str=="Wednesday")
        {
            l = wedp.length;
            tl = findViewById(R.id.table);
            if (tl.getParent()!=null)
            {
                tl.removeAllViews();
            }
            for (i=0;i<l;i++)
            {
                TableRow tr = new TableRow(this);
                tr.setLayoutParams(getLayoutParams());
                tr.addView(getTextView(i+1,wedt[i], Color.BLACK,Typeface.NORMAL, ContextCompat.getColor(this, R.color.colorAccent)));
                tr.addView(getTextView(i+l,wedp[i], Color.BLACK,Typeface.NORMAL, ContextCompat.getColor(this, R.color.colorAccent)));
                tl.addView(tr, getTblLayoutParams());
            }
        }
        else if (str=="Thursday")
        {
            l = thup.length;
            tl = findViewById(R.id.table);
            if (tl.getParent()!=null)
            {
                tl.removeAllViews();
            }
            for (i=0;i<l;i++)
            {
                TableRow tr = new TableRow(this);
                tr.setLayoutParams(getLayoutParams());
                tr.addView(getTextView(i+1,thut[i], Color.BLACK,Typeface.NORMAL, ContextCompat.getColor(this, R.color.colorAccent)));
                tr.addView(getTextView(i+l,thup[i], Color.BLACK,Typeface.NORMAL, ContextCompat.getColor(this, R.color.colorAccent)));
                tl.addView(tr, getTblLayoutParams());
            }
        }
        else if (str=="Friday")
        {
            l = frip.length;
            tl = findViewById(R.id.table);
            if (tl.getParent()!=null)
            {
                tl.removeAllViews();
            }
            for (i=0;i<l;i++)
            {
                TableRow tr = new TableRow(this);
                tr.setLayoutParams(getLayoutParams());
                tr.addView(getTextView(i+1,frit[i], Color.BLACK,Typeface.NORMAL, ContextCompat.getColor(this, R.color.colorAccent)));
                tr.addView(getTextView(i+l,frip[i], Color.BLACK,Typeface.NORMAL, ContextCompat.getColor(this, R.color.colorAccent)));
                tl.addView(tr, getTblLayoutParams());
            }
        }

//        l = monp.length;
//        for (i=0;i<l;i++)
//        {
//            TableRow tr = new TableRow(this);
//            tr.setLayoutParams(getLayoutParams());
//            tr.addView(getTextView(i+1,mont[i], Color.BLACK,Typeface.NORMAL, ContextCompat.getColor(this, R.color.colorAccent)));
//            tr.addView(getTextView(i+l,monp[i], Color.BLACK,Typeface.NORMAL, ContextCompat.getColor(this, R.color.colorAccent)));
//            tl.addView(tr, getTblLayoutParams());
//        }
    }
}
