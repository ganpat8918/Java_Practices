package com.february.day13;

class Bank {
	public static void main(String[] args) {

        InstanceProvider provider = new InstanceProvider();
        Object obj = provider.getObject();
        
        Bank bank = (Bank) obj;
        bank.commonService();
        
        SBI sbi = (SBI) bank;
        sbi.sbiService();
    }
    public void commonService() {
        System.out.println("Bank: common service");
    }
}

class SBI extends Bank {
    public void sbiService() {
        System.out.println("SBI: specific service");
    }
}

class InstanceProvider {
    public Object getObject() {
  
        Object obj = new SBI();
        return obj;
    }
}

