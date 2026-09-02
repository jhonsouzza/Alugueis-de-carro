package model;

public class Aluguel {
    private int id;
    private int idcliente;
    private int idcarro;
    private String dataInicio;
    private String dataDevolucao;
    private String statusPagamento;
    private String statusAluguel;
    private double valorTotal;
    private String status;

    public int getId(){
        return id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public int getIdcliente(){
        return idcliente;
    }
    public void setidcliente(int idcliente) {
        this.idcliente = idcliente;
    }
    public int getIdcarro(){
        return idcarro;
    }
    public void setIdcarro(int idcarro) {
        this.idcarro = idcarro;
    }
    public String getDataInicio(){
        return dataInicio;
    }
    public void setDataInicio(String dataInicio){
        this.dataInicio = dataInicio;
    }
    public String getDataDevolucao(){
        return dataDevolucao;
    }
    public void setDataDevolucao(String dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
    public String getStatusPagamento(){
        return statusPagamento;
    }
    public void setstatusPagamento(String statusPagamento){
        this.statusPagamento = statusPagamento;
    }
    public String getstatusAluguel(){
        return statusAluguel;
    }
    public void setStatusPagamento(String statusAluguel){
        this.statusAluguel = statusAluguel;
    }
    public double getValorTotal(){
        return valorTotal;
    }
    public void setValorTotal(double valorTotal){
        this.valorTotal = valorTotal;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }

    public Aluguel (int id,int idcliente,int idcarro,String dataInicio,String dataDevolucao,double valorTotal,String status ){

    this.id = id;
    this.idcliente = idcliente;
    this.idcarro = idcarro;
    this.dataInicio = dataInicio;
    this.dataDevolucao = dataDevolucao;
    this.valorTotal = valorTotal;
    this.status = status;

    }

    @Override
    public String toString() {
        return "Aluguel{" +
                "id=" + id +
                ", idcliente=" + idcliente +
                ", idcarro=" + idcarro +
                ", dataInicio='" + dataInicio + '\'' +
                ", dataDevolucao='" + dataDevolucao + '\'' +
                ", statusPagamento='" + statusPagamento + '\'' +
                ", statusAluguel='" + statusAluguel + '\'' +
                ", valorTotal=" + valorTotal +
                ", status='" + status + '\'' +
                '}';

    }

}

