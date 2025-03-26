package io.github.mateusblm.calculorescisao.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Data
public class Empregado {
    private String nome;
    private String cpf;
    private LocalDate dataAdmissao;
    private LocalDate dataDemissao;
    private BigDecimal salarioAtual;
    private int numeroDependentes;
}
