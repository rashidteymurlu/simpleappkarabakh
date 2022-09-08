package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMain4Binding
import com.google.android.material.snackbar.Snackbar

class MainActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button5.setOnClickListener {
            if (binding.edittext.text.isNotEmpty()) {
                var rayonadi = binding.edittext.text.toString()
                when (rayonadi) {
                    "Cebrayil" -> binding.yekun.text = "Işğal olunmuşdur: 18.08.1993 " +
                            " Azad edilmişdir: 04.10.2020"
                    "Füzuli" -> binding.yekun.text = "Işğal olunmuşdur: 23.08.1993" +
                            " Azad edilmişdir: 17.10.2020"
                    "Zəngilan" -> binding.yekun.text = "Işğal olunmuşdur: 29.10.1993" +
                            " Azad edilmişdir: 20.10.2020"
                    "Qubadlı" -> binding.yekun.text = "Işğal olunmuşdur: 23.07.1993" +
                            " Azad edilmişdir: 25.10.2020"
                    "Şuşa" -> binding.yekun.text = "Işğal olunmuşdur: 09.05.1992" +
                            " Azad edilmişdir: 08.11.2020"
                    "Ağdam" -> binding.yekun.text = "Işğal olunmuşdur: 23.07.1993" +
                            " Azad edilmişdir: 20.11.2020"
                    "Kəlbəcər" -> binding.yekun.text = "Işğal olunmuşdur: 02.04.1993" +
                            " Azad edilmişdir: 25.11.2020"
                    "Laçın" -> binding.yekun.text = "Işğal olunmuşdur: 18.05.1992" +
                            " Azad edilmişdir: 01.12.2020"
                    else -> {
                        val snackbar = Snackbar.make(it, "Tapılmadı.", Snackbar.LENGTH_SHORT).setAction("Diqqət", null)
                        snackbar.setActionTextColor(Color.WHITE)
                        val snackbarView = snackbar.view
                        snackbarView.setBackgroundColor(Color.BLACK)
                        snackbar.show()
                    }

                }
            }
                else{
                    val snackbar = Snackbar.make(it, "Lütfən axtardığınız rayonun adını daxil edin.", Snackbar.LENGTH_SHORT).setAction("Diqqət", null)
                    snackbar.setActionTextColor(Color.WHITE)
                    val snackbarView = snackbar.view
                    snackbarView.setBackgroundColor(Color.BLACK)
                    snackbar.show()
                }
                binding.edittext.text.clear()
                }
            }
        }


