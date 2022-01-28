package com.example.replikalivin.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.replikalivin.utils.ListUser
import com.example.replikalivin.databinding.ListUserBinding
import com.example.replikalivin.temp.UserDetail

class RecycleViewAdapter(private val listUser: ListUser): RecyclerView.Adapter<RecycleViewAdapter.ListViewHolder>(){
    class ListViewHolder(val binding: ListUserBinding) : RecyclerView.ViewHolder(binding.root) {
//        var nameFill: TextView = itemView.findViewById(R.id.name)
//        var photoFill: ImageView = itemView.findViewById(R.id.avatar)
//        var positionFill: TextView = itemView.findViewById(R.id.position)
//        var deptFill: TextView = itemView.findViewById(R.id.department)
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
//        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_user, parent, false)
//        return ListViewHolder(view)
        val binding = ListUserBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.binding.name.text = ListUser.listNama[position]
//        Glide.with(holder.itemView.context)
//            .load(listUser.listPhoto[position])
//            .apply(RequestOptions().override(55, 55))
//            .into(holder.photoFill)
        holder.binding.avatar.setImageResource(ListUser.listPhoto[position])
        holder.binding.position.text = ListUser.listPosition[position]
        holder.binding.department.text = ListUser.listDepartment[position]
        holder.binding.root.setOnClickListener {
            val moveIntent = Intent(it.context, UserDetail::class.java)
            moveIntent.putExtra("detailAvatar", ListUser.listPhoto[position])
            moveIntent.putExtra("nameDetail", ListUser.listNama[position])
            moveIntent.putExtra("positionDetail", ListUser.listPosition[position])
            moveIntent.putExtra("departmentDetail", ListUser.listDepartment[position])
            moveIntent.putExtra("descriptionContent", ListUser.listDescriptionContent[position])
            startActivity(it.context, moveIntent, null)

        }

    }

    override fun getItemCount(): Int {
        return ListUser.listNama.size
    }

}