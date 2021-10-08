package ge.nlatsabidze.summary4

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ge.nlatsabidze.summary4.databinding.ActivityStartTheGameBinding

class StartTheGameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStartTheGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartTheGameBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnStart.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}