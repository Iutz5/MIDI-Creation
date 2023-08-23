/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MIDIAssignment;

import java.util.Scanner;
import com.MIDI.Instruments;
import com.MIDI.MIDIPlayer;
import com.MIDI.Notes;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

//import java.util.Scanner;

/**
 *
 * @author ianut
 */
public class Main {

    /**
     *
     * @param args
     * @param
     */
    
    public static final int NOTE_HALF = 600;
    public static final int NOTE_WHOLE = 2 * NOTE_HALF;
    public static final int NOTE_QUARTER = NOTE_HALF / 2;
    public static final int NOTE_EIGHTH = NOTE_QUARTER / 2;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.println("Do you like lullibies? Please enter y for yes and n for no");
        String answerToQuestion = in.next();
    if (answerToQuestion.equals("y")) {
        alphabet();
    }
    else {
        System.out.println("Well how about something a little more retro like this?");
           superMarioBrothersThemeSong(); 
    }
        
        
        
    }
    
    public static void playMainPart() {
        MIDIPlayer player = new MIDIPlayer();
        player.setInstrument(Instruments.PIANO);
        
        player.playNote(Notes.NOTE_C4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_C4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_G4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_G4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_A4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_A4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_G4, NOTE_HALF, Notes.DEFAULT_INTENSITY);
     
    }
    
    
    public static void superMarioBrothersThemeSong() {
        
        
         MIDIPlayer player = new MIDIPlayer();
         
        
        player.setInstrument(Instruments.PIANO);
        
        MIDIPlayer.rest(NOTE_WHOLE);
        
        leadup();
        
        verse1();
        
        verse1();
        
        verse2();
        
        verse2();
        
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(62, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        
        player.playNote(64, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(57, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(55, NOTE_HALF, Notes.DEFAULT_INTENSITY);
        
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(62, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(64, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        
        MIDIPlayer.rest(NOTE_WHOLE);
        
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(62, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        
        player.playNote(64, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(57, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(55, NOTE_HALF, Notes.DEFAULT_INTENSITY);
        
        leadup();
        
        verse1();
        verse1();
        verse3();
        verse3();
        
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(62, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        
        player.playNote(64, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(57, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(55, NOTE_HALF, Notes.DEFAULT_INTENSITY);
        
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(62, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(64, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        
        MIDIPlayer.rest(NOTE_QUARTER);
        player.playNote(Notes.NOTE_E4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_G4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(76, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(72, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(74, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(79, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(62, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        
        player.playNote(64, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(57, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(55, NOTE_HALF, Notes.DEFAULT_INTENSITY);
        
        leadup();
        
        verse3();
        
        verse3();
        
        player.playNote(Notes.NOTE_C4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(Notes.NOTE_G3, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(52, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        
        player.playNote(57, (200), Notes.DEFAULT_INTENSITY);
        player.playNote(59, (200), Notes.DEFAULT_INTENSITY);
        player.playNote(57, (200), Notes.DEFAULT_INTENSITY);
        player.playNote(56, (200), Notes.DEFAULT_INTENSITY);
        player.playNote(58, (200), Notes.DEFAULT_INTENSITY);
        player.playNote(57, (200), Notes.DEFAULT_INTENSITY);
        
        player.playNote(52, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(51, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(52, 1500, Notes.DEFAULT_INTENSITY);
    }
     public static void verse1 (){
         
         MIDIPlayer player = new MIDIPlayer();
         
        player.setInstrument(Instruments.PIANO);
        
        player.playNote(Notes.NOTE_C4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(Notes.NOTE_G3, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(52, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(Notes.NOTE_A3, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(59, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(58, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(57, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        
        player.playNote(Notes.NOTE_G3, (200), Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_E4, (200), Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_G4, 200, Notes.DEFAULT_INTENSITY);
        player.playNote(69, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(65, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(67, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(Notes.NOTE_E4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_C4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_D4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(59, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        
        
        
    }
     
     public static void verse2 (){
         
         MIDIPlayer player = new MIDIPlayer();
         
        player.setInstrument(Instruments.PIANO);
        
        MIDIPlayer.rest(NOTE_QUARTER);
        player.playNote(Notes.NOTE_G4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(66, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(65, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(63, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(64, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(56, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(57, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(57, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(62, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        
        MIDIPlayer.rest(NOTE_QUARTER);
        player.playNote(67, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(66, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(65, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(63, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(64, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        
        MIDIPlayer.rest(NOTE_EIGHTH);
        int chordNotes[] = {Notes.NOTE_G3,72};
        player.playChord(chordNotes, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playChord(chordNotes, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playChord(chordNotes, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_QUARTER);
        
        MIDIPlayer.rest(NOTE_QUARTER);
        player.playNote(67, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(66, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(65, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(63, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(64, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(56, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(57, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(57, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(60, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(62, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        
        MIDIPlayer.rest(NOTE_QUARTER);
        player.playNote(63, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(62, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
                
        player.playNote(60, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(900);   
     }
     public static void leadup (){
         
         MIDIPlayer player = new MIDIPlayer();
         
        player.setInstrument(Instruments.PIANO);
         
        player.playNote(Notes.NOTE_E4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_E4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(Notes.NOTE_E4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_EIGHTH);
        player.playNote(Notes.NOTE_C4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_E4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        
        player.playNote(Notes.NOTE_G4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_QUARTER);
        player.playNote(Notes.NOTE_G3, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_QUARTER);
     }
     public static void verse3 (){
         
         MIDIPlayer player = new MIDIPlayer();
         
         
        player.setInstrument(Instruments.PIANO);
        
        player.playNote(Notes.NOTE_E4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_C4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_G3, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_QUARTER);
        player.playNote(56, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        
        player.playNote(Notes.NOTE_A3, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_F4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_F4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_A3, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_QUARTER);
        
        player.playNote(59, (200), Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_A4, (200), Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_A4, (200), Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_A4, (200), Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_G4, (200), Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_F4, (200), Notes.DEFAULT_INTENSITY);
        
        player.playNote(Notes.NOTE_E4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_C4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(57, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(55, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_QUARTER);
        
        player.playNote(Notes.NOTE_E4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_C4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_G3, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_QUARTER);
        player.playNote(56, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        
        player.playNote(Notes.NOTE_A3, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_F4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_F4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_A3, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_QUARTER);
        
        player.playNote(59, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_F4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_F4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_F4, (200) , Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_E4, (200), Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_D4, (200), Notes.DEFAULT_INTENSITY);
        
        player.playNote(Notes.NOTE_G3, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(52, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(52, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_C3, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(NOTE_QUARTER);
     }
    /**
     * @param
     */ 
    
    /**
     *
     * @param
     */
    public static void alphabet() {
        // TODO code application logic here
        
        MIDIPlayer player = new MIDIPlayer();
        
        player.setInstrument(Instruments.PIANO);
        
        MIDIPlayer.rest(NOTE_WHOLE);
 
        
        playMainPart();
       
        
        MIDIPlayer.rest(NOTE_EIGHTH);
        
        player.playNote(Notes.NOTE_F4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_F4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_E4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_E4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_D4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_D4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_D4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_D4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_C4, NOTE_HALF, Notes.DEFAULT_INTENSITY);
        
        MIDIPlayer.rest(NOTE_EIGHTH);
        
        player.playNote(Notes.NOTE_G4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_G4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_F4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        
        MIDIPlayer.rest(Notes.NOTE_SIXTEENTH);
        
        player.playNote(Notes.NOTE_E4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_E4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_D4, NOTE_HALF, Notes.DEFAULT_INTENSITY);
        
        MIDIPlayer.rest(NOTE_EIGHTH);
        
        player.playNote(Notes.NOTE_G4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_G4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_G4, NOTE_EIGHTH, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_F4, NOTE_HALF, Notes.DEFAULT_INTENSITY);
        MIDIPlayer.rest(Notes.NOTE_SIXTEENTH);
        player.playNote(Notes.NOTE_E4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_E4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_D4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        
        MIDIPlayer.rest(NOTE_EIGHTH);
        
        playMainPart();
        
        MIDIPlayer.rest(NOTE_EIGHTH);
        
        player.playNote(Notes.NOTE_F4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_F4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_E4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_E4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_D4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_D4, NOTE_QUARTER, Notes.DEFAULT_INTENSITY);
        player.playNote(Notes.NOTE_C4, NOTE_HALF, Notes.DEFAULT_INTENSITY);
        
        
        
        
    } 
    
    
    
}
