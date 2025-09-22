package tech.buildrun.picpay.controller.dto;

import tech.buildrun.picpay.entity.Wallet;
import tech.buildrun.picpay.entity.WalletType;

public record CreateWalletDto(String fullName,
		                      String cpfCnpj,
		                      String email,
		                      String password,
		                      WalletType.Enum walletType) {
	
	
	public Wallet DtoToWallet() {
		return new Wallet(
				fullName,
				cpfCnpj,
				email,
				password,
				walletType.get());
	}

}
