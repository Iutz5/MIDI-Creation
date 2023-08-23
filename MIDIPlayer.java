/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MIDI;

import javax.sound.midi.Synthesizer;
import javax.sound.midi.Soundbank;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;

// https://www.geeksforgeeks.org/java-midi/
// https://stackoverflow.com/questions/22467633/java-midi-player-program: Write a main method that uses your Song class to play Twinkle Twinkle Little Star, which starts with the notes: C, C, G, G, A, A, G (half note), F, F, E, E, D, D, C (half note).
// http://www.cs.albany.edu/~sdc/CSI201/Spr12/201Stuff/bookClassesJavaFiles/MidiPlayer.java which uses noteon/noteoff (make small functions for each)
// Java program showing how to change the instrument type 

/**
 * Class that knows how to play notes using the midi standard
 * Copyright 2004 Georgia Institute of Technology
 * 
 * @author unknown Georgia Tech Students
 * @author Barbara Ericson
 * @author adapted 2020 by bill
 */
public final class MIDIPlayer {  
    /**
     * 
     */
    protected Synthesizer synth; // the music synthesizer
    
    /**
     * 
     */
    protected Soundbank soundbank; // the sound bank
    
    /**
     * 
     */
    protected MidiChannel[] channels; // all the channels
    
    /**
     * 
     */
    protected MidiChannel channel;
  
    /**
     * Construct a MIDIPlayer object
     */
    public MIDIPlayer() {
        try {
            synth = MidiSystem.getSynthesizer();
            synth.open();
            soundbank = synth.getDefaultSoundbank();
            if(soundbank != null) {
              synth.loadAllInstruments(soundbank);
            }
            channels = synth.getChannels();  
            channel = channels[0];
        } catch(MidiUnavailableException e) {
            System.err.println(e);
            System.exit(-1);
        }
    }
    
    /**
     * Set a particular MIDI channel as the default for playing notes through 
     * this interface that do not request a channel parameter
     * @param i the index of the channel to set as the default
     */
    public void setChannel(int i) {
        channel = channels[i];
    }
    
    /**
     * Can be called by the destructor to close the MIDI interface.
     */
    @Override
    public void finalize() {
      try {
        for (MidiChannel c : channels) {
            if (c != null) {
                c.allNotesOff();
            }
        }
      } catch(Exception e) {
          System.err.println(e);
          System.exit(-1);
      } finally {
          try {
            super.finalize();              
          } catch(Throwable e2) {
            System.err.println(e2);
            System.exit(-1);   
          }
      } 
    }

    /**
     * Play a note on the default channel
     * @param note index of the note from the Notes class (60 is middle C)
     * @param duration duration of the note (i.e., Notes.NOTE_WHOLE or Notes.NOTE_QUARTER)
     * @param intensity intensity of the note
     */
    public void playNote(int note, int duration, int intensity) {
      try {
        channel.noteOn(note, intensity);
        Thread.sleep(duration);
        channel.noteOff(note, intensity);
      } catch(InterruptedException e){}
    }
    
    // https://stackoverflow.com/questions/2064066/does-java-have-built-in-libraries-for-audio-synthesis/2065693#2065693
    /**
     * Play a chord on the default channel
     * @param notes an array of notes for the chord
     * @param intensity the intensity of the sound
     * @param duration the duration of the chord
     */
    public void playChord(int[] notes,
                          int duration,
                          int intensity) {
        try {
            for(int i = 0; i < notes.length; i++) {
                channel.noteOn(notes[i], intensity);
            }
            Thread.sleep(duration);
            channel.allNotesOff();
        } catch(InterruptedException e){}
    }
    
    /**
     * Method to play an array of notes with the given
     * durations and intensities
     * @param channelIndices the array channel indices to use
     * @param notes the array of notes to play (0-127)
     * @param durations the array of durations to 
     * use for playing the notes in milliseconds
     * @param intensities the array of intensities (loudness)
     */
    public void playNotes(int [] channelIndices, 
                          int [] notes, 
                          int [] durations,
                          int [] intensities) {
      // loop through the array of notes
      for(int i = 0; i < notes.length; i++) {
        MidiChannel ch = channels[channelIndices[i]];
        ch.noteOn(notes[ i ], intensities[i]);
        try { 
            Thread.sleep(durations[i]); 
        } catch(InterruptedException e) { 
            System.err.println(e); 
        }
        ch.noteOff(notes[i]);
      } 
    }    
    
    /**
     * Method to play an array of chords with the given
     * durations and intensities
     * @param channelIndices the array channel indices to use
     * @param notes the 2D array of chords to play (0-127)
     * @param durations the array of durations to 
     * use for playing the notes in milliseconds
     * @param intensities the 2D array of intensities (loudness)
     */
    public void playChords(int [] channelIndices, 
                          int [][] notes, 
                          int [] durations,
                          int [][] intensities) {
      // loop through the array of chords
      try {
        for(int i = 0; i < channelIndices.length; i++) {
          MidiChannel ch = channels[channelIndices[i]];
          for(int j = 0; j < notes[i].length; j++) {
              ch.noteOn(notes[i][j], intensities[i][j]);
          }
          Thread.sleep(durations[i]);
          
          for(int j = 0; j < notes[i].length; j++) {
              ch.noteOff(notes[i][j], intensities[i][j]);
          }          
        } 
      } catch(InterruptedException e) { 
          System.err.println(e); 
      }      
    }     

    /**
     * Method to rest for a specified number of milliseconds
     * @param duration the amount to rest in milliseconds
     */
    public static void rest(int duration) {
      try {
        Thread.sleep(duration);
      } catch(InterruptedException e){}
    }

    /**
     * Method to set the instrument to play on a particular channel
     * @param num a number from 0 to 127 that represents the instrument
     * @param index the channel number
     */
    public void setInstrument(int num, int index) {
        channels[index].programChange(num);
    }
    
    /**
     * Method to set the instrument to play on the default channel
     * @param num a number from 0 to 127 that represents the instrument
     */
    public void setInstrument(int num) {
        setInstrument(num, 0);
    }
    
    /**
     * Placeholder main function for library testing.  Do not call this method.
     * @param args an array of command line argument strings
     */
    public static void main(String[] args) {

    }
}