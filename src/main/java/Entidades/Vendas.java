/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ktia-
 */
@Entity
@Table(name = "vendas")
public class Vendas extends Entidades implements Serializable {

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
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionarios) {
        this.nomeFuncionario = nomeFuncionarios;
    }

    public String getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(String precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
}
