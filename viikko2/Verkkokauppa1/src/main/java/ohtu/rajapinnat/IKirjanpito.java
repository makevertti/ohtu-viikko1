package ohtu.rajapinnat;

import java.util.ArrayList;

public interface IKirjanpito {
    void lisaaTapahtuma(String tapahtuma);

    ArrayList<String> getTapahtumat();
}
