package net.engineeringdigest.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;

import java.util.List;

@Service
public class JournalEntryService {
    
    @Autowired
    private JournalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
        return;
    }

    public JournalEntry findById(ObjectId id){
        return journalEntryRepository.findById(id).orElse(null);
    }

    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }

    public void deleteById(ObjectId id){
        journalEntryRepository.deleteById(id);
    }
}
