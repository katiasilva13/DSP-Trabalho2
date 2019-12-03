/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author ktia-
 */
@Entity
@Table(name = "vendas")
public class Vendas extends Entidades implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nomeProduto")
    private String nomeProduto;

    @Column(name = "nomeCliente")
    private String nomeCliente;

    @Column(name = "nomeFuncionario")
    private String nomeFuncionario;

    @Column(name = "preco")
    private String precoProduto;

    @Column(name = "codigo")
    private String codigoProduto;
    
    @Column(name = "quantidade")
    private String quantidadeProduto;

    public Vendas() {
    }

    public Vendas(String nomeProduto, String nomeCliente, String nomeFuncionario, String precoProduto, String codigoProduto, String quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.nomeCliente = nomeCliente;
        this.nomeFuncionario = nomeFuncionario;
        this.precoProduto = precoProduto;
        this.codigoProduto = codigoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }
  

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        long oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    @Override
    public String getNomeProduto() {
        return nomeProduto;
    }

    @Override
    public void setNomeProduto(String nomeProduto) {
        String oldNomeProduto = this.nomeProduto;
        this.nomeProduto = nomeProduto;
        changeSupport.firePropertyChange("nomeProduto", oldNomeProduto, nomeProduto);
    }

    @Override
    public String getNomeCliente() {
        return nomeCliente;
    }

    @Override
    public void setNomeCliente(String nomeCliente) {
        String oldNomeCliente = this.nomeCliente;
        this.nomeCliente = nomeCliente;
        changeSupport.firePropertyChange("nomeCliente", oldNomeCliente, nomeCliente);
    }

    @Override
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    @Override
    public void setNomeFuncionario(String nomeFuncionarios) {
        String oldNomeFuncionarios = this.nomeFuncionario;
        this.nomeFuncionario = nomeFuncionarios;
        changeSupport.firePropertyChange("nomeFuncionario", oldNomeFuncionarios, nomeFuncionarios);
    }

    @Override
    public String getPrecoProduto() {
        return precoProduto;
    }

    @Override
    public void setPrecoProduto(String precoProduto) {
        String oldPrecoProduto = this.precoProduto;
        this.precoProduto = precoProduto;
        changeSupport.firePropertyChange("precoProduto", oldPrecoProduto, precoProduto);
    }

    @Override
    public String getCodigoProduto() {
        return codigoProduto;
    }

    @Override
    public void setCodigoProduto(String codigoProduto) {
        String oldCodigoProduto = this.codigoProduto;
        this.codigoProduto = codigoProduto;
        changeSupport.firePropertyChange("codigoProduto", oldCodigoProduto, codigoProduto);
    }

    @Override
    public String getQuantidadeProduto() {
        return quantidadeProduto;
    }

    @Override
    public void setQuantidadeProduto(String quantidadeProduto) {
        String oldQuantidadeProduto = this.quantidadeProduto;
        this.quantidadeProduto = quantidadeProduto;
        changeSupport.firePropertyChange("quantidadeProduto", oldQuantidadeProduto, quantidadeProduto);
    }


    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
}
