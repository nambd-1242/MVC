package com.example.buidanhnam.constraintlayout.model;

import java.util.ArrayList;

/**
 * Created by Bui Danh Nam on 20/12/2017.
 */

public class DAOMusic {
    private ArrayList<Music> musics ;
    public DAOMusic (){

    };
    public ArrayList<Music> getAllData(){
         return getdataToSource();
    }

    private ArrayList<Music> getdataToSource() {
        // mock data
        musics = new ArrayList<>();
        musics.add(new Music("Anh sai roi " , "ABC" , "https://baomoi-photo-1-td.zadn.vn/w700_r1m/17/09/27/170/23389908/1_52085.jpg" , "Nếu ngày mai em rời xa anh \n" +
                "Anh không biết sống thế nào đây \n" +
                "Con tim anh nhói đau từng cơn \n" +
                "Anh biết hạt mưa không ngừng rơi khi thấy em buồn. \n"));
        musics.add(new Music("Xin loi tinh yeu  " , "Cao thai Son " , "https://eva-img.24hstatic.com/upload/2-2017/images/2017-05-21/1495342112-ava2-watermark.jpeg" , "Nếu ngày mai em rời xa anh \n" +
                "Anh không biết sống thế nào đây \n" +
                "Con tim anh nhói đau từng cơn \n" +
                "Anh biết hạt mưa không ngừng rơi khi thấy em buồn. \n"));
        musics.add(new Music("Lac troi " , "Son Tung MTP " , "https://znews-photo-td.zadn.vn/w1024/Uploaded/rohunwa/2017_07_27/153124.jpg" , "Nếu ngày mai em rời xa anh \n" +
                "Anh không biết sống thế nào đây \n" +
                "Con tim anh nhói đau từng cơn \n" +
                "Anh biết hạt mưa không ngừng rơi khi thấy em buồn. \n"));
        musics.add(new Music(" Sao Sao " , "Lam Chan Huy " , "https://vtv1.vcmedia.vn/k:2016/2l9a9437-1467079786091-1467097992183/son-tung-mtp-di-doc-dat-nuoc-don-sinh-nhat-tuoi-22.jpg" , "Nếu ngày mai em rời xa anh \n" +
                "Anh không biết sống thế nào đây \n" +
                "Con tim anh nhói đau từng cơn \n" +
                "Anh biết hạt mưa không ngừng rơi khi thấy em buồn. \n"));
        musics.add(new Music("Anh sai roi " , "ABC" , "http://sohanews.sohacdn.com/zoom/260_162/2017/tam3-1512266531193-24-0-396-600-crop-1512266756074.jpg" , "Nếu ngày mai em rời xa anh \n" +
                "Anh không biết sống thế nàoWe have a video player application that we developed as a weekend hobby project which does a few things like slow motion, reverse and zoom. Having done the video listing part of the application with very little emphasis on design and maintainability of the code, soon after adding new features the code became an “embarrassment”. Kept getting crashes and the only solution for those crashes we could come up with was adding a try catch :(.\n" +
                "\n" +
                "Needed to make the video listing part of my application crash free, easy to maintain and extend. I had to turn to a design pattern and it was the MODEL VIEW PRESENTER.\n" +
                "I have never profession" +
                "We have a video player application that we developed as a weekend hobby project which does a few things like slow motion, reverse and zoom. Having done the video listing part of the application with very little emphasis on design and maintainability of the code, soon after adding new features the code became an “embarrassment”. Kept getting crashes and the only solution for those crashes we could come up with was adding a try catch :(.\n" +
                "\n" +
                "Needed to make the video listing part of my application crash free, easy to maintain and extend. I had to turn to a design pattern and it was the MODEL VIEW PRESENTER.\n" +
                "I have never professionally written code in Android, so all the explanations below would be from a beginners perspective." +
                "We have a video player application that we developed as a weekend hobby project which does a few things like slow motion, reverse and zoom. Having done the video listing part of the application with very little emphasis on design and maintainability of the code, soon after adding new features the code became an “embarrassment”. Kept getting crashes and the only solution for those crashes we could come up with was adding a try catch :(.\n" +
                "\n" +
                "Needed to make the video listing part of my application crash free, easy to maintain and extend. I had to turn to a design pattern and it was the MODEL VIEW PRESENTER.\n" +
                "I have never professionally written code in Android, so all the explanations below would be from a beginners perspective.We have a video player application that we developed as a weekend hobby project which does a few things like slow motion, reverse and zoom. Having done the video listing part of the application with very little emphasis on design and maintainability of the code, soon after adding new features the code became an “embarrassment”. Kept getting crashes and the only solution for those crashes we could come up with was adding a try catch :(.\n" +
                "\n" +
                "Needed to make the video listing part of my application crash free, easy to maintain and extend. I had to turn to a design pattern and it was the MODEL VIEW PRESENTER.\n" +
                "I have never professionally written code in Android, so all the explanations below would be from a beginners perspective.We have a video player application that we developed as a weekend hobby project which does a few things like slow motion, reverse and zoom. Having done the video listing part of the application with very little emphasis on design and maintainability of the code, soon after adding new features the code became an “embarrassment”. Kept getting crashes and the only solution for those crashes we could come up with was adding a try catch :(.\n" +
                "\n" +
                "Needed to make the video listing part of my application crash free, easy to maintain and extend. I had to turn to a design pattern and it was the MODEL VIEW PRESENTER.\n" +
                "I have never professionally written code in Android, so all the explanations below would be from a beginners perspective.ally written code in Android, so all the explanations below would be from a beginners perspective. đây \n" +
                "Con tim anh nhói đau từng cơn \n" +
                "Anh biết hạt mưa không ngừng rơi khi thấy em buồn. \n"));
        return musics ;
    }
}
