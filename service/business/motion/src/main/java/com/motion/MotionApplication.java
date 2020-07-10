package com.motion;

import com.motion.data.MovieDomain;
import com.motion.data.MusicDomain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class MotionApplication {

	public static void main(String[] args) {
		SpringApplication.run(MotionApplication.class, args);

		

		MovieDomain movie = new MovieDomain();
		movie.setMovieName("ali");
		movie.setDateproduct(new Date());
		movie.count++;

		MusicDomain music = new MusicDomain();
		music.setMusicName("mohamad");
		music.setSinger(new Singer());
		music.count++;


		System.out.println(movie.count);
		System.out.println(music.count);
	}

}
