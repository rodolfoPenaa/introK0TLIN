package com.example.k0app

import android.os.Bundle
import android.util.Log
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {                /*fun = funcion  */
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))

        // Ejercicios
        val toky = Dog()

        Log.e("Default", toky.toString())

        val mydog = Dog("cochallullo", 7)

        Log.e("firstDog", mydog.toString())

        "paralelepipedo".encriptarValor().print()


        /* Desafio Dia Dos*/

        var escolarBook0 = Library(
            "Mirror",
            "QWERTY",
            10101,
            "espejo",
            "100",
            502010,
            "z4",
            true
        )

        var escolarBook1 = Library(
            "Mir",
            "QWERT",
            101,
            "ejo",
            "1",
            5020,
            "zh",
            true
        )

        var escolarBook2 = Library(
            "Mirror",
            "QWE",
            1101,
            "espejo",
            "00",
            10,
            "zh0r4",
            true
        )

        val escolarBook3 = Library(
            "Mirror",
            "TY",
            11001,
            "espejo",
            "1070",
            502,
            "0r4",
            false
        )

        escolarBook0.formatedprice().print()
        escolarBook3.printINFObook().print()


        /*
        Log.e("0", "hola mundo")

        Toast.makeText(this, "esto es una tostada", Toast.LENGTH_LONG.show()
        /*3*/
        Log.e("3", getMyName("Rodolfo Peña Álvarez"))

        /*4-5*/
        val unocero = 10
        val doscero = 20
        val trescero = 30

        Log.e("SUMA", getNumbers(unocero, doscero, trescero).toString())

        /*6*/
        val narutoName: String
        var charchar: Char

        /*7*/
        asignateValue("Arataka")
        asigmateVar('0')

        /*8*/
        narutoName = "Arataka Reigen"
        Log.e("8", midiendo(narutoName).toString())

        charchar = '1'
        Log.e("8.1", changecharact(charchar).toString())

        /*9-10*/
        var floatingN: Float
        floatingN=0.1f

        /*11*/

        val byteMaximo = Byte.MAX_VALUE
        val shortMaxxx = Short.MAX_VALUE
        Log.e("11", "Valor máximo de almacenamiento para variables Byte:$byteMaximo" + "-" + "Valor máximo de almacenaiento para variables Short: $shortMaxxx")

        /*12*/
        val intMinimo = Int.MIN_VALUE
        val longMinimo = Long.MIN_VALUE
        Log.e("11", "Valor mínimo de almacenamiento para variables Int :$intMinimo" + "-" +"Valor minimo de almacenaiento para variables Long: $longMinimo")

        /*13*/

        var yesORnot:Boolean=true
        Log.e("13", yesORnot.toString())

        /*14-15-16*/
        Log.e("Hibrid answer", imprimiendoParametros("uno", "cero").toString())
        Log.e("IVA", obtieneIVA(52699).toString())



        var juegoDeArcade = JuegoDeArcade("Game of Fear", 10, "Thriller")
        Log.d ("Game", juegoDeArcade.toString())


    }


/*3*/
    fun getMyName(name: String): String{
        return "Mi nombre es: {$name}"
    }

    /*4-5*/
    fun getNumbers(uno0: Int, dos0:Int, tres0:Int):Int{
        return uno0+dos0+tres0
    }
    /*7*/
    fun asignateValue(name: String): String{
        var name = "Arataka Reigen"
                return name
    }
    fun asigmateVar(charac:Char): Char{
        var charac = 'A'
        return charac
    }
    /*8*/
    fun midiendo(word:String): Int{
        return word.count()
    }
    fun changecharact (newchar: Char): Char{
            var newchar = 'F'
            return newchar
    }

    /*14*/
    fun imprimiendoParametros(param1:String,param2:String):Int{
        val inputforprint: Int= param1.count() + param2.count()
        return inputforprint
    }

    /*15*/
    fun obtieneIVA(precio:Int):Double{
        val iva =precio*0.19
        return iva
    }
*/

    }
        override fun onCreateOptionsMenu(menu: Menu): Boolean {
            // Inflate the menu; this adds items to the action bar if it is present.
            menuInflater.inflate(R.menu.menu_main, menu)
            return true
        }

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            return when (item.itemId) {
                R.id.action_settings -> true
                else -> super.onOptionsItemSelected(item)
            }
        }
    }
