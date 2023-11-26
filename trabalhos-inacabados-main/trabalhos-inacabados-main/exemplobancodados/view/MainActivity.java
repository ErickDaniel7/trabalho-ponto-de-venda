package com.example.exemplobancodados.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.exemplobancodados.R;
import com.example.exemplobancodados.dao.AlunoDao;
import com.example.exemplobancodados.model.Aluno;

public class MainActivity extends AppCompatActivity {
    /**
     * M/V/C (Model,View, Controller
     *View comunica com o Controller e o Controller se comunica com o Dao
     * @param savedInstanceState
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Aluno aluno = new Aluno();
        aluno.setRa(123);
        aluno.setNome("JUCA");
        AlunoDao.getInstancia(this).insert(aluno);
    }
}