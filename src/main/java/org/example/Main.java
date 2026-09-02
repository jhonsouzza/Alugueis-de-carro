package org.example;

import Connection.Conexao;
import java.sql.Connection;


public class Main {

    public static void main(String[] args) {

        Connection conexao = Conexao.getConnection();

        System.out.println("Conectado com sucesso!");

    }
}

