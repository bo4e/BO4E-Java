package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.com.Zeitraum;
import bo4e.com.Fremdkostenblock;
import bo4e.com.Betrag;

/**
 * Mit diesem BO werden die Fremdkosten, beispielsweise für eine Angebotserstellung oder
 * eine Rechnungsprüfung,
 * übertragen.
 * Die Fremdkosten enthalten dabei alle Kostenblöcke, die von anderen Marktteilnehmern oder
 * Instanzen erhoben werden.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Fremdkosten.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Fremdkosten JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/Hochfrequenz/BO4E-Schemas/v202401.0.1-/src/bo4e_schemas/bo/Fremdkosten.json>`_
 */
public class Fremdkosten extends Geschaeftsobjekt {
    private final Typ _typ = Typ.FREMDKOSTEN;
    private Zeitraum gueltigkeit;
    private Fremdkostenblock[] kostenbloecke;
    private Betrag summeKosten;

    public Typ getTyp() { return _typ; }

    public Zeitraum getGueltigkeit() { return gueltigkeit; }
    public void setGueltigkeit(Zeitraum value) { this.gueltigkeit = value; }

    public Fremdkostenblock[] getKostenbloecke() { return kostenbloecke; }
    public void setKostenbloecke(Fremdkostenblock[] value) { this.kostenbloecke = value; }

    public Betrag getSummeKosten() { return summeKosten; }
    public void setSummeKosten(Betrag value) { this.summeKosten = value; }

}
