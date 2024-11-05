package net.engineeringdigest.journalApp.entity;

public class JournalEntry {
    private long id;
    private String title;
    private String content;

    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return this.id;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    
    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return this.content;
    }
}
