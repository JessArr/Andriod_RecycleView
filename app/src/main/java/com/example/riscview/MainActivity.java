package com.example.riscview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.riscview.adapters.GalloAdapter;
import com.example.riscview.models.Gallo;
import com.example.riscview.models.Pico;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Gallo> gallos=new ArrayList<>();
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));
        gallos.add(new Gallo("pepe","Colorado",new Pico("grande","rojo")));
        gallos.add(new Gallo("pull","giro",new Pico("grande","cafe")));
        gallos.add(new Gallo("juan","alakin",new Pico("chico","negro")));

        GalloAdapter  ga = new GalloAdapter(gallos);
        RecyclerView rv = (RecyclerView) findViewById(R.id.ric);
        rv.setAdapter(ga);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setHasFixedSize(true);



    }

}