package edu.pacificu.cs.cs260;

public class main implements Callbacks {

    public static void main(String [] args)
    {
        main yourCode = new main();
        Runner mTheSystem = new Runner(yourCode);

        mTheSystem.start();

        try {
            Thread.sleep(30* 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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
}
