package io.github.mateusblm.calculorescisao.service;

import io.github.mateusblm.calculorescisao.model.Beneficios;
import io.github.mateusblm.calculorescisao.model.Empregado;
import io.github.mateusblm.calculorescisao.model.Rescisao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CalculoRescisaoService {

    public Rescisao calcularRescisao(Empregado empregado) {
        Rescisao rescisao = new Rescisao();
        rescisao.setEmpregado(empregado);
        rescisao.setDataRescisao(LocalDate.now());
        Beneficios beneficios = new Beneficios();

        BigDecimal salarioMensal = empregado.getSalarioAtual();
        return rescisao;
    }
}
