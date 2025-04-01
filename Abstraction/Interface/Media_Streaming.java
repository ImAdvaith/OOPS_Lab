interface MediaService {
    void play();
    void pause();
    void stop();
}

class Netflix implements MediaService {
    @Override
    public void play() {
        System.out.println("Netflix is now playing a movie.");
    }

    @Override
    public void pause() {
        System.out.println("Netflix movie paused.");
    }

    @Override
    public void stop() {
        System.out.println("Netflix movie stopped.");
    }
}

class Spotify implements MediaService {
    @Override
    public void play() {
        System.out.println("Spotify is now playing music.");
    }

    @Override
    public void pause() {
        System.out.println("Spotify music paused.");
    }

    @Override
    public void stop() {
        System.out.println("Spotify music stopped.");
    }
}

public class MediaPlayer {
    public static void main(String[] args) {
        MediaService netflix = new Netflix();
        netflix.play();
        netflix.pause();
        
        MediaService spotify = new Spotify();
        spotify.play();
        spotify.stop();
    }
}
