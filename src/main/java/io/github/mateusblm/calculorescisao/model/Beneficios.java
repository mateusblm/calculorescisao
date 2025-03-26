package io.github.mateusblm.calculorescisao.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Beneficios {
    private BigDecimal valorFeriasProporcionais;
    private BigDecimal valorFeriasVencidas;
    private BigDecimal valor13Proporcional;
    private BigDecimal multaFGTS;
    private BigDecimal outrosBeneficios;

}
