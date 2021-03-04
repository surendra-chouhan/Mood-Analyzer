package com.moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(String message)
    {
        this.message=message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        }
        catch(NullPointerException e){
            throw new MoodAnalyserException("Please Enter a right input");
        }
    }
}
