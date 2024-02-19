package pe.edu.idat.appsemana5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import pe.edu.idat.appsemana5.databinding.ActivityMainBinding
import pe.edu.idat.appsemana5.databinding.ItemlistaBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvlista.layoutManager = LinearLayoutManager(
            applicationContext)
        binding.rvlista.adapter = AdapterLista(listado())
    }

    private fun listado():List<String> {
        val Lista = ArrayList<String>()
        var i = 0
        while(i < 0){
            Lista.add("Valor $i")
            i++
        }
        return Lista
    }
}