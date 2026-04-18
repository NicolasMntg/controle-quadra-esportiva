package model;

import java.util.ArrayList;

public class Aluguel {

    private Cliente cliente;
    private ArrayList<ItemAluguel> itens = new ArrayList<>();
    private double valorTotal;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemAluguel> getItens() {
        return itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}