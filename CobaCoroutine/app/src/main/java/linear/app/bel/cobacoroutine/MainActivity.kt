package linear.app.bel.cobacoroutine

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import linear.app.bel.cobacoroutine.experimental.Android
import java.io.IOException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

/*    fun test(){
        val job = launch { // launch new coroutine and keep a reference to its Job
            delay(1000L)
            Log.d("hai" , "Hello!")
        }
        Log.d("hai" , "World!")
        job.join() // wait until child coroutine completes
        runBlocking {
            Log.d("hai" , "Run Blocking!")
        }
    }*/

    override fun onResume() {
        super.onResume()
        /*launch(Android) { // launch new coroutine in background and continue
            delay(3000L)
            Log.d("hai" , "World!")
        }
        Log.d("hai" , "Hello!")
 // main thread continues here immediately
        runBlocking {     // but this expression blocks the main thread
            delay(2000L)  // ... while we delay for 2 seconds to keep JVM alive
            Log.d("hai" , "Run Blocking!")

        }*/

       /* val job = launch(Android) { // launch new coroutine and keep a reference to its Job
            delay(1000L)
            println("World!")
        }
        println("Hello,")
        job.join() // wait until child coroutine completes
*/



        launch(Android) {
            try {
                var result = SampleClient.fetchPosts()
                Toast.makeText(this@MainActivity, "${result.await()}", Toast.LENGTH_LONG).show()

            } catch (exception: IOException){
                Toast.makeText(this@MainActivity, "Phone not connected or service down", Toast.LENGTH_SHORT).show()
            }

        }
    }
}
