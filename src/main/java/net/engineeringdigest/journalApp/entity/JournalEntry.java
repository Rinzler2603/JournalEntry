package net.engineeringdigest.journalApp.entity;

import java.sql.Date;
import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "journal_entries")
public class JournalEntry {

    @Id
    private ObjectId id;
    private String title;
    private String content;
    private LocalDateTime date;

    public void setId(ObjectId id){
        this.id = id;
    }
    public ObjectId getId(){
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

    public void setDate(LocalDateTime date){
        this.date = date;
    }
    public LocalDateTime getDate(){
        return this.date;
    }
}
