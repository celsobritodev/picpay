package tech.buildrun.picpay.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import tech.buildrun.picpay.controller.dto.CreateWalletDto;
import tech.buildrun.picpay.entity.Wallet;
import tech.buildrun.picpay.service.WalletService;



@RestController
public class WalletController {
	
	private final WalletService walletService;
	
	private WalletController(WalletService walletService) {
		this.walletService = walletService;
	}
	
	
	@PostMapping("/wallets")
	public ResponseEntity<Wallet> createWallet(@RequestBody @Valid CreateWalletDto walletDto) {
		
		var wallet = walletService.createWallet(walletDto);
		
		return ResponseEntity.ok(wallet);
	}
	
	

}
