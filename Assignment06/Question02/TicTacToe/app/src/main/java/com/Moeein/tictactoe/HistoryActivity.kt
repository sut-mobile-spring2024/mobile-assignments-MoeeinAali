package com.Moeein.tictactoe

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.Moeein.tictactoe.databinding.ActivityHistoryBinding
import com.Moeein.tictactoe.databinding.ActivityMenuBinding


class HistoryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHistoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.binding = ActivityHistoryBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(this.binding.root)

        val history = FileUtils.readFromFile("game.txt", this)
//        binding.txtviewHistory.text = "X Won!\nO Won!\nX Won!\nX Won!\nX Won!\nO Won!"
//        binding.txtviewHistory.text = history

        binding.buttonClear.setOnClickListener {
            binding.txtviewHistory.text = ""
            FileUtils.writeToFile("history.txt", "", this)
        }


    }
}