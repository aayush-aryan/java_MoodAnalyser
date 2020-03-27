public class MoodAnalyser {
    String message;
    MoodAnalyser(){
    }
    MoodAnalyser(String message){
        this.message=message;
    }

  public String analyseMood() {
      try {
          if(message==null) {
              throw new MoodAnalyserException("HAPPY");
          }
          if (message.contains("sad"))
              return "SAD";
      }

    catch(MoodAnalyserException e)

    {
        return e.getMessage();
    }
      return "HAPPY";
  }
}
