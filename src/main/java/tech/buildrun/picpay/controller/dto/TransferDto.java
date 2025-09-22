package tech.buildrun.picpay.controller.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;

public record TransferDto(@DecimalMin("0.01") @NotNull BigDecimal value,
		                  @NotNull Long payer, // wallet do pagador
		                  @NotNull Long payee) { // wallet do recebedor

}
