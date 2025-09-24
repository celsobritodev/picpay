package tech.buildrun.picpay.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import tech.buildrun.picpay.controller.dto.TransferDto;
import tech.buildrun.picpay.entity.Transfer;
import tech.buildrun.picpay.service.TransferService;

@RestController
public class TransferController {
	
	private final TransferService transferService;

	public TransferController(TransferService transferService) {
	
		this.transferService = transferService;
	}
	
	
	@PostMapping("/transfer")
	public ResponseEntity<Transfer> transfer(@RequestBody @Valid TransferDto transferDto) {
		
		var resp = transferService.transfer(transferDto);
		
		return ResponseEntity.ok(resp);
	}
	
	

}
