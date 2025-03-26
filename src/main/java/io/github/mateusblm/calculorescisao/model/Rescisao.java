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


}
