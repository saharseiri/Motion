package com.motion.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MusicDomain {

    @Id
    @GeneratedValue
    private int musicId;
    private String musicName;
    private String singer;

    public MusicDomain() {
    }

    public MusicDomain(String musicName, String singer) {
        this.musicName = musicName;
        this.singer = singer;
    }

    public int getMusicId() {
        return musicId;
    }

    public void setMusicId(int musicId) {
        this.musicId = musicId;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
