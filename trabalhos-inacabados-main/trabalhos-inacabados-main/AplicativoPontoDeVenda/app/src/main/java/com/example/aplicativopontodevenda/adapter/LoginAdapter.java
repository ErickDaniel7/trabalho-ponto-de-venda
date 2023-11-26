package com.example.aplicativopontodevenda.adapter;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.aplicativopontodevenda.model.LoginModel;

import java.util.ArrayList;

public class LoginAdapter extends
        RecyclerView.Adapter<AlunoListAdapter.ViewHolder> {

        private ArrayList<LoginModel> listaLogin;
        private Context context;

    public LoginAdapter(ArrayList<LoginModel> listaLogin, Context context) {
        this.listaLogin = listaLogin;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.item_list_login,
                parent, false);

        return new ViewHolder(listItem);
    }
    }
}
