/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import DAO.*;
import Entidades.*;
import java.util.List;

/**
 *
 * @author Aula
 */
public class Menu {

    public static void main(String[] args) {

        //  save("Estudantes","Marina");
        //    save("Estudantes","Lula");
        //    delete("Estudantes", 1);
        //    update("Estudantes", 2, "João");
        //    getAllTable("Estudantes");
        //   savePostgres("Estudantes","Eriks");
        //   List<Entidades> temp = new ArrayList<Entidades>();
        
    }

    private void save(String tabela, String col1, String col2, String col3, String col4, String col5) {
        DAOpostgres daoPsql = new DAOpostgres();
        //   DAOmysql daoMsql = new DAOmysql();

        switch (tabela) {
            case "Clientes":
                Clientes c = new Clientes(col1, "", "", "", "");
                daoPsql.Save(c);
                break;
            case "Funcionarios":
                Funcionarios f = new Funcionarios(col1, "", "", "", "");
                daoPsql.Save(f);
                break;
            case "Produtos":
                Produtos p = new Produtos(col1, "", "", "");
                daoPsql.Save(p);
                break;
            case "Vendas":
                Vendas v = new Vendas(col1, "", "", "", "");
                daoPsql.Save(v);
                break;
            default:

        }

    }

    private static void banco(String tabela, String col1, String col2, String col3, String col4, String col5) {
        DAOmysql dao = new DAOmysql();
        Estudantes e = new Estudantes(col1);
        dao.Save(e);
    }

    private static void update(String tabela, long id, String nome) {
        DAOmysql dao = new DAOmysql();
        Entidades e = null;
        e = dao.getByID(tabela, id);
        e.setNome(nome);
        dao.Update(e);
    }

    private static void getByID(String tabela, long id) {
        DAOmysql dao = new DAOmysql();
        Entidades e = null;
        e = dao.getByID(tabela, id);
        System.out.println("Estudante: " + e.getNome());
    }

    private static void getAllTable(String tabela) {
        DAOmysql dao = new DAOmysql();
        List<Entidades> lista = dao.getLista(tabela);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Lista  id: " + lista.get(i).getId() + " Nome: " + lista.get(i).getNome());
        }

    }

    private static void delete(String tabela, long id) {
        DAOmysql mysqlCon = new DAOmysql();
        mysqlCon.Delete(tabela, id);
        getAllTable(tabela);

    }

}
