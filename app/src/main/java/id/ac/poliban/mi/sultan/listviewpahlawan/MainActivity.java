package id.ac.poliban.mi.sultan.listviewpahlawan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Hero> heroes = new ArrayList<>();
    private ListView lvHero;
    private BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvHero = findViewById(R.id.listview);
        heroes.addAll(HeroData.getAllHero());
        adapter = new HeroAdapter(heroes);
        lvHero.setAdapter(adapter);
        lvHero.setOnItemClickListener((parent, view, position, id) -> {
            new AlertDialog.Builder(this)
                    .setTitle("Pahlawan Yang Anda Pilih")
                    .setMessage("anda memilih : " + heroes.get(position).getHeroName())
                    .setPositiveButton("OK", null).show();
        });
    }
}
