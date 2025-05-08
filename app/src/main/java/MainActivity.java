import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<AndroidVersion> versionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        versionList = new ArrayList<>();

        versionList.add(new AndroidVersion("Cupcake", "Android 1.5", R.drawable.cupcake));
        versionList.add(new AndroidVersion("Donut", "Android 1.6", R.drawable.donut));
        versionList.add(new AndroidVersion("Eclair", "Android 2.0", R.drawable.eclair));
        // Add more items here...

        AndroidVersionAdapter adapter = new AndroidVersionAdapter(this, versionList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((adapterView, view, position, l) -> {
            AndroidVersion selected = versionList.get(position);
            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("title", selected.title);
            intent.putExtra("description", selected.description);
            intent.putExtra("image", selected.image);
            startActivity(intent);
        });
    }
}
