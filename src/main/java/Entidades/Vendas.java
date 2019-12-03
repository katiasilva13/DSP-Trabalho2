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

    public Vendas() {
    }

    public Vendas(String nomeProduto, String nomeCliente, String nomeFuncionario, String precoProduto, String codigoProduto) {
        this.nomeProduto = nomeProduto;
        this.nomeCliente = nomeCliente;
        this.nomeFuncionario = nomeFuncionario;
        this.precoProduto = precoProduto;
        this.codigoProduto = codigoProduto;
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

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        String oldNomeProduto = this.nomeProduto;
        this.nomeProduto = nomeProduto;
        changeSupport.firePropertyChange("nomeProduto", oldNomeProduto, nomeProduto);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        String oldNomeCliente = this.nomeCliente;
        this.nomeCliente = nomeCliente;
        changeSupport.firePropertyChange("nomeCliente", oldNomeCliente, nomeCliente);
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionarios) {
        String oldNomeFuncionarios = this.nomeFuncionario;
        this.nomeFuncionario = nomeFuncionarios;
        changeSupport.firePropertyChange("nomeFuncionario", oldNomeFuncionarios, nomeFuncionarios);
    }

    public String getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(String precoProduto) {
        String oldPrecoProduto = this.precoProduto;
        this.precoProduto = precoProduto;
        changeSupport.firePropertyChange("precoProduto", oldPrecoProduto, precoProduto);
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        String oldCodigoProduto = this.codigoProduto;
        this.codigoProduto = codigoProduto;
        changeSupport.firePropertyChange("codigoProduto", oldCodigoProduto, codigoProduto);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
}
