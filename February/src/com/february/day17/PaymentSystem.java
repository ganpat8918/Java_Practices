package com.february.day17;

interface PaymentSystem {
	public static final int DAILYLIMIT = 100000;
    void payment(int amount);
    void stopCheque(int chequeNo);
    void cancelTxn(String txnId);
    void changeLimit(int newLimit);
    
    public static void main(String[] args) {
    	PaymentSystem b1 = new PNB();
        b1.payment(1000004);
        b1.stopCheque(12345);
        b1.cancelTxn("PNB01");
        b1.changeLimit(100009);
        System.out.println("______________________________________");
        PaymentSystem b2 = new HDFC();
        b2.payment(8000);
        b2.stopCheque(22222);
        b2.cancelTxn("HDFC01");
        b2.changeLimit(200000);
        System.out.println("______________________________________");
        PaymentSystem b3 = new SBI();
        b3.payment(3000);
        b3.stopCheque(33333);
        b3.cancelTxn("SBI01");
        b3.changeLimit(15000);
    }
}
class PNB implements PaymentSystem {
    public void payment(int amount) {
    	if(amount<DAILYLIMIT) {
        System.out.println("PNB: Payment of "+amount+" processed");
    	}else {
    		System.out.println("Try with lower amount");
    	}
    }
    public void stopCheque(int chequeNo) {
        System.out.println("PNB: Cheque "+chequeNo+" stopped");
    }
    public void cancelTxn(String txnId) {
        System.out.println("PNB: Transaction "+txnId+" cancelled");
    }
    public void changeLimit(int newLimit) {
    	if(newLimit <=100000) {
        System.out.println("PNB: Limit changed to "+newLimit);
    }else {
    	System.out.println("Limit exceeded, try with lower limit");
    }
  }
}
class HDFC implements PaymentSystem {
    public void payment(int amount) {
    	if(amount<DAILYLIMIT) {
        System.out.println("HDFC: Payment of "+amount+" processed");
    	}else {
    		System.out.println("Try with lower amount");
    	}
    }
    public void stopCheque(int chequeNo) {
        System.out.println("HDFC: Cheque " +chequeNo +" stopped");
    }  
    public void cancelTxn(String txnId) {
        System.out.println("HDFC: Transaction " +txnId +" cancelled");
    } 
    public void changeLimit(int newLimit) {
    	if(newLimit <=100000) {
        System.out.println("SBI: Limit changed to "+newLimit);
    }else {
    	System.out.println("Limit exceeded, try with lower limit");
    }
  }
}
class SBI implements PaymentSystem {
    public void payment(int amount) {
    	if(amount<DAILYLIMIT) {
        System.out.println("SBI: Payment of " +amount +" processed");
    	}else {
    		System.out.println("Try with lower amount");
    	}
    }
    public void stopCheque(int chequeNo) {
        System.out.println("SBI: Cheque " +chequeNo +" stopped");
    }
    public void cancelTxn(String txnId) {
        System.out.println("SBI: Transaction "+txnId +" cancelled");
    }
    public void changeLimit(int newLimit) {
    	if(newLimit <=100000) {
        System.out.println("SBI: Limit changed to "+newLimit);
    }else {
    	System.out.println("Limit exceeded, try with lower limit");
    }
   }
}




