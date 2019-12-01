/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import DAO.*;
import Entidades.*;
import Gerenciar.*;
import Telas.*;
import Hibernate.*;
import java.util.List;

/**
 *
 * @author Aula
 */
public class Menu {

    public static void main(String[] args) {
        CRUD crud = new CRUD();
        boolean dbAtual;
        long id;
        String tabela;
        String col1, col2, col3, col4, col5;
        //Produto(nome, fornecedor, preco, codigo);
        //Funcionario(nome, ultimoNome, email, cel);
        //Cliente(nome, ultimoNome, email, cel, cpf);
        //Vendas(Produto.nome, Cliente.nome, Funcionário.nome, Produto.preco, Produto.codigo);   
        dbAtual = true;
        id = 1;
        tabela = "Funcionarios";
        col1 = "";
        col2 = "";
        col3 = "";
        col4 = "";
        col5 = "";
        //  crud.save(dbAtual, tabela, col1, col2, col3, col4, col5);
        //  crud.getByID(dbAtual, tabela, id);
        crud.getAllTable(dbAtual, tabela);

    }
    //TODO metodo update e delete em CRUD

    private static void update(String tabela, long id, String nome) {
        DAOmysql dao = new DAOmysql();
        Entidades e = null;
        e = dao.getByID(tabela, id);
        e.setNome(nome);
        dao.Update(e);
    }

    private static void delete(boolean dbAtual, String tabela, long id) {
        DAOmysql mysqlCon = new DAOmysql();
        mysqlCon.Delete(tabela, id);
        CRUD crud = new CRUD();
        crud.getAllTable(dbAtual, tabela);

    }

}
