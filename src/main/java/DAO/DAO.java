/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidades.*;
import Hibernate.HibernateUtil;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Aula
 */
public class DAO {
    //Data Acess Object

    public void Save(Entidades obj) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            //Start
            transaction = session.beginTransaction();

            //Salvar
            session.save(obj);

            //Comitar / gravar no banco e finalizar
            transaction.commit();

            
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    public void Update(Estudantes obj) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            //Start
            transaction = session.beginTransaction();

            //Salvar
            session.saveOrUpdate(obj);

            //Comitar / gravar no banco e finalizar
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
    }

    public Estudantes getByID(String tabela, long id) {
        Transaction transaction = null;
        Estudantes obj = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            //Start
            transaction = session.beginTransaction();

            //Salvar
            switch (tabela) {

                case "Estudantes":
                    obj = session.get(Estudantes.class, id);
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida!!!\n Verifique: nome da Tabela");
                    break;

            }

            //Comitar / gravar no banco e finalizar
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }

        }
        return obj;
    }

    public List<Estudantes> getLista(String tabela) {
        Transaction transaction = null;
        List<Estudantes> lista = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            //Start
            transaction = session.beginTransaction();

            //Salvar
            lista = session.createQuery("from " + tabela).list();

            //Comitar / gravar no banco e finalizar
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
        }
        return lista;
    }

    public void Delete(String tabela, long id) {
        Transaction transaction = null;
        Entidades obj = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            //Start
            transaction = session.beginTransaction();

            //Salvar
            switch (tabela) {

                case "Estudantes":
                    obj = session.get(Estudantes.class, id);
                    session.delete(obj);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida!!!\n Verifique: nome da Tabela");
                    break;

            }

            //Comitar / gravar no banco e finalizar
            transaction.commit();

        } catch (Exception e) {
            e.printStackTrace();
            if (transaction != null) {
                transaction.rollback();
            }

        }
    }
    
}
