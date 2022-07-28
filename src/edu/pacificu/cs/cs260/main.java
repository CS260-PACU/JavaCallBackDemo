package edu.pacificu.cs.cs260;

public class main implements Callbacks {

    public static void main(String [] args)
    {

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
