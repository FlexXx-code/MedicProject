import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.medicproject.R

class Sign_Up_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign__up_)


        val register = findViewById<Button>(R.id.registerBtn)
        var names = findViewById<TextView>(R.id.Details)
        var registerMail = findViewById<TextView>(R.id.registerMail)
        var registerPassword = findViewById<TextView>(R.id.registerPassword)

    }
    }