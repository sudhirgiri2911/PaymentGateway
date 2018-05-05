package client;

public class PaymentRequest {
	
	private String bank_ifsc_code ;
	private int bank_account_number;
	private float amount;
	private String merchant_transaction_ref;
	private String transaction_date;
	private String payment_gateway_merchant_reference;
	
	static String hash = "asdfasfd012939494dfsdfsd1";
	
	public String getbankifsccode()
	{
		return bank_ifsc_code;
	}
	
	public int getbankaccountnumber()
	{
		return bank_account_number;
	}
	
	public float getamount()
	{
		return amount;
	}
	
	public String getmerchanttransaction()
	{
		return merchant_transaction_ref;
	}

	public String gettransactiondate()
	{
		return transaction_date;
	}
	
	public String getpaymentgateway()
	{
		return payment_gateway_merchant_reference;
	}
	
	public String setbankifsccode(String bank_ifsc_code)
	{
		this.bank_ifsc_code = bank_ifsc_code;
	}
	
	public int setbankaccountnumber(int bank_account_number)
	{
		this.bank_account_number = bank_account_number;
	}
	
	public float setamount(float amount)
	{
		this.amount =  amount;
	}
	
	public String setmerchanttransaction(String merchant_transaction_ref)
	{
		this.merchant_transaction_ref = merchant_transaction_ref;
	}

	public String settransactiondate(String transaction_date)
	{
		this.transaction_date =  transaction_date;
	}
	
	public String setpaymentgateway(String payment_gateway_merchant_reference)
	{
		this.payment_gateway_merchant_reference = payment_gateway_merchant_reference;
	}


}
