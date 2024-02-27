package bo4e.bo;

import bo4e.enums.Typ;
import bo4e.enums.Marktrolle;
import bo4e.enums.Rollencodetyp;
import bo4e.enums.Sparte;

/**
 * Objekt zur Aufnahme der Information zu einem Marktteilnehmer
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/bo/Marktteilnehmer.svg"
 * type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Marktteilnehmer JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.1.0-rc1/src/bo4e_schemas/bo/Marktteilnehmer.json>`_
 */
public class Marktteilnehmer extends Geschaeftsobjekt {
    private final Typ _typ = Typ.MARKTTEILNEHMER;
    private Geschaeftspartner geschaeftspartner;
    private String[] makoadresse;
    private Marktrolle marktrolle;
    private String rollencodenummer;
    private Rollencodetyp rollencodetyp;
    private Sparte sparte;

    public Typ getTyp() { return _typ; }

    public Geschaeftspartner getGeschaeftspartner() { return geschaeftspartner; }
    public void setGeschaeftspartner(Geschaeftspartner value) { this.geschaeftspartner = value; }

    public String[] getMakoadresse() { return makoadresse; }
    public void setMakoadresse(String[] value) { this.makoadresse = value; }

    public Marktrolle getMarktrolle() { return marktrolle; }
    public void setMarktrolle(Marktrolle value) { this.marktrolle = value; }

    public String getRollencodenummer() { return rollencodenummer; }
    public void setRollencodenummer(String value) { this.rollencodenummer = value; }

    public Rollencodetyp getRollencodetyp() { return rollencodetyp; }
    public void setRollencodetyp(Rollencodetyp value) { this.rollencodetyp = value; }

    public Sparte getSparte() { return sparte; }
    public void setSparte(Sparte value) { this.sparte = value; }

}
