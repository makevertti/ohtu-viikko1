package ohtu.rajapinnat;

import ohtu.verkkokauppa.Tuote;

public interface IVarasto {
    Tuote haeTuote(int id);

    int saldo(int id);

    void otaVarastosta(Tuote t);

    void palautaVarastoon(Tuote t);
}
