class AudioFile {
    protected String filename;
    protected int duration; 
    
    public AudioFile(String filename) {
        this.filename = filename;
        this.duration = 0; 
    }
    
    public AudioFile(String filename, int duration) {
        this.filename = filename;
        this.duration = duration;
    }
    
    public void playAudio() {
        System.out.println("Playing audio file: " + filename);
    }
}

class MP3File extends AudioFile {
    public MP3File(String filename) {
        super(filename);
    }
    
    public MP3File(String filename, int duration) {
        super(filename, duration);
    }
    
    @Override
    public void playAudio() {
        System.out.println("Playing MP3 file: " + filename + " with lossy compression for " + duration + " seconds.");
    }
}

class WAVFile extends AudioFile {
    public WAVFile(String filename) {
        super(filename);
    }
    
    public WAVFile(String filename, int duration) {
        super(filename, duration);
    }
    
    @Override
    public void playAudio() {
        System.out.println("Playing WAV file: " + filename + " with lossless quality for " + duration + " seconds.");
    }
}

class FLACFile extends AudioFile {
    public FLACFile(String filename) {
        super(filename);
    }
    
    public FLACFile(String filename, int duration) {
        super(filename, duration);
    }
    
    @Override
    public void playAudio() {
        System.out.println("Playing FLAC file: " + filename + " with high-definition lossless audio for " + duration + " seconds.");
    }
}

public class Main {
    public static void main(String[] args) {
        AudioFile format;

        format = new MP3File("song.mp3", 180);
        format.playAudio();

        format = new WAVFile("recording.wav", 300);
        format.playAudio();
        
        format = new FLACFile("album.flac", 240);
        format.playAudio();
    }
}
