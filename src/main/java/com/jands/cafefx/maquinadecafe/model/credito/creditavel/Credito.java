package com.jands.cafefx.maquinadecafe.model.credito.creditavel;

import com.jands.cafefx.maquinadecafe.model.credito.modelocredito.CreditoInvalidoException;

public class Credito implements ICreditavel {

    @Override
    public boolean isValid(double valor) {
        if (valor < 0) {
            throw new CreditoInvalidoException("Valor não é Valido");
        }
        return true;
    }

}