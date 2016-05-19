package com.example.charles.myappmaps.util;

/**
 * Created by EdivaGt on 18/05/2016.
 */
public class SQL {


    public static final int DBVERSION = 1;
    public static String DBNAME = "FORROSQLITE";


    // ********************************* //
    // **         Usuario             ** //
    // ********************************* //

    public static String TABLE_USUARIO = "USUARIO";

    //SQL - Criação de tabela usuaario
    public static String CREATE_USUARIO =
            " CREATE TABLE IF NOT EXISTS USUARIO (" +
                    "  ID_USUARIO INTEGER ," +
                    "  NOME VARCHAR(150), " +
                    "  CELULAR VARCHAR(010)," +
                    "  EMAIL VARCHAR(150) PRIMARY KEY, " +
                    "  SENHA VARCHAR(150) " +
                    " );";

    public static String GET_USUARIO =
            " SELECT ID_USUARIO, NOME, CELULAR ,EMAIL, SENHA" +
                    " FROM USUARIO " +
                    " WHERE EMAIL = ?";

    public static String GET_USUARIO_ALL =
            " SELECT ID_USUARIO, NOME, CELULAR ,EMAIL, SENHA" +
                    " FROM USUARIO ";

    // ********************************* //
    // **       Academia             ** //
    // ********************************* //

    public static String TABLE_ACADEMIA = "ACADEMIA";


    public static String CREATE_ACADEMIA =
            "CREATE TABLE IF NOT EXISTS ACADEMIA (" +
                    "  ID_ACADEMIA INTEGER PRIMARY KEY," +
                    "  NOME VARCHAR(255)," +
                    "  CELULAR VARCHAR(40), " +
                    "  FAVORITA INTEGER ," +
                    "  ID_USUARIO INTEGER, " +
                    "  FOREIGN KEY(ID_USUARIO) REFERENCES CLIENTE(ID_USUARIO)" +
                    ");";

   /* public static String GET_ACADEMIA_ALL =
            " SELECT ID_ACADEMIA, NOME, CELULAR,FAVORITA, USUARIO.ID_USUARIO " +
                    " FROM ACADEMIA " +
                    " INNER JOIN USUARIO " +
                    " ON ACADEMIA.ID_USUARIO = USUARIO.ID_USUARIO ";*/

    public static String GET_ACADEMIA_ALL =
            " SELECT ID_ACADEMIA, NOME, CELULAR, FAVORITA ,ID_USUARIO " +
                    " FROM ACADEMIA ORDER BY NOME";




}
