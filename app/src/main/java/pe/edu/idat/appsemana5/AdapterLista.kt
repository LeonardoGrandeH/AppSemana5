package pe.edu.idat.appsemana5

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.appsemana5.databinding.ItemlistaBinding

class AdapterLista(private var listItem:List<String>) : RecyclerView.Adapter<AdapterLista.ViewHolder>() {
    inner class ViewHolder(val binding: ItemlistaBinding)
        : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemlistaBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount()= listItem.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvnombre.setText(listItem.get(position))
    }
}