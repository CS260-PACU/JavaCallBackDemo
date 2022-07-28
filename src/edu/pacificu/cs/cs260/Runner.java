package edu.pacificu.cs.cs260;

import java.util.Random;

public class Runner extends Thread {
    private Callbacks mTheCallbacks;
    private boolean mStop = false;
    private Random mRandom;

    private String [] mStrings = {"Strain", "Scott", "CS", "Pacific", "Boxers"};

    Runner(Callbacks theCallbacks)
    {
        mRandom = new Random();
        mTheCallbacks = theCallbacks;
    }

    public void run()
    {
        while ( ! mStop )
        {
            try {
                Thread.sleep(mRandom.nextInt(3000)+1);
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
            }

            if (mRandom.nextInt(2) == 0 )
            {
                mTheCallbacks.receiveRandomInt(mRandom.nextInt(1000000));
            }
            else
            {
                mTheCallbacks.receiveRandomString(mStrings[mRandom.nextInt(mStrings.length) ]);
            }
        }
    }

    public void end()
    {
        mStop = true;
    }
}
