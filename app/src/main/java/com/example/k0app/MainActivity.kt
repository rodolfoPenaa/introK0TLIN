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

            Log.d("0", "hola mundo")

        Toast.makeText(this,"esto es una tostada", Toast.LENGTH_LONG)
        /*3*/
            Log.d("3", getMyName("Rodolfo Peña Álvarez"))

        /*4-5*/
        Log.d("SUMA", getNumbers(uno0 = 10, dos0 = 20, tres0 = 30).toString())

        /*6*/
        asignateValue("Arataka Reigen", 'A')
        var character = 'A'

        /*8*/
        Log.d("8", midiendo("Arataka Reigen").toString())

        Log.d("8.1", changecharact(character).toString())


    }



    /*3*/
    fun getMyName(name: String): String{
        return "Mi nombre es: {$name}"
    }

    /*4-5*/
    fun getNumbers(uno0: Int, dos0:Int, tres0:Int):Int{
        return uno0+dos0+tres0
    }
    /*6-7*/
    fun asignateValue(name: String,charac:Char){
        return
    }

    /*8*/
    fun midiendo(word:String): Int{
        return word.count()
    }
    fun changecharact (newchar: Char): Char{
            var newchar = 'F'
            return newchar
    }

    /*9*/



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