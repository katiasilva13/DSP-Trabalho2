/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import DAO.*;
import Entidades.*;
import Gerenciar.*;

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
        id = 0;
        tabela = "Clientes";
        col1 = "";
        col2 = "";
        col3 = "";
        col4 = "";
        col5 = "";

        // crud.save(dbAtual, tabela, col1, col2, col3, col4, col5);
        //  crud.update(false, tabela, id, col1, col2, "col3, col4, col5); 
        // crud.delete(dbAtual, tabela, id);
        //  System.out.println(crud.getByID(dbAtual, tabela, id) );       
        //crud.getAllTable(dbAtual, tabela);   
    }

}
