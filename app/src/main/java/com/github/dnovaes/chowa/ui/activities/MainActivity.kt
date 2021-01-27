package com.github.dnovaes.chowa.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.dnovaes.chowa.R


class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_list)
    }
}
