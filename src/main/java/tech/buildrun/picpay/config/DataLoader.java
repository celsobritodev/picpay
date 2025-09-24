package tech.buildrun.picpay.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import tech.buildrun.picpay.entity.WalletType;
import tech.buildrun.picpay.repository.WalletTypeRepository;

import java.util.Arrays;

@Configuration
public class DataLoader implements CommandLineRunner {

    private final WalletTypeRepository walletTypeRepository;

    
    // injetando o WalletTypeRepository
    public DataLoader(WalletTypeRepository walletTypeRepository) {
        this.walletTypeRepository = walletTypeRepository;
    }
    
    
 // neste trecho de codigo é inserido os 
 //   walletType 1 - user e 2 - merchant se os mesmos não existirem no banco de dados   

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(WalletType.Enum.values())
                .forEach(walletType -> walletTypeRepository.save(walletType.get()));
    }
    
    
    
    
    // É o mesmo codigo acima, mas com mais detalhes e mensagens no console
	/*
	 * public void run(String... args) throws Exception {
	 * System.out.println("Verificando tipos de carteira...");
	 * 
	 * for (WalletType.Enum walletTypeEnum : WalletType.Enum.values()) { WalletType
	 * walletType = walletTypeEnum.get(); Long typeId = walletType.getId(); String
	 * typeDescription = walletType.getDescription();
	 * 
	 * // Verifica explicitamente se já existe boolean alreadyExists =
	 * walletTypeRepository.existsById(typeId);
	 * 
	 * if (!alreadyExists ) { walletTypeRepository.save(walletType);
	 * System.out.println("✅ " + typeDescription + " (ID: " + typeId +
	 * ") inserido com sucesso"); } }
	 * 
	 * System.out.println("Configuração de tipos de carteira concluída"); }
	 */
    
    
    
    
    
}