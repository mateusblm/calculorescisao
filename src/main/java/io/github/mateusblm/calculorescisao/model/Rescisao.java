package io.github.mateusblm.calculorescisao.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;


@Data
public class Rescisao {
    private Empregado empregado;
    private LocalDate dataRescisao;
    private boolean possuiHorasVencidas;
    private boolean avisoPrevioCumprido;
    private BigDecimal valorRescisao;

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

    public LocalDate getDataRescisao() {
        return dataRescisao;
    }

    public void setDataRescisao(LocalDate dataRescisao) {
        this.dataRescisao = dataRescisao;
    }

    public boolean isPossuiHorasVencidas() {
        return possuiHorasVencidas;
    }

    public void setPossuiHorasVencidas(boolean possuiHorasVencidas) {
        this.possuiHorasVencidas = possuiHorasVencidas;
    }

    public boolean isAvisoPrevioCumprido() {
        return avisoPrevioCumprido;
    }

    public void setAvisoPrevioCumprido(boolean avisoPrevioCumprido) {
        this.avisoPrevioCumprido = avisoPrevioCumprido;
    }

    public BigDecimal getValorRescisao() {
        return valorRescisao;
    }

    public void setValorRescisao(BigDecimal valorRescisao) {
        this.valorRescisao = valorRescisao;
    }
}
