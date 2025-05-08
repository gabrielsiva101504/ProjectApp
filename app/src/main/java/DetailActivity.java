import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView titleView, descriptionView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.detail_image);
        titleView = findViewById(R.id.detail_title);
        descriptionView = findViewById(R.id.detail_description);

        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        int image = getIntent().getIntExtra("image", R.drawable.ic_launcher_foreground);

        titleView.setText(title);
        descriptionView.setText(description);
        imageView.setImageResource(image);
    }
}
