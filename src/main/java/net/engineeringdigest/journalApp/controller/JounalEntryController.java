package net.engineeringdigest.journalApp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.engineeringdigest.journalApp.entity.JournalEntry;

@RestController
@RequestMapping("/journal")
public class JounalEntryController {
    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

// Get All Entries
    @GetMapping
    public ArrayList<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }

//  Get entry by ID
    @GetMapping("/getEntry/{id}")
    public JournalEntry getById(@PathVariable long id){
        return journalEntries.get(id);
    }

//  "Enter a single new entry"
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry MyEntry){
        journalEntries.put(MyEntry.getId(), MyEntry);
        return true;
    }

//  Delete a single new entry
    @DeleteMapping("/delEntry/{id}")
    public boolean deleteEntry(@PathVariable long id){
        if(!journalEntries.containsKey(id)) return false;
        journalEntries.remove(id);
        return true;
    }
}
