/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import DAO.DAOmysql;
import DAO.DAOpostgres;
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

    }

    private static void save(String tabela, String nome) {
        DAOpostgres dao = new DAOpostgres();
     //   DAOmysql dao = new DAOmysql();
   //  List<Entidades> temp = new ArrayList<Entidades>();
        switch (tabela) {
                case "Clientes":
                    Clientes c = new Clientes(nome,"","","","");
                    dao.Save(c);
                    break;
                case "Funcionarios":
                    Funcionarios f = new Funcionarios(nome,"","","","");
                    dao.Save(f);
                    break;
                case "Produtos":
                    Produtos p = new Produtos(nome,"","");
                    dao.Save(p);
                    break;
//                case "Vendas":
//                    Vendas v = new Vendas(nome,"","","","");
//                    dao.Save(v);
//                    break;
                default:
                    
        }
        
    }
    private static void savePostgres(String tabela, String nome) {
        DAOmysql dao = new DAOmysql();
        Estudantes e = new Estudantes(nome);
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
        DAOmysql dao = new DAOmysql();
        dao.Delete(tabela, id);
        getAllTable(tabela);

    }

}
