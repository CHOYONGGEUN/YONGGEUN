package javabasic.CH1.ex;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReview[] reviews =new MovieReview[2];

        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";
        reviews[0] = inception;

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃타임";
        aboutTime.title = "인생은 시간 영화!";
        reviews[1] = aboutTime;
    }
}
