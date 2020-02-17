package com.cpg.lab8.exercise1;

public class FileProgram {
    public static void main(String args[])
    {
        String inputpath = "D:\\capg training module\\Source.txt";
        String outputpath = "D:\\capg training module\\Target.txt";
        CopyDataThread c=new CopyDataThread( inputpath,outputpath);
        c.start();

    }
}