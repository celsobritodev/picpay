package tech.buildrun.picpay.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;

public class InsuffientBalanceException extends PicPayException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public ProblemDetail toProblemDetail() {
		
		var problemDetail = ProblemDetail.forStatus(HttpStatus.UNPROCESSABLE_ENTITY);
		
		problemDetail.setTitle("Insufficient balance.");
		problemDetail.setDetail("You cannot transfer a value bigger than your current balance.");
		
		return problemDetail;

	}

}
