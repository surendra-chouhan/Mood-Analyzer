package com.moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser(){
        this ("I am in a sad mood");
    }
    public MoodAnalyser(String message)
    {
        this.message=message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if (message.length() == 0){
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, "Please enter correct input");
            }
            if (message.contains("sad")) {
                return "Sad";
            } else {
                return "Happy";
            }
        }
        catch(NullPointerException e){
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Please enter a right input");
        }
    }
}
