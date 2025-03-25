class AudioFile {
    public void playAudio() {
        System.out.println("Playing audio file...");
    }
}

class MP3File extends AudioFile {
    @Override
    public void playAudio() {
        System.out.println("Playing MP3 file with lossy compression.");
    }
}

class WAVFile extends AudioFile {
    @Override
    public void playAudio() {
        System.out.println("Playing WAV file with lossless quality.");
    }
}

class FLACFile extends AudioFile {
    @Override
    public void playAudio() {
        System.out.println("Playing FLAC file with high-definition lossless audio.");
    }
}

public class Main {
    public static void main(String[] args) {
        AudioFile format;

        format = new MP3File();
        format.playAudio();

        AudioFile format;
        format = new WAVFile();
        format.playAudio();
        
        AudioFile format;
        format = new FLACFile();
        format.playAudio();

    }
}
