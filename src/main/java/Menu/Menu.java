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
        id = 1;
//        Clientes c = (Clientes) daoPsql.getByID(tabela, id);
//        System.out.println("id " + c.getId() + " nome: " + c.getNome() + " sobrenome "
//                + c.getUltimoNome() + " email " + c.getEmail() + " cel:" + c.getCel() + " cpf " + c.getCpf());

        //isso não funciona
//        crud.update(false, tabela, id, c.getNome(),
//                c.getUltimoNome(), c.getEmail(), c.getCel(), c.getCpf());

//Build sucess: Try catch, não gera loop
    //transaction.setTimout antes de begintransaction = isso para de funcionar
        //    crud.update(false, tabela, 1, "Eriks", "Henrique", "eriks@henrique", "05", "92"); 
    //mas isso funciona
        //    crud.update(true, tabela, 1, "Eriks", "Henrique", "eriks@henrique", "05", "92"); 
//Build failure: Gera loop     
    //transaction.setTimout depois de begintransaction = isso para de funcionar
        //    crud.update(false, tabela, 1, "Eriks", "Henrique", "eriks@henrique", "05", "93"); 
    //mas isso não funciona
        //     crud.update(true, tabela, 1, "Eriks", "Henrique", "eriks@henrique", "05", "94");   
        
        
        //  crud.save(dbAtual, tabela, col1, col2, col3, col4, col5);   
        //     crud.delete(dbAtual, tabela, 1);
        //  System.out.println(crud.getByID(dbAtual, tabela, id) );       
        //crud.getAllTable(dbAtual, tabela);
        // System.out.println("last id:"+crud.lastID(dbAtual, tabela));
    }
}
