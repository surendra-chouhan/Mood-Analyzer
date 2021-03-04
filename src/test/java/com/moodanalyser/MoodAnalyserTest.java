package com.moodanalyser;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessageReturnHappy() {
        MoodAnalyser mood = new MoodAnalyser(null);

        try {
            mood.analyseMood();
        }
        catch(MoodAnalyserException e){
            Assert.assertEquals("Please Enter a right input", e.getMessage());
        }
    }
}
