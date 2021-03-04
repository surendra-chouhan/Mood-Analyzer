package com.moodanalyser;


import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageReturnSad() {
        String message = "I am sad";
        MoodAnalyser mood = new MoodAnalyser(message);
        String message1 = mood.analyseMood();
        Assert.assertEquals("Sad", message1);
    }

    @Test
    public void givenMessageReturnHappy() {
        String message = "I am in Happy mood";
        MoodAnalyser mood = new MoodAnalyser(message);
        String message1 = mood.analyseMood();
        Assert.assertEquals("Happy", message1);
    }
}
