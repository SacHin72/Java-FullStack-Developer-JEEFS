package com.cpg.lab10.exercise3;

class Checker
{
    public static void main(String args[])
    {
        String name="Ramesh";
        String pass="ramYAD";
        Password p1=((username, password) ->{
            if(username.equals(name)&&password.equals(pass))
                return true;
            else
                return false;
        });
        System.out.println(p1.checkIdentity("Ramesh","ramYAD"));
    }
}