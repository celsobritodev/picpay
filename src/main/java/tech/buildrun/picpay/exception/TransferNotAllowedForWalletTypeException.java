package tech.buildrun.picpay.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class TransferNotAllowedForWalletTypeException extends PicPayException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public ProblemDetail toProblemDetail() {
		
		var problemDetail = ProblemDetail.forStatus(HttpStatus.UNPROCESSABLE_ENTITY);
		
		problemDetail.setTitle("Transfer not allowed for wallet type.");
	  
		return problemDetail;

	}

}
