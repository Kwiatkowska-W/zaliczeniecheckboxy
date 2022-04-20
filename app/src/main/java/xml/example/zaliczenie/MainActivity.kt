package xml.example.zaliczenie

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {
    lateinit var sport: CheckBox
    lateinit var music: CheckBox
    lateinit var turist: CheckBox
    lateinit var game: CheckBox
    lateinit var save: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fun onCreate(savedInstanceState: Bundle?) {
            title = "KotlinApp"
            sport = findViewById(R.id.sport)
            turist = findViewById(R.id.turist)
            music = findViewById(R.id.music)
            game = findViewById(R.id.game)
            save = findViewById(R.id.save)
            save.setOnClickListener {
                var totalAmount: Int = 0
                val result = StringBuilder()
                result.append("Selected Items")
                if (sport.isChecked) {
                    result.append("\n sport")
                }
                if (music.isChecked) {
                    result.append("\nmusic")
                }
                if (turist.isChecked) {
                    result.append("\nturist")
                }
                if (game.isChecked) {
                    result.append("\ngame")
                }
                result.append("\nhobby: " + "Rs")
                Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}
    //