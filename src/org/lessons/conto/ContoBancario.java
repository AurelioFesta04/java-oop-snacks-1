package org.lessons.conto;

import java.math.BigDecimal;
import java.util.Random;

public class ContoBancario {

    private int numeroConto = new Random().nextInt(9999999);
    private BigDecimal saldo;
    private BigDecimal importo;

    public ContoBancario(int numeroConto, BigDecimal saldo, BigDecimal importo) {
        this.numeroConto = numeroConto;
        this.saldo = saldo = new BigDecimal(0);
        this.importo = importo;
    }

    public int getNumeroConto() {
        return numeroConto;
    }

    public void setImporto(BigDecimal importo) {
        this.importo = importo;
    }

    public void setDeposito() {
        saldo = saldo.add(importo);
    }

    public void setPrelievo() {
        saldo = saldo.subtract(importo);
    }

    public BigDecimal getSaldo() {
        return saldo;
    }
}
