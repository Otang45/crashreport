package otang.crashreport.sample;

import androidx.appcompat.app.AppCompatActivity;
import android.os.*;
import android.util.Log;
import android.content.Context;
import android.widget.Toast;
import otang.crashreport.sample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

  private ActivityMainBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // Inflate and get instance of binding
    binding = ActivityMainBinding.inflate(getLayoutInflater());
    // Setup toolbar
    setSupportActionBar(binding.toolbar);
    // set content view to binding's root
    setContentView(binding.getRoot());
    // Use lambdas
    binding.fab.setOnClickListener(
        v -> {
          throw new RuntimeException("Test");
        });
  }
}
