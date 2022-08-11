package me.dio.teatro_marcelo_denny_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.provider.CalendarContract.Events.*
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSetEvent = findViewById<Button>(R.id.btn_setEvent)
        btnSetEvent.setOnClickListener {

            val intent = Intent(Intent.ACTION_INSERT)
                .setData(CONTENT_URI)
                .putExtra(TITLE, "Oficina de Teatro Narrativo")
                .putExtra(EVENT_LOCATION, "Teatro Macelo Denny")
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, System.currentTimeMillis())
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, System.currentTimeMillis()+(60*60*1000))

            startActivity(intent)
        }

        val btnContacts = findViewById<Button>(R.id.btn_Contacts)
        btnContacts.setOnClickListener {
            val intent = Intent(this, activity_contacts::class.java)
            startActivity(intent)
        }

        val btnImages = findViewById<Button>(R.id.btn_Images)
        btnImages.setOnClickListener {
            val intent = Intent(this, activity_images::class.java)
            startActivity(intent)
        }
    }
}