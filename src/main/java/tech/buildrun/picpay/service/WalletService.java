package tech.buildrun.picpay.service;

import org.springframework.stereotype.Service;

import tech.buildrun.picpay.controller.dto.CreateWalletDto;
import tech.buildrun.picpay.entity.Wallet;
import tech.buildrun.picpay.exception.WalletDataAlreadyExistsException;
import tech.buildrun.picpay.repository.WalletRepository;

@Service
public class WalletService {
	
	private final WalletRepository walletRepository;
	
	public WalletService(WalletRepository walletRepository) {
		this.walletRepository = walletRepository;
	}
	

	public Wallet createWallet(CreateWalletDto Walletdto) {
		
		var walletDb = walletRepository.findByCpfCnpjOrEmail(Walletdto.cpfCnpj(), Walletdto.email());
		
		if (walletDb.isPresent()) {
			throw new WalletDataAlreadyExistsException("Wallet with given CPF/CNPJ or Email already exists");
		}
		
		return walletRepository.save(Walletdto.DtoToWallet());
		
	}

}