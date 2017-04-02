package com.example;

import java.util.ArrayList;
import java.util.Random;

public class JokeWizard {
    private ArrayList<String> mJokes;

    public JokeWizard() {
        if (mJokes!=null){
            mJokes.clear();
            mJokes.addAll(makeJokes());
        }
        else {
            mJokes = makeJokes();
        }
    }

    private ArrayList<String> makeJokes(){
        ArrayList<String> returnList = new ArrayList<>();
        returnList.add("A plateau is the highest form of flattery.");
        returnList.add("How do you keep an idiot in suspense?");
        returnList.add("'I stand corrected,' said the man in the orthopedic shoes.");
        returnList.add("There's no 'I' in Denial.");
        returnList.add("They all laughed when I said I wanted to be a comedian. Well, they're not laughing now.");
        returnList.add("I didn't know my dad was a construction site thief, but when I got home all the signs were there.");
        return returnList;
    }

    public String getJoke(){
        if (mJokes!=null){
            mJokes.clear();
            mJokes.addAll(makeJokes());
        }
        else {
            mJokes = makeJokes();
        }
        return mJokes.get((new Random()).nextInt(mJokes.size()));
    }
}
