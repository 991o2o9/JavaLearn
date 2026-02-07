import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    static Clip loadClip(String path)
            throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        File file = new File(path);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        return clip;
    }


    static String getTrackName(String path) {
        String fileName = new File(path).getName();
        return fileName.replace(".wav", "").replace("_", " ");
    }

    static void printPlayer(int currentTrack, String[] playlist, boolean isPlaying) {
        System.out.println("╔═══════════════════════════════════════════════════════════╗");
        System.out.println("          🎵  J A V A   M U S I C   P L A Y E R  🎵          ");
        System.out.println("╚═══════════════════════════════════════════════════════════╝");
        System.out.println();

        System.out.println("┌─────────────────── PLAYLIST ───────────────────┐");
        for (int i = 0; i < playlist.length; i++) {
            String indicator = (i == currentTrack) ? "▶ " : "  ";
            String trackName = getTrackName(playlist[i]);
            if (trackName.length() > 40) {
                trackName = trackName.substring(0, 37) + "...";
            }
            System.out.printf("│ %s %d. %-42s │%n", indicator, i + 1, trackName);
        }
        System.out.println("└────────────────────────────────────────────────┘");
        System.out.println();

        String statusIcon = isPlaying ? "▶ PLAYING" : "⏸ PAUSED";
        String currentTrackName = getTrackName(playlist[currentTrack]);
        System.out.println("♫ Now: " + currentTrackName);
        System.out.println("Status: " + statusIcon);
        System.out.println();

        System.out.println("╔═══════════════ CONTROLS ═══════════════╗");
        System.out.println("║  [P] Play/Pause    [N] Next Track      ║");
        System.out.println("║  [S] Stop          [B] Previous Track  ║");
        System.out.println("║  [R] Restart       [Q] Quit            ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();
        System.out.print("Enter command: ");
    }

    public static void main(String[] args) {
        String[] playlist = {
                "src/Happy Together - The Harvard Krokodiloes.wav",
                "src/SR - Welcome To Brixton - (Clean).wav",
                "src/Central Cee x Dave - Sprinter [Music Video].wav"
        };

        int currentTrack = 0;
        Clip clip = null;
        boolean isPlaying = false;

        try (Scanner scanner = new Scanner(System.in)) {
            clip = loadClip(playlist[currentTrack]);
            String response = "";

            while (!response.equals("Q")) {
                printPlayer(currentTrack, playlist, isPlaying);
                response = scanner.next().toUpperCase();

                switch (response) {
                    case "P" -> {
                        if (clip.isRunning()) {
                            clip.stop();
                            isPlaying = false;
                        } else {
                            clip.start();
                            isPlaying = true;
                        }
                    }
                    case "S" -> {
                        clip.stop();
                        isPlaying = false;
                    }
                    case "R" -> {
                        clip.setMicrosecondPosition(0);
                        if (!isPlaying) {
                            clip.start();
                            isPlaying = true;
                        }
                    }
                    case "N" -> {
                        clip.stop();
                        clip.close();
                        currentTrack = (currentTrack + 1) % playlist.length;
                        clip = loadClip(playlist[currentTrack]);
                        clip.start();
                        isPlaying = true;
                    }
                    case "B" -> {
                        clip.stop();
                        clip.close();
                        currentTrack = (currentTrack - 1 + playlist.length) % playlist.length;
                        clip = loadClip(playlist[currentTrack]);
                        clip.start();
                        isPlaying = true;
                    }
                }
            }

            clip.close();

        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println(" Thanks for using Java Music Player ");

    }
}