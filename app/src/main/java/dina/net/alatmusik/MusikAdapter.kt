package dina.net.alatmusik

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MusikAdapter(var mContext: Context, var resources: Int, var items:List<Musik>): ArrayAdapter<Musik>(mContext, resources, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(mContext)
        val view:View = layoutInflater.inflate(resources, null)

        val imageView:ImageView = view.findViewById(R.id.photo)
        val namaMusik: TextView = view.findViewById(R.id.tvNama)
        val deskripsi: TextView = view.findViewById(R.id.tvDeskripsi)

        var mItem:Musik = items[position]
        imageView.setImageDrawable(mContext.resources.getDrawable(mItem.photo))
        namaMusik.text = mItem.nama
        deskripsi.text = mItem.deskripsi

        return view
    }
}