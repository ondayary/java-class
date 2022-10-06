package week3.day3.map;

import java.util.HashMap;

public class MapExercise {
    // key, value
    // Map 선언하고 값 넣기 (.put)
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("네이버", "https://www.naver.com");
        map.put("구글", "https://www.google.com");

        System.out.println(map.get("네이버"));
        // map : key만 가지고 찾을 수 있음

        map.put("유민기", "https://github.com/hyeonju01/likelion_repo3_test/tree/main/src/week3/day2");
        map.put("노휘", "https://github.com/hakjun1/intelij-git-exercise03");
        map.put("김지훈",	"https://github.com/simhyunbo/git-exercise-04.git");
        map.put("박채원", "https://github.com/jangseoyun/Intellij-git-exercise");
        map.put("신서아",	"https://github.com/ahngiwon00/git-exercise-java-push");
        map.put("강다겸", "https://github.com/Senna97/Like-Lion");
        map.put("노도형",	"https://github.com/ahn-ji0/java_exercis");
        map.put("신여준", "https://github.com/zinxeon/git-exercise-push");
        map.put("허선",  "https://github.com/Changbum97/like-lion-java");
        map.put("허은유", "https://github.com/su0545/like-lion-java.git");
        map.put("노지아",	"https://github.com/SoonMinEom/LikeALion");
        map.put("심서후", "https://github.com/Nickolodeon98/second-java-exercise");
        map.put("신아인",	"https://github.com/ohy1023/newtest");
        map.put("유준이", "https://github.com/daehwan0307/JAVA_Study");
        map.put("양시은",	"https://github.com/SuInWoo/LikeLion2th");
        map.put("전민승", "https://github.com/sanghee2359?tab=repositories");
        map.put("강예은", "https://github.com/wogus0518/LikeLion-Backend");
        map.put("허로이", "https://github.com/heejunns/git_exercise_push.git");
        map.put("하도이", "https://github.com/coastby/java-project");
        map.put("유유진", "https://github.com/h5000n/git-java-ex211005");
        map.put("노도원", "https://github.com/Yunjaejo/new-project-push-test");

        System.out.println(map.get("양시은"));
    }
}


        