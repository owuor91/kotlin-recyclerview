package ke.co.recyclerviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    
    rvNames.layoutManager = LinearLayoutManager(baseContext)
    val namesAdapter = NamesRecyclerViewAdapter(listOf("Andrew", "Pauline", "Sue", "Manuel", "Veronica", "Arthur", "Esther", "David", "Patience"))
    rvNames.adapter = namesAdapter
  }
}