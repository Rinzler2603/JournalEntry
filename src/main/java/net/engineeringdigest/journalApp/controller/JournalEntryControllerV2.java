package net.engineeringdigest.journalApp.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.service.JournalEntryService;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2{

    @Autowired
    private JournalEntryService journalEntryService;

// Get All Entries
    @GetMapping
    public ArrayList<JournalEntry> getAll(){
        return null;
    }

//  Get entry by ID
    @GetMapping("/getEntry/{id}")
    public JournalEntry getById(@PathVariable long id){
        return null;
    }

//  "Enter a single new entry"
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry MyEntry){
        journalEntryService.saveEntry(MyEntry);
        return true;
    }

//  Delete a single new entry
    @DeleteMapping("/delEntry/{id}")
    public boolean deleteEntry(@PathVariable long id){
        return false;
    }
}
