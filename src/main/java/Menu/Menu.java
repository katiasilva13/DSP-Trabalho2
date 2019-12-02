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

        DAOpostgres daoPsql = new DAOpostgres();
        id= 1;
        Clientes c = (Clientes) daoPsql.getByID(tabela, id); 
//        System.out.println("id "+ c.getId()+" nome: "+c.getNome()+" sobrenome "
//        +c.getUltimoNome()+" email "+c.getEmail()+" cel:"+c.getCel()+" cpf "+c.getCpf());

//        if (!crud.checkID(false, tabela, id)) {
//            crud.save(false, tabela, c.getNome(), c.getUltimoNome(),
//                    c.getEmail(), c.getCel(), c.getCpf());
//        } else if (crud.checkID(false, tabela, id)){
//            crud.update(false, tabela, id, c.getNome(),
//                    c.getUltimoNome(), c.getEmail(), c.getCel(), c.getCpf());
//        }


      //  crud.save(dbAtual, tabela, col1, col2, col3, col4, col5);
      crud.update(true, tabela, 1, "Eriks", "Henrique", "eriks@henrique", "89870000", "77"); 
    //     crud.delete(dbAtual, tabela, 1);
        //  System.out.println(crud.getByID(dbAtual, tabela, id) );       
        //crud.getAllTable(dbAtual, tabela);
       // System.out.println("last id:"+crud.lastID(dbAtual, tabela));
    }

}
