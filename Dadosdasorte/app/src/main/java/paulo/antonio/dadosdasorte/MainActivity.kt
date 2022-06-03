package paulo.antonio.dadosdasorte

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //findViewById(id)

        val btn_6 = findViewById<Button>(R.id.btn_d6)
        val btn_12 = findViewById<Button>(R.id.btn_d12)
        val btn_20 = findViewById<Button>(R.id.btn_d20)

        btn_6.setOnClickListener {
            //Mensagem flutuante - Toast
            //Toast.makeText(this, "Clicou!", Toast.LENGTH_LONG).show()
            rolarDados(6)
        }
        btn_12.setOnClickListener {
            rolarDados(12)
        }
        btn_20.setOnClickListener {
            rolarDados(20)
        }
    }


    private fun rolarDados(lados: Int){
        val rolagem = (1..lados).random()

        val textDado = findViewById<TextView>(R.id.textDado)
        textDado.text = rolagem.toString()

        val image = findViewById<ImageView>(R.id.imgLados)

        when(rolagem){
            1 -> image.setImageResource(R.drawable.dice_1)
            2 -> image.setImageResource(R.drawable.dice_2)
            3 -> image.setImageResource(R.drawable.dice_3)
            4 -> image.setImageResource(R.drawable.dice_4)
            5 -> image.setImageResource(R.drawable.dice_5)
            6 -> image.setImageResource(R.drawable.dice_6)
        }

    }

}




