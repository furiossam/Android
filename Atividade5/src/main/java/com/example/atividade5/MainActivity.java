package com.example.atividade5;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static final String TAG = "MainActivity";



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declarando os objetos do main.xml
        ListView lView = findViewById(R.id.lView);EditText eText = findViewById(R.id.eText);
        final TextView nome = findViewById(R.id.tvnome);final TextView pop = findViewById(R.id.tvpop);
        final TextView dens = findViewById(R.id.tvdens);final TextView area = findViewById(R.id.tvarea);

        Cidade cid1 = new Cidade("Abdon Batista", 2656, 11.27, 235.600);
        Cidade cid2 = new Cidade("Agronomica", 5172, 38.05, 135.923);
        Cidade cid3 = new Cidade("Angelina", 5166, 10.33, 499.947);
        Cidade cid4 = new Cidade("Camboriu", 74434, 293.62, 212320);
        Cidade cid5 = new Cidade("Canoinhas", 52765, 46.09, 1144.84);
        Cidade cid6 = new Cidade("Florianopolis", 453285, 671.12, 675.409);
        Cidade cid7 = new Cidade("Governador Celso Ramos", 13655, 116.53, 117.182);
        Cidade cid8 = new Cidade("Jaguaruna", 16418, 48.7, 329.459);
        Cidade cid9 = new Cidade("Lages", 157743, 59.65, 2631.504);
        Cidade cid10 = new Cidade("Xanxere", 41766, 109.5, 381.41);

        final ArrayList<Cidade> cidades = new ArrayList<Cidade>();
        cidades.add(cid1);
        cidades.add(cid2);
        cidades.add(cid3);
        cidades.add(cid4);
        cidades.add(cid5);
        cidades.add(cid6);
        cidades.add(cid7);
        cidades.add(cid8);
        cidades.add(cid9);
        cidades.add(cid10);

        final ArrayList<String> lstCidades = new ArrayList<>();
        lstCidades.add(cid1.getNome());
        lstCidades.add(cid2.getNome());
        lstCidades.add(cid3.getNome());
        lstCidades.add(cid4.getNome());
        lstCidades.add(cid5.getNome());
        lstCidades.add(cid6.getNome());
        lstCidades.add(cid7.getNome());
        lstCidades.add(cid8.getNome());
        lstCidades.add(cid9.getNome());
        lstCidades.add(cid10.getNome());

        final ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,lstCidades);
        lView.setAdapter(adapter);

        eText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int start, int before, int count) {
                adapter.getFilter().filter(charSequence.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),cidades.get(position).getNome(),Toast.LENGTH_SHORT).show();
                nome.setText(cidades.get(position).getNome());
                pop.setText(String.valueOf(cidades.get(position).getPop()));
                area.setText(String.valueOf(cidades.get(position).getArea()));
                dens.setText(String.valueOf(cidades.get(position).getDensDem()));
            }
        });

    }


}
