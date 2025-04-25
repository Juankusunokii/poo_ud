public class UDstudent extends estudiante {
    private String languages;
    private boolean repeating;
    private int assistance;

    public void setLanguages (String languages){
        this.languages = languages;
    }
    
    public void setReapiting (boolean repeating){
        this.repeating = repeating;
    }
    
    public void setAssistance (int assistance){
        this.assistance = assistance;
    }
    
    
    public String getlanguages (){
        return languages;
    }

    public boolean getrepeating (){
        return repeating;
    }

    public int  getAssistance (){
        return assistance;
    }

}
