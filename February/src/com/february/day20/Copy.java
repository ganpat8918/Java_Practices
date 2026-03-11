package com.february.day20;

public class Copy
{
    public void copyDocument(Object o)
    {
        if (o instanceof Cloneable) 
        {
            System.out.println(" Allow to copy!!!");
        }
        else
        {
            System.err.println(" CopyNotSupportedException....................");
        }
    }
}