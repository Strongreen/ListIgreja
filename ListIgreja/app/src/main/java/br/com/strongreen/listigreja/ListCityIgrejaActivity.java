package br.com.strongreen.listigreja;

import android.app.Activity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListCityIgrejaActivity extends Activity implements AdapterView.OnItemClickListener
{
    private ListView listView;
    private AdapterListView adapterListView;
    private ArrayList<Objeto> itens;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //carrega o layout onde contem o ListView
        setContentView(R.layout.activity_list_city_igreja);

        //Pega a referencia do ListView
        listView = (ListView) findViewById(R.id.list);
        //Define o Listener quando alguem clicar no item.
        listView.setOnItemClickListener(this);

        createListView();
    }

    private void createListView()
    {
        //Criamos nossa lista que preenchera o ListView
        itens = new ArrayList<Objeto>();
        Objeto item1 = new Objeto("Igreja Nossa Senhora de Lourdes", R.drawable.lourdes);
        Objeto item2 = new Objeto("Basilica Sagrado Coração de Jesus", R.drawable.santuario);
        Objeto item3 = new Objeto("Igreja São Sebastião", R.drawable.sebastiao);
        Objeto item4 = new Objeto("Matriz Nossa Senhora da Conceição", R.drawable.matriz);

        itens.add(item1);
        itens.add(item2);
        itens.add(item3);
        itens.add(item4);

        //Cria o adapter
        adapterListView = new AdapterListView(this, itens);

        //Define o Adapter
        listView.setAdapter(adapterListView);
        //Cor quando a lista é selecionada para rolagem.
        listView.setCacheColorHint(Color.TRANSPARENT);
    }

    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3)
    {
        //Pega o item que foi selecionado.
        Objeto item = adapterListView.getItem(arg2);
        //Demostração
        Toast.makeText(this, "Você Clicou em: " + item.getTexto(), Toast.LENGTH_LONG).show();
    }
}
