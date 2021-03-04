package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givesExceptionifEnteredNull() {
        MoodAnalyser mood = new MoodAnalyser(null);
        try {
            mood.analyseMood();
        }
        catch(MoodAnalyserException e){
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL,e.type);
        }
    }

    @Test
    public void givesExceptionifEnteredEmpty() {
        MoodAnalyser mood = new MoodAnalyser(" ");

        try{
            mood.analyseMood();
        }
        catch (MoodAnalyserException e){
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,e.type);
        }
    }
}
