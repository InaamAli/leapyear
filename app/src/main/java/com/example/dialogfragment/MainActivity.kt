package com.example.dialogfragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ratingTV: TextView = findViewById(R.id.RateMe)
        ratingTV.setOnClickListener {
            var dialog_var = CustomDialogFragment()
            dialog_var.show(supportFragmentManager, "Custom Dialog")
        }
    }
    fun receiveFeedback(feedback: String) {
        val ratingTV: TextView = findViewById(R.id.RateMe)
        ratingTV.text = feedback
    }
}
