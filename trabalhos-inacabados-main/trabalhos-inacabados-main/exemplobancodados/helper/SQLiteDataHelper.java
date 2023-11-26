package com.example.exemplobancodados.helper;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

/**
 * Classe responsável em criar a base de dados/manter a estrutura
 *  Criar/manter tabela
 */
public class SQLiteDataHelper extends SQLiteOpenHelper {


    public SQLiteDataHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    /**
     * Método responsável pela criação das tabelas
     * ele executa os scripts no momento de instalação do aplicativo
     * @param sqLiteDatabase
     */

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE ALUNO(RA INTEGER, NOME VARCHAR(100))");
        sqLiteDatabase.execSQL("CREATE TABLE PROFESSOR(RA INTEGER, NOME VARCHAR(100))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }
}
