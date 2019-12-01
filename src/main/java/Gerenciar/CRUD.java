/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gerenciar;

import DAO.*;
import Entidades.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ktia-
 */
public class CRUD {

    public void save(boolean dbAtual, String tabela, String col1, String col2,
            String col3, String col4, String col5) {

        if (!dbAtual) {
            DAOmysql daoMsql = new DAOmysql();
            switch (tabela) {
                //Cliente(nome, ultimoNome, email, cel, cpf);
                case "Clientes":
                    Clientes c = new Clientes(col1, col2, col3, col4, col5);
                    daoMsql.Save(c);
                    break;
                //Funcionario(nome, ultimoNome, email, cel);    
                case "Funcionarios":
                    Funcionarios f = new Funcionarios(col1, col2, col3, col4);
                    daoMsql.Save(f);
                    break;
                //Produto(nome, fornecedor, preco, codigo);
                case "Produtos":
                    Produtos p = new Produtos(col1, col2, col3, col4);
                    daoMsql.Save(p);
                    break;
                //Vendas(Produto.nome, Cliente.nome, Funcionário.nome, Produto.preco, Produto.codigo);    
                case "Vendas":
                    Vendas v = new Vendas(col1, col2, col3, col4, col5);
                    daoMsql.Save(v);
                    break;
                default:
                    System.out.println("Erro");
            }
        } else {
            DAOpostgres daoPsql = new DAOpostgres();
            switch (tabela) {
                //Cliente(nome, ultimoNome, email, cel, cpf);
                case "Clientes":
                    Clientes c = new Clientes(col1, col2, col3, col4, col5);
                    daoPsql.Save(c);
                    break;
                //Funcionario(nome, ultimoNome, email, cel); 
                case "Funcionarios":
                    Funcionarios f = new Funcionarios(col1, col2, col3, col4);
                    daoPsql.Save(f);
                    break;
                //Produto(nome, fornecedor, preco, codigo);
                case "Produtos":
                    Produtos p = new Produtos(col1, col2, col3, col4);
                    daoPsql.Save(p);
                    break;
                //Vendas(Produto.nome, Cliente.nome, Funcionário.nome, Produto.preco, Produto.codigo);  
                case "Vendas":
                    Vendas v = new Vendas(col1, col2, col3, col4, col5);
                    daoPsql.Save(v);
                    break;
                default:
                    System.out.println("Erro!");
            }
        }

    }

    public static void getByID(boolean dbAtual, String tabela, long id) {
        if (!dbAtual) {
            DAOmysql daoMsql = new DAOmysql();
            switch (tabela) {
                case "Clientes":
                    Clientes c;
                    c = (Clientes) daoMsql.getByID(tabela, id);
                    System.out.println("\nCliente: \nNome:" + c.getNome()
                            + "\nSobrenome:" + c.getUltimoNome()
                            + "\nEmail:" + c.getEmail()
                            + "\nCelular:" + c.getCel()
                            + "\nCPF:" + c.getCpf());
                    break;
                case "Funcionarios":
                    Funcionarios f;
                    f = (Funcionarios) daoMsql.getByID(tabela, id);
                    System.out.println("\nFuncionario: \nNome:" + f.getNome()
                            + "\nSobrenome:" + f.getUltimoNome()
                            + "\nEmail:" + f.getEmail()
                            + "\nCelular:" + f.getCel());
                    break;
                case "Produtos":
                    Produtos p;
                    p = (Produtos) daoMsql.getByID(tabela, id);
                    System.out.println("\nProduto: \nNome:" + p.getNome()
                            + "\nSobrenome:" + p.getFornecedor()
                            + "\nEmail:" + p.getPreco()
                            + "\nCelular:" + p.getCodigo());
                    break;
                case "Vendas":
                    Vendas v;
                    v = (Vendas) daoMsql.getByID(tabela, id);
                    System.out.println("\nVenda: \nNome cliente:" + v.getNomeCliente()
                            + "\nNome funcionario:" + v.getNomeFuncionario()
                            + "\nNome produto:" + v.getNomeProduto()
                            + "\nPreco produto:" + v.getPrecoProduto()
                            + "\nCodigo produto:" + v.getCodigoProduto());
                    break;
                default:
                    System.out.println("Erro");
                    break;
            }
        } else {
            DAOpostgres daoPsql = new DAOpostgres();
            switch (tabela) {
                case "Clientes":
                    Clientes c;
                    c = (Clientes) daoPsql.getByID(tabela, id);
                    System.out.println("\nCliente: \nNome:" + c.getNome()
                            + "\nSobrenome:" + c.getUltimoNome()
                            + "\nEmail:" + c.getEmail()
                            + "\nCelular:" + c.getCel()
                            + "\nCPF:" + c.getCpf());
                    break;
                case "Funcionarios":
                    Funcionarios f;
                    f = (Funcionarios) daoPsql.getByID(tabela, id);
                    System.out.println("\nFuncionario: \nNome:" + f.getNome()
                            + "\nSobrenome:" + f.getUltimoNome()
                            + "\nEmail:" + f.getEmail()
                            + "\nCelular:" + f.getCel());
                    break;
                case "Produtos":
                    Produtos p;
                    p = (Produtos) daoPsql.getByID(tabela, id);
                    System.out.println("\nProduto: \nNome:" + p.getNome()
                            + "\nSobrenome:" + p.getFornecedor()
                            + "\nEmail:" + p.getPreco()
                            + "\nCelular:" + p.getCodigo());
                    break;
                case "Vendas":
                    Vendas v;
                    v = (Vendas) daoPsql.getByID(tabela, id);
                    System.out.println("\nVenda: \nNome cliente:" + v.getNomeCliente()
                            + "\nNome funcionario:" + v.getNomeFuncionario()
                            + "\nNome produto:" + v.getNomeProduto()
                            + "\nPreco produto:" + v.getPrecoProduto()
                            + "\nCodigo produto:" + v.getCodigoProduto());
                    break;
                default:
                    System.out.println("Erro");
                    break;
            }
        }

    }

