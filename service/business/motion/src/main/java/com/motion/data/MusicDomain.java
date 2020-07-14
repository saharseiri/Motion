package com.motion.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MusicDomain {

    @Id
    @GeneratedValue
    private int musicId;
    public int count;
    private String musicName;
    private String singer;

    public MusicDomain() {
    }

    public MusicDomain(int count, String musicName, String singer) {
        this.count = count;
        this.musicName = musicName;
        this.singer = singer;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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
