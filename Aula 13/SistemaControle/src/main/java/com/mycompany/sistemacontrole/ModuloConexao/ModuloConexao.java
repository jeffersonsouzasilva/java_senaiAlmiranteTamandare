package com.mycompany.sistemacontrole.ModuloConexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class ModuloConexao {
    //Método responsável por fazer a conexão com o banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //a linha abaixo chama o Driver
        String driver = "com.mysql.jdbc.Driver";
        //armazenado informações referenste ao banco
        String url = "jdbc:mysql://localhost:3306/dbempresa";
        String user = "root";
        String password = "Sen@i2025";
        //estabelecer conexão com banco
        try {
           Class.forName(driver);
           conexao = DriverManager.getConnection(url, user, password);
           return conexao;
       } catch (Exception e){
           System.out.println(e);
           return null;
       }

    }
    
}
