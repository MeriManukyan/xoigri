package com.example.meri.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    TableLayout.LayoutParams layoutParams;
    Button b;
    TableRow.LayoutParams l;
    int c=0;
    int p=0;
    int m=0;
    ArrayList<Integer> ao=new ArrayList<>();
    ArrayList<Integer> ax=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final TableLayout tableLayout=new TableLayout(this);
        tableLayout.setOrientation(LinearLayout.VERTICAL);

        layoutParams=new TableLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        //layoutParams.weight=1;
        tableLayout.setLayoutParams(layoutParams);
        setContentView(tableLayout,layoutParams);

        Intent intent=getIntent();
        int i=Integer.valueOf(intent.getStringExtra("key"));
        for(int k=0;k<i;k++) {
            TableRow tableRow = new TableRow(this);
            layoutParams = new TableLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT);
            layoutParams.weight=1;
            tableRow.setLayoutParams(layoutParams);

            for (int j = 0; j < i; j++) {
                b = new Button(this);
                b.setId(k * 10 + j + 2);
                l = new TableRow.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT);
                l.weight = 1;
                b.setLayoutParams(l);
                tableRow.addView(b);
                b.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int e = v.getId();
                        if (c % 2 == 0) {
                            if (((Button) v).getText().toString() == "") {
                                ((Button) v).setText("o");
                                c++;
                                ao.add(v.getId());
                                p++;

                                for (int z = 0; z < ao.size(); z++) {
                                    if (e - 11 == ao.get(z))
                                        for (int x = 0; x < ao.size(); x++)
                                            if (e + 11 == ao.get(x)) {
                                                Toast.makeText(getApplicationContext(), "o win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                    if (e - 9 == ao.get(z))
                                        for (int x = 0; x < ao.size(); x++)
                                            if (e + 9 == ao.get(x)) {
                                                Toast.makeText(getApplicationContext(), "o win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                    if (e - 11 == ao.get(z))
                                        for (int x = 0; x < ao.size(); x++)
                                            if (e - 22 == ao.get(x)) {
                                                Toast.makeText(getApplicationContext(), "o win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                    if (e - 9 == ao.get(z))
                                        for (int x = 0; x < ao.size(); x++)
                                            if (e - 18 == ao.get(x)) {
                                                Toast.makeText(getApplicationContext(), "o win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                    if (e + 9 == ao.get(z))
                                        for (int x = 0; x < ao.size(); x++)
                                            if (e + 18 == ao.get(x)) {
                                                Toast.makeText(getApplicationContext(), "o win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }

                                    if (e + 11 == ao.get(z))
                                        for (int x = 0; x < ao.size(); x++)
                                            if (e + 22 == ao.get(x)) {
                                                Toast.makeText(getApplicationContext(), "o win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }

                                    if (e - 1 == ao.get(z))
                                        for (int x = 0; x < ao.size(); x++) {
                                            if (e - 2 == ao.get(x)) {
                                                Toast.makeText(getApplicationContext(), "o win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                        }

                                    if (e + 10 == ao.get(z)) {
                                        for (int x = 0; x < ao.size(); x++) {
                                            if (e + 20 == ao.get(x) || e - 10 == ao.get(x)) {
                                                Toast.makeText(getApplicationContext(), "o win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                        }
                                    }
                                    if (e - 10 == ao.get(z)) {
                                        for (int x = 0; x < ao.size(); x++) {
                                            if (e - 20 == ao.get(x)) {
                                                Toast.makeText(getApplicationContext(), "o win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                         else {
                            if (((Button) v).getText().toString() == "") {
                                ((Button) v).setText("x");
                                c = 0;
                                ax.add(v.getId());
                                m++;
                                for (int z = 0; z < ax.size(); z++) {
                                    if (e - 11 == ax.get(z))
                                        for (int x = 0; x < ax.size(); x++)
                                            if (e + 11 == ax.get(x)) {
                                                Toast.makeText(getApplicationContext(), "x win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                    if (e - 9 == ax.get(z))
                                        for (int x = 0; x < ax.size(); x++)
                                            if (e + 9 == ax.get(x)) {
                                                Toast.makeText(getApplicationContext(), "x win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                    if (e - 11 == ax.get(z))
                                        for (int x = 0; x < ax.size(); x++)
                                            if (e - 22 == ax.get(x)) {
                                                Toast.makeText(getApplicationContext(), "x win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                    if (e - 9 == ax.get(z))
                                        for (int x = 0; x < ax.size(); x++)
                                            if (e - 18 == ax.get(x)) {
                                                Toast.makeText(getApplicationContext(), "x win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                    if (e + 9 == ax.get(z))
                                        for (int x = 0; x < ax.size(); x++)
                                            if (e + 18 == ax.get(x)) {
                                                Toast.makeText(getApplicationContext(), "x win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }

                                    if (e + 11 == ax.get(z))
                                        for (int x = 0; x < ax.size(); x++)
                                            if (e + 22 == ax.get(x)) {
                                                Toast.makeText(getApplicationContext(), "x win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                    if (e + 1 == ax.get(z)) {
                                        for (int x = 0; x < ax.size(); x++) {
                                            if (e - 1 == ax.get(x) || e + 2 == ax.get(x)) {
                                                Toast.makeText(getApplicationContext(), "x win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                        }
                                    }
                                    if (e - 1 == ax.get(z)) {
                                        for (int x = 0; x < ao.size(); x++) {
                                            if (e - 2 == ax.get(x)) {
                                                Toast.makeText(getApplicationContext(), "x win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                        }
                                    }

                                    if (e + 10 == ax.get(z)) {
                                        for (int x = 0; x < ax.size(); x++) {
                                            if (e + 20 == ax.get(x) || e - 10 == ax.get(x)) {
                                                Toast.makeText(getApplicationContext(), "x win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                        }
                                    }
                                    if (e - 10 == ax.get(z)) {
                                        for (int x = 0; x < ax.size(); x++) {
                                            if (e - 20 == ax.get(x)) {
                                                Toast.makeText(getApplicationContext(), "x win!!!", Toast.LENGTH_LONG).show();
                                                tableLayout.setVisibility(View.INVISIBLE);
                                            }
                                        }
                                    }
                                }
                            }
                        }

                    }
                });
            }

            tableLayout.addView(tableRow);
        }
    }
}


