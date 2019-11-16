/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import DAO.DAO;
import Entidades.*;
import java.util.List;

/**
 *
 * @author Aula
 */
public class Menu {

    public static void main(String[] args) {

        //  save("Estudantes");
        //  save("fufin");
        // delete("Estudantes", 1);
        update("Estudantes", 2, "João");
        getAllTable("Estudantes");

    }

    private static void save(String nome) {
        DAO dao = new DAO();
        // Colegios e = new Colegios("Colegio0001");
        Estudantes e = new Estudantes(nome);
        dao.Save(e);

    }

    private static void update(String tabela, long id, String nome) {
        DAO dao = new DAO();
        Estudantes e = null;
        e = dao.getByID(tabela, id);
        e.setNome(nome);
        dao.Update(e);
    }

    private static void getByID(String tabela, long id) {
        DAO dao = new DAO();
        Estudantes e = null;
        e = dao.getByID(tabela, id);
        System.out.println("Estudante: " + e.getNome());
    }

    private static void getAllTable(String tabela) {
        DAO dao = new DAO();
        List<Estudantes> lista = dao.getLista(tabela);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Lista  id: " + lista.get(i).getId() + " Nome: " + lista.get(i).getNome());
        }

    }

    private static void delete(String tabela, long id) {
        DAO dao = new DAO();
        dao.Delete(tabela, id);
        getAllTable(tabela);

    }

}
