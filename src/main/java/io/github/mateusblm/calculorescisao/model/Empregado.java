package io.github.mateusblm.calculorescisao.model;

import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Data
public class Empregado {

    @Id
    private String cpf;

    private String nome;
    private LocalDate dataAdmissao;
    private LocalDate dataDemissao;
    private BigDecimal salarioAtual;
    private int numeroDependentes;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public LocalDate getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(LocalDate dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    public BigDecimal getSalarioAtual() {
        return salarioAtual;
    }

    public void setSalarioAtual(BigDecimal salarioAtual) {
        this.salarioAtual = salarioAtual;
    }

    public int getNumeroDependentes() {
        return numeroDependentes;
    }

    public void setNumeroDependentes(int numeroDependentes) {
        this.numeroDependentes = numeroDependentes;
    }
}
