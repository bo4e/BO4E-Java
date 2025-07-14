package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.enums.BoTyp;
import bo4e.enums.Marktrolle;
import bo4e.enums.Rollencodetyp;
import bo4e.enums.Sparte;

import java.util.List;

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
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.1.0-rc1/src/bo4e_schemas/bo/Marktteilnehmer.json>`_
*/
public class Marktteilnehmer extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.MARKTTEILNEHMER;
    private Geschaeftspartner geschaeftspartner;
    private List<String> makoadresse;
    private Marktrolle marktrolle;
    private String rollencodenummer;
    private Rollencodetyp rollencodetyp;
    private Sparte sparte;

    public Marktteilnehmer() {
    }

    private Marktteilnehmer(MarktteilnehmerBuilder builder) {
        super(builder);
        this.geschaeftspartner = builder.geschaeftspartner;
        this.makoadresse = builder.makoadresse;
        this.marktrolle = builder.marktrolle;
        this.rollencodenummer = builder.rollencodenummer;
        this.rollencodetyp = builder.rollencodetyp;
        this.sparte = builder.sparte;
    }

    public BoTyp get_typ() {
        return _typ;
    }

    /**
    * Der zu diesem Marktteilnehmer gehörende Geschäftspartner
    */
    public Geschaeftspartner getGeschaeftspartner() {
        return geschaeftspartner;
    }

    /**
    * Der zu diesem Marktteilnehmer gehörende Geschäftspartner
    */
    public void setGeschaeftspartner(Geschaeftspartner geschaeftspartner) {
        this.geschaeftspartner = geschaeftspartner;
    }

    /**
    * Die 1:1-Kommunikationsadresse des Marktteilnehmers. Diese wird in der Marktkommunikation
    * verwendet. Konkret kann dies eine eMail-Adresse oder ein AS4-Endpunkt sein.
    */
    public List<String> getMakoadresse() {
        return makoadresse;
    }

    /**
    * Die 1:1-Kommunikationsadresse des Marktteilnehmers. Diese wird in der Marktkommunikation
    * verwendet. Konkret kann dies eine eMail-Adresse oder ein AS4-Endpunkt sein.
    */
    public void setMakoadresse(List<String> makoadresse) {
        this.makoadresse = makoadresse;
    }

    /**
    * Gibt im Klartext die Bezeichnung der Marktrolle an
    */
    public Marktrolle getMarktrolle() {
        return marktrolle;
    }

    /**
    * Gibt im Klartext die Bezeichnung der Marktrolle an
    */
    public void setMarktrolle(Marktrolle marktrolle) {
        this.marktrolle = marktrolle;
    }

    /**
    * Gibt die Codenummer der Marktrolle an
    */
    public String getRollencodenummer() {
        return rollencodenummer;
    }

    /**
    * Gibt die Codenummer der Marktrolle an
    */
    public void setRollencodenummer(String rollencodenummer) {
        this.rollencodenummer = rollencodenummer;
    }

    /**
    * Gibt den Typ des Codes an
    */
    public Rollencodetyp getRollencodetyp() {
        return rollencodetyp;
    }

    /**
    * Gibt den Typ des Codes an
    */
    public void setRollencodetyp(Rollencodetyp rollencodetyp) {
        this.rollencodetyp = rollencodetyp;
    }

    /**
    * Sparte des Marktteilnehmers, z.B. Gas oder Strom
    */
    public Sparte getSparte() {
        return sparte;
    }

    /**
    * Sparte des Marktteilnehmers, z.B. Gas oder Strom
    */
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    public static MarktteilnehmerBuilder builder() {
        return new MarktteilnehmerBuilder();
    }

    public static class MarktteilnehmerBuilder extends GeschaeftsobjektBuilder {
        private Geschaeftspartner geschaeftspartner;
        private List<String> makoadresse;
        private Marktrolle marktrolle;
        private String rollencodenummer;
        private Rollencodetyp rollencodetyp;
        private Sparte sparte;

        private MarktteilnehmerBuilder() {
        }

        /**
        * Der zu diesem Marktteilnehmer gehörende Geschäftspartner
        */
        public MarktteilnehmerBuilder setGeschaeftspartner(Geschaeftspartner geschaeftspartner) {
            this.geschaeftspartner = geschaeftspartner;
            return this;
        }

        /**
        * Die 1:1-Kommunikationsadresse des Marktteilnehmers. Diese wird in der Marktkommunikation
        * verwendet. Konkret kann dies eine eMail-Adresse oder ein AS4-Endpunkt sein.
        */
        public MarktteilnehmerBuilder setMakoadresse(List<String> makoadresse) {
            this.makoadresse = makoadresse;
            return this;
        }

        /**
        * Gibt im Klartext die Bezeichnung der Marktrolle an
        */
        public MarktteilnehmerBuilder setMarktrolle(Marktrolle marktrolle) {
            this.marktrolle = marktrolle;
            return this;
        }

        /**
        * Gibt die Codenummer der Marktrolle an
        */
        public MarktteilnehmerBuilder setRollencodenummer(String rollencodenummer) {
            this.rollencodenummer = rollencodenummer;
            return this;
        }

        /**
        * Gibt den Typ des Codes an
        */
        public MarktteilnehmerBuilder setRollencodetyp(Rollencodetyp rollencodetyp) {
            this.rollencodetyp = rollencodetyp;
            return this;
        }

        /**
        * Sparte des Marktteilnehmers, z.B. Gas oder Strom
        */
        public MarktteilnehmerBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        public MarktteilnehmerBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public MarktteilnehmerBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Marktteilnehmer build() {
            return new Marktteilnehmer(this);
        }
    }
}