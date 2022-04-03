package songAlbums;

public class Main {

    public static void main(String[] args) {
        // 문자열 하나를 파라미터로 사용하는 생성자

        // 자이언티
        // 가수 객체 (가수이름)
        Artist zionT = new Artist("zionT");

        // 앨범이름, 앨범년도, 가수이름
        Album OO = new Album("OO", 2017, zionT);

        // 앨범 수록곡 ( 노래 객체(노래 제목, 가수 , 앨범이름))
        OO.addTrack(new Song("노래", zionT, OO));
        OO.addTrack(new Song("Complex", zionT, OO));
        OO.addTrack(new Song("미안해", zionT, OO));
        OO.addTrack(new Song("영화관", zionT, OO));
        OO.addTrack(new Song("바람", zionT, OO));


        Album zzz = new Album("zzz", 2018, zionT);

        zzz.addTrack(new Song("멋지게 인사하는 법", zionT, zzz));
        zzz.addTrack(new Song("잠꼬대", zionT, zzz));
        zzz.addTrack(new Song("아이돌", zionT, zzz));
        zzz.addTrack(new Song("말라깽이", zionT, zzz));

        // 가수의 앨범 추가
        zionT.addAlbum(OO);
        zionT.addAlbum(zzz);


        Artist zanNabi = new Artist("zanNabi");

        Album monkeyHotel = new Album("monkeyHotel", 2016, zanNabi);
        monkeyHotel.addTrack(new Song("뜨거운 여름밤은 가고 남은건 볼품 없지만", zanNabi, monkeyHotel));
        monkeyHotel.addTrack(new Song("JUNGLE", zanNabi, monkeyHotel));

        zanNabi.addAlbum(monkeyHotel);

        System.out.println(zionT.getAlbums().get(0).getTrack(2).toString());
        // 해당가수의 앨범 0번째에서 트랙 2번째의 노래 반환
        System.out.println();
        System.out.println(zanNabi.getAlbums().get(0).getTrack(1).toString());

    }

}
/*
* artist
* album
* song
* */