package com.example.listas_recycler_card;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<ItemList> listaElementos;
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        ///llenado dinámico delñ rectycler
        listaElementos = new ArrayList<>();
        recycler = findViewById(R.id.recycler);
        recycler.setLayoutManager(new LinearLayoutManager(this));  ///como se manejan el contenedor de los datos

        llenarElementos();
        AdapterItemList adapter = new AdapterItemList(listaElementos);
        recycler.setAdapter(adapter);
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

    public void llenarElementos(){
        listaElementos.add(new ItemList("c++", "c++ es un lenguaje de programación compilado, funcional, "
                +"orientado a objetos, se usa para desktop, videojuegos y electrónica", R.drawable.cpp));
        listaElementos.add(new ItemList("Java", "Java es un lenguaje robusto usado para desktop, Web, apps empresariales," +
                "mobile, IA y hasta Data Science", R.drawable.java));
        listaElementos.add(new ItemList("JavaScript", "JavaScript es un lenguaje interpretado, usado especialmente" +
                "para el desarrollo Web frontend", R.drawable.javascript));
        listaElementos.add(new ItemList("Kotlin", "Lenguaje de alto rendimiento igual que Java y de sintaxis sencilla como python" +
                "usado para el desarrollo mobile para android native", R.drawable.kotlin));
    }
}