package com.example.myapplication

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setMessage("Do you want to exit? ")
        builder.setTitle("Alert")
        builder.setCancelable(false)

        builder.setPositiveButton("Yes",DialogInterface.OnClickListener { _, _ ->
            finish()
        })

        builder.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
            dialogInterface.cancel()
        })

        val alertDialog = builder.create()

        alertDialog.show()
    }
}