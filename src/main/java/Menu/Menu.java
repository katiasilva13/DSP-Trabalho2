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
    
    public static void main(String[] args){
    
      delete("Estudantes", 1);
      
    }
    
    
    private static void save(String nome){
    
        DAO dao = new DAO();
     
       // Colegios e = new Colegios("Colegio0001");
        Estudantes e = new Estudantes(nome);
       
        dao.Save(e);
        
    }
    
    private static void update(){
    
         DAO dao = new DAO();
     
        Estudantes e = null;
     
        e =  dao.getByID("Estudantes",1);
        
        e.setNome("5_Nome");
        
        dao.Update(e);
        
    
    }
        
    private static void getByID() {
     
        DAO dao = new DAO();
  
        Estudantes e = null;

        e =  dao.getByID("Estudantes", 1);
    
        System.out.println("Estudante: "+e.getNome());
    
    }
    
    private static void getAllTable(String tabela){
        
        DAO dao = new DAO();
     
        List<Estudantes> lista =  dao.getLista(tabela);
        
        for(int i =0; i < lista.size(); i++){
        
        System.out.println("Lista  id: "+lista.get(i).getId()+" Nome: "+lista.get(i).getNome());
        }
                
        
    
    }
        
    private static void delete(String tabela, int id){
    
        DAO dao = new DAO();
  
        dao.Delete(tabela, id);
        
        getAllTable(tabela);
    
    } 
    
}
