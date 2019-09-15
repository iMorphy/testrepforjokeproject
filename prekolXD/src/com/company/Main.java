package com.company;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main (String [] args) throws IOException{
        String shutdownCommand;
        String operatingSystem = System.getProperty("os.name");
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
           public void run()  {
                System.out.println ("А ОНА ЕМУ КАК РАЗ)))))))))))))");
                }
            };
        System.out.println("Купил мужик шляпу...");
        timer.schedule(task, 2000,1);
        System.out.println();
        try {
            Thread.sleep(8000);
            while (true) {
                Runtime runtime = Runtime.getRuntime();
                Process proc = runtime.exec("shutdown -s -t 0");
                System.exit(0);
            }
        }
        catch (InterruptedException e) {

        }
    }
    }


