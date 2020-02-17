package com.cpg.lab8.exercise1;

import java.io.*;

public class CopyDataThread extends Thread {
    private String srcpath,despath;
    CopyDataThread(String srcpath,String despath )
    {
        this.srcpath=srcpath;
        this.despath=despath;
    }

    public void run() {
        InputStream in = null;
        OutputStream out = null;
        try {
            File inputFile = new File(srcpath);
            File outputFile = new File(despath);
            in = new FileInputStream(inputFile);
            out = new FileOutputStream(outputFile);
            int read;
            int size = 0;
            while ((read = in.read()) > 0) {
                size++;
                char ch = (char) read;
                if (size == 10) {
                    System.out.println("10 characters are copied");
                    Thread.sleep(5000);
                    size = 0;
                }
                out.write(ch);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException s) {
                s.printStackTrace();
                s.printStackTrace();
            }
        }
    }
}

