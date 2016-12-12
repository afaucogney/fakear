package fr.afaucogney.android.fakear.picture;

import java.util.ArrayList;
import java.util.List;

import fr.afaucogney.android.fakear.text.StringProvider;

/**
 * Created by afaucogney on 12/12/2016.
 */

public class RemoteAvatarPictureProvider {


    public static final String MAIN_URL = "https://api.adorable.io/avatars/200/";
    public static final String TERMINAISON = ".io.png";



    public static List<String> getUserPhotoListUrls(int size) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(MAIN_URL + StringProvider.getRandomString(20) + TERMINAISON);
        }
        return result;
    }


    public static List<String> getTags() {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            result.add(StringProvider.getRandomString(8));
        }
        return result;
    }
}
