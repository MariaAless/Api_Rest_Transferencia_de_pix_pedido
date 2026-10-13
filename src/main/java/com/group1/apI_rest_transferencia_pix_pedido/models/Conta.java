package com.group1.apI_rest_transferencia_pix_pedido.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "conta")
@Getter
@Setter
@NoArgsConstructor
public class Conta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 100)
    private String titular;

    @Column(nullable = false, precision = 12, scale = 2)
    private BigDecimal saldo;

    @Column(name = "chave_pix", nullable = false, unique = true, length = 100)
    private String chavePix;

    @Column(name="status_ativa", nullable = false)
    private boolean statusAtiva= true;

    public Conta(String titular, BigDecimal saldo, String chavePix, boolean statusAtiva){
        this.titular = titular;
        this.saldo = saldo;
        this.chavePix = chavePix;
        this.statusAtiva = statusAtiva;
    }




}
