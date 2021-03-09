package com.example.listas_recycler_card;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterItemList extends RecyclerView.Adapter<AdapterItemList.ViewHolderItemList>{

    ///lista de los objetos
    ArrayList<ItemList> listaObjetos;

    public AdapterItemList(List<ItemList> lista){
        this.listaObjetos = (ArrayList<ItemList>) lista;
    }

    @NonNull
    @Override
    public ViewHolderItemList onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ///vincula la vista del objeto para el recylcer
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);

        return new ViewHolderItemList(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderItemList holder, int position) {
        holder.textTitulo.setText(listaObjetos.get(position).getTitulo());
        holder.textContenido.setText(listaObjetos.get(position).getInfo());
        holder.foto.setImageResource(listaObjetos.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listaObjetos.size();
    }

    public class ViewHolderItemList extends RecyclerView.ViewHolder{

        ///referencia a los componentes gráficos
        TextView textTitulo, textContenido;
        ImageView foto;

        public ViewHolderItemList(@NonNull View itemView) {
            super(itemView);
            textTitulo = itemView.findViewById(R.id.tituloItemList);
            textContenido = itemView.findViewById(R.id.contenidoItemList);
            foto = itemView.findViewById(R.id.imgPhoto);
        }
    }
}
