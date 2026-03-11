package com.february.day17;

interface Payment1 
{
    
	public static final int LIMIT = 100;
    public abstract void pay(); 
    public abstract void stopPayment();
    void checkLimit();
}

class Bank implements Payment1
{
    @Override
    public void pay()
    {   
        System.out.println(" implementation.....");
    }

    @Override
    public void stopPayment()
    {
        
    }
    public void checkLimit() {
    	
    }
}
