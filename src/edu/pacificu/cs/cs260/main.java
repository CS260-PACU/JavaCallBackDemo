package edu.pacificu.cs.cs260;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main implements Callbacks {

    public static void main(String [] args)
    {
        main yourCode = new main();
        Runner mTheSystem = new Runner(yourCode);
        ExecutorService executor = Executors.newSingleThreadExecutor();

        mTheSystem.start();
        yourCode.notACallBack(260);

        try {
            Thread.sleep(30* 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executor.execute( () -> { System.err.println("THREAD");
            });
        mTheSystem.end();
    }

    @Override
    public void receiveRandomString(String data) {
        System.err.println("Receive String " + data);
    }

    @Override
    public void receiveRandomInt(int value) {
        System.err.println("Receive int " + value);
    }

    public void notACallBack(int value)
    {
        System.err.println("notACallBack: Receive int " + value);
    }
}