    public static void getAllTable(boolean dbAtual, String tabela) {
        if (!dbAtual) {
            DAOmysql daoMsql = new DAOmysql();
            switch (tabela) {
                case "Clientes":
                    List<Entidades> listaC = daoMsql.getLista(tabela);
                    for (int i = 0; i < listaC.size(); i++) {
                        System.out.println("Lista  id: " + listaC.get(i).getId() + "\nNome: " + listaC.get(i).getNome()
                                + "\nSobrenome: " + listaC.get(i).getUltimoNome()
                                + "\nEmail:" + listaC.get(i).getEmail()
                                + "\nCelular:" + listaC.get(i).getCel()
                                + "\nCPF:" + listaC.get(i).getCpf());
                    }
                    break;
                case "Funcionarios":
                    List<Entidades> listaF = daoMsql.getLista(tabela);
                    for (int i = 0; i < listaF.size(); i++) {
                        System.out.println("Lista  id: " + listaF.get(i).getId() + "\nNome: " + listaF.get(i).getNome()
                                + "\nSobrenome: " + listaF.get(i).getUltimoNome()
                                + "\nEmail:" + listaF.get(i).getEmail()
                                + "\nCelular:" + listaF.get(i).getCel());
                    }
                    break;
                case "Produtos":
                    List<Entidades> listaP = daoMsql.getLista(tabela);
                    for (int i = 0; i < listaP.size(); i++) {
                        System.out.println("Lista  id: " + listaP.get(i).getId() + "\nNome: " + listaP.get(i).getNome()
                                + "\nFornecedor: " + listaP.get(i).getFornecedor()
                                + "\nPreco produto:" + listaP.get(i).getPreco()
                                + "\nCodigo produto:" + listaP.get(i).getCodigo());
                    }
                    break;
                case "Vendas":
                    List<Entidades> listaV = daoMsql.getLista(tabela);
                    for (int i = 0; i < listaV.size(); i++) {
                        System.out.println("Lista  id: " + listaV.get(i).getId() + "\nNome cliente: " + listaV.get(i).getNomeCliente()
                                + "\nNome funcionario: " + listaV.get(i).getNomeFuncionario()
                                + "\nNome produto:" + listaV.get(i).getNomeProduto()
                                + "\nPreco produto:" + listaV.get(i).getPrecoProduto()
                                + "\nCodigo produto:" + listaV.get(i).getCodigoProduto());
                    }
                    break;
            }
        } else {
            DAOpostgres daoPsql = new DAOpostgres();
            switch (tabela) {
                case "Clientes":
                    List<Entidades> listaC = daoPsql.getLista(tabela);
                    for (int i = 0; i < listaC.size(); i++) {
                        System.out.println("Lista  id: " + listaC.get(i).getId() + "\nNome: " + listaC.get(i).getNome()
                                + "\nSobrenome: " + listaC.get(i).getUltimoNome()
                                + "\nEmail:" + listaC.get(i).getEmail()
                                + "\nCelular:" + listaC.get(i).getCel()
                                + "\nCPF:" + listaC.get(i).getCpf());
                    }
                    break;
                case "Funcionarios":
                    List<Entidades> listaF = daoPsql.getLista(tabela);
                    for (int i = 0; i < listaF.size(); i++) {
                        System.out.println("Lista  id: " + listaF.get(i).getId() + "\nNome: " + listaF.get(i).getNome()
                                + "\nSobrenome: " + listaF.get(i).getUltimoNome()
                                + "\nEmail:" + listaF.get(i).getEmail()
                                + "\nCelular:" + listaF.get(i).getCel());
                    }
                    break;
                case "Produtos":
                    List<Entidades> listaP = daoPsql.getLista(tabela);
                    for (int i = 0; i < listaP.size(); i++) {
                        System.out.println("Lista  id: " + listaP.get(i).getId() + "\nNome: " + listaP.get(i).getNome()
                                + "\nFornecedor: " + listaP.get(i).getFornecedor()
                                + "\nPreco produto:" + listaP.get(i).getPreco()
                                + "\nCodigo produto:" + listaP.get(i).getCodigo());
                    }
                    break;
                case "Vendas":
                    List<Entidades> listaV = daoPsql.getLista(tabela);
                    for (int i = 0; i < listaV.size(); i++) {
                        System.out.println("Lista  id: " + listaV.get(i).getId() + "\nNome cliente: " + listaV.get(i).getNomeCliente()
                                + "\nNome funcionario: " + listaV.get(i).getNomeFuncionario()
                                + "\nNome produto:" + listaV.get(i).getNomeProduto()
                                + "\nPreco produto:" + listaV.get(i).getPrecoProduto()
                                + "\nCodigo produto:" + listaV.get(i).getCodigoProduto());
                    }
                    break;
            }
        }

    }

}
