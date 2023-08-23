/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MIDI;

/**
 * Class that provides constants representing instruments for the MIDIPlayer
 * Copyright 2004 Georgia Institute of Technology
 * 
 * @author unknown Georgia Tech Students
 * @author Barbara Ericson
 * @author adapted 2020 by bill
 */
public class Instruments {
  /* Instruments */
  public static final int PIANO = 0;
  public static final int BRIGHT_PIANO = 1;
  public static final int HARMONICA = 22;
  public static final int MUSIC_BOX = 10;
  public static final int XYLOPHONE = 11;
  public static final int GUITAR = 24;
  public static final int STEEL_GUITAR = 25;
  public static final int JAZZ_GUITAR = 26;
  public static final int BASS = 32;
  public static final int VIOLIN = 40;
  public static final int CELLO = 42;
  public static final int HARP = 46;
  public static final int TIMPANI = 47;
  public static final int TRUMPET = 56;
  public static final int TROMBONE = 57;
  public static final int TUBA = 58;
  public static final int FRENCH_HORN = 60;
  public static final int ALTO_SAX = 65;
  public static final int TENOR_SAX = 66;
  public static final int OBOE = 68;
  public static final int CLARINET = 71;
  public static final int PICCOLO = 72;
  public static final int FLUTE = 73;
  public static final int WHISTLE = 78;
  public static final int TAIKO_DRUM = 116;
  public static final int TOM = 117;
  public static final int SYNTH_DRUM = 118;
  public static final int CYMBAL = 119;
  public static final int BIRD = 123;
  public static final int TELEPHONE = 124;
  public static final int HELICOPTER = 125;
  public static final int APPLAUSE = 126;
  public static final int ICE_CUBE = 343;    
}

 /* http://math.hws.edu/eck/cs124/f17/lab8/lab8-files/midi/SimpleSynth.java
          // An array that holds the official names for all 128 standard Midi "instruments".
          private static final String[] instrumentNames = {
                          **   0: **     "Acoustic Grand Piano",
                          **   1: **     "Bright Acoustic Piano",
                          **   2: **     "Electric Grand Piano",
                          **   3: **     "Honky-tonk Piano",
                          **   4: **     "Electric Piano 1",
                          **   5: **     "Electric Piano 2",
                          **   6: **     "Harpsichord",
                          **   7: **     "Clavi",
                          **   8: **     "Celesta",
                          **   9: **     "Glockenspiel",
                          **  10: **     "Music Box",
                          **  11: **     "Vibraphone",
                          **  12: **     "Marimba",
                          **  13: **     "Xylophone",
                          **  14: **     "Tubular Bells",
                          **  15: **     "Dulcimer",
                          **  16: **     "Drawbar Organ",
                          **  17: **     "Percussive Organ",
                          **  18: **     "Rock Organ",
                          **  19: **     "Church Organ",
                          **  20: **     "Reed Organ",
                          **  21: **     "Accordion",
                          **  22: **     "Harmonica",
                          **  23: **     "Tango Accordion",
                          **  24: **     "Acoustic Guitar (nylon)",
                          **  25: **     "Acoustic Guitar (steel)",
                          **  26: **     "Electric Guitar (jazz)",
                          **  27: **     "Electric Guitar (clean)",
                          **  28: **     "Electric Guitar (muted)",
                          **  29: **     "Overdriven Guitar",
                          **  30: **     "Distortion Guitar",
                          **  31: **     "Guitar harmonics",
                          **  32: **     "Acoustic Bass",
                          **  33: **     "Electric Bass (finger)",
                          **  34: **     "Electric Bass (pick)",
                          **  35: **     "Fretless Bass",
                          **  36: **     "Slap Bass 1",
                          **  37: **     "Slap Bass 2",
                          **  38: **     "Synth Bass 1",
                          **  39: **     "Synth Bass 2 10",
                          **  40: **     "Violin",
                          **  41: **     "Viola",
                          **  42: **     "Cello",
                          **  43: **     "Contrabass",
                          **  44: **     "Tremolo Strings",
                          **  45: **     "Pizzicato Strings",
                          **  46: **     "Orchestral Harp",
                          **  47: **     "Timpani",
                          **  48: **     "String Ensemble 1",
                          **  49: **     "String Ensemble 2",
                          **  50: **     "SynthStrings 1",
                          **  51: **     "SynthStrings 2",
                          **  52: **     "Choir Aahs",
                          **  53: **     "Voice Oohs",
                          **  54: **     "Synth Voice",
                          **  55: **     "Orchestra Hit",
                          **  56: **     "Trumpet",
                          **  57: **     "Trombone",
                          **  58: **     "Tuba",
                          **  59: **     "Muted Trumpet",
                          **  60: **     "French Horn",
                          **  61: **     "Brass Section",
                          **  62: **     "SynthBrass 1",
                          **  63: **     "SynthBrass 2",
                          **  64: **     "Soprano Sax",
                          **  65: **     "Alto Sax",
                          **  66: **     "Tenor Sax",
                          **  67: **     "Baritone Sax",
                          **  68: **     "Oboe",
                          **  69: **     "English Horn",
                          **  70: **     "Bassoon",
                          **  71: **     "Clarinet",
                          **  72: **     "Piccolo",
                          **  73: **     "Flute",
                          **  74: **     "Recorder",
                          **  75: **     "Pan Flute",
                          **  76: **     "Blown Bottle",
                          **  77: **     "Shakuhachi",
                          **  78: **     "Whistle",
                          **  79: **     "Ocarina",
                          **  80: **     "Lead 1 (square)",
                          **  81: **     "Lead 2 (sawtooth)",
                          **  82: **     "Lead 3 (calliope)",
                          **  83: **     "Lead 4 (chiff)",
                          **  84: **     "Lead 5 (charang)",
                          **  85: **     "Lead 6 (voice)",
                          **  86: **     "Lead 7 (fifths)",
                          **  87: **     "Lead 8 (bass + lead)",
                          **  88: **     "Pad 1 (new age)",
                          **  89: **     "Pad 2 (warm)",
                          **  90: **     "Pad 3 (polysynth)",
                          **  91: **     "Pad 4 (choir)",
                          **  92: **     "Pad 5 (bowed)",
                          **  93: **     "Pad 6 (metallic)",
                          **  94: **     "Pad 7 (halo)",
                          **  95: **     "Pad 8 (sweep)",
                          **  96: **     "FX 1 (rain)",
                          **  97: **     "FX 2 (soundtrack)",
                          **  98: **     "FX 3 (crystal)",
                          **  99: **     "FX 4 (atmosphere)",
                          ** 100: **     "FX 5 (brightness)",
                          ** 101: **     "FX 6 (goblins)",
                          ** 102: **     "FX 7 (echoes)",
                          ** 103: **     "FX 8 (sci-fi)",
                          ** 104: **     "Sitar",
                          ** 105: **     "Banjo",
                          ** 106: **     "Shamisen",
                          ** 107: **     "Koto",
                          ** 108: **     "Kalimba",
                          ** 109: **     "Bag pipe",
                          ** 110: **     "Fiddle",
                          ** 111: **     "Shanai",
                          ** 112: **     "Tinkle Bell",
                          ** 113: **     "Agogo",
                          ** 114: **     "Steel Drums",
                          ** 115: **     "Woodblock",
                          ** 116: **     "Taiko Drum",
                          ** 117: **     "Melodic Tom",
                          ** 118: **     "Synth Drum",
                          ** 119: **     "Reverse Cymbal",
                          ** 120: **     "Guitar Fret Noise",
                          ** 121: **     "Breath Noise",
                          ** 122: **     "Seashore",
                          ** 123: **     "Bird Tweet",
                          ** 124: **     "Telephone Ring",
                          ** 125: **     "Helicopter",
                          ** 126: **     "Applause",
                          ** 127: **     "Gunshot"
          };
  */