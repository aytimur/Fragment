package ibrahim.aytimur.fragmentkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentDegistir(Fragment1())
        button1.setOnClickListener {
            fragmentDegistir(Fragment1())
        }
        button2.setOnClickListener {
            fragmentDegistir(Fragment2())
        }
        button3.setOnClickListener {
            fragmentDegistir(Fragment3())
        }
    }
    fun fragmentDegistir(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}
