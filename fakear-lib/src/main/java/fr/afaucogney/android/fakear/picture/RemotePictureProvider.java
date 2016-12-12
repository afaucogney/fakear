package fr.afaucogney.android.fakear.picture;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by afaucogney on 12/12/2016.
 */

public class RemotePictureProvider {



    public static final  String url = "http://lorempixel.com/600/400";


    public static List<String> getPictureListUrls(int size) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(getPhotoUrl(i));
        }
        return result;
    }


    public static String getPhotoUrl(int position) {
        String result = url;
        switch (position / 9) {
            case 0:
                result += "/sports";
                break;
            case 1:
                result += "/food";
                break;
            case 2:
                result += "/people";
                break;
            case 3:
                result += "/city";
                break;
            default:
                result += "/nature";
                break;
        }
        result += "/" + String.valueOf((position) % 9);
        return result;
    }

}
