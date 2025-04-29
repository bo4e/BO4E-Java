package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;

import java.util.List;

/**
* Abbildung für Vertragskonditionen. Die Komponente wird sowohl im Vertrag als auch im
* Tarif verwendet.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Vertragskonditionen.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Vertragskonditionen JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.7.0/src/bo4e_schemas/com/Vertragskonditionen.json>`_
*/
public class Vertragskonditionen extends COM {
    private final ComTyp _typ = ComTyp.VERTRAGSKONDITIONEN;
    private Zeitraum abschlagszyklus;
    private Double anzahlAbschlaege;
    private String beschreibung;
    private Zeitraum kuendigungsfrist;
    private Zeitraum vertragslaufzeit;
    private Zeitraum vertragsverlaengerung;

    public Vertragskonditionen() {
    }

    private Vertragskonditionen(VertragskonditionenBuilder builder) {
        super(builder);
        this.abschlagszyklus = builder.abschlagszyklus;
        this.anzahlAbschlaege = builder.anzahlAbschlaege;
        this.beschreibung = builder.beschreibung;
        this.kuendigungsfrist = builder.kuendigungsfrist;
        this.vertragslaufzeit = builder.vertragslaufzeit;
        this.vertragsverlaengerung = builder.vertragsverlaengerung;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * In diesen Zyklen werden Abschläge gestellt. Alternativ kann auch die Anzahl in den
    * Konditionen angeben werden.
    */
    public Zeitraum getAbschlagszyklus() {
        return abschlagszyklus;
    }

    /**
    * In diesen Zyklen werden Abschläge gestellt. Alternativ kann auch die Anzahl in den
    * Konditionen angeben werden.
    */
    public void setAbschlagszyklus(Zeitraum abschlagszyklus) {
        this.abschlagszyklus = abschlagszyklus;
    }

    /**
    * Anzahl der vereinbarten Abschläge pro Jahr, z.B. 12
    */
    public Double getAnzahlAbschlaege() {
        return anzahlAbschlaege;
    }

    /**
    * Anzahl der vereinbarten Abschläge pro Jahr, z.B. 12
    */
    public void setAnzahlAbschlaege(Double anzahlAbschlaege) {
        this.anzahlAbschlaege = anzahlAbschlaege;
    }

    /**
    * Freitext zur Beschreibung der Konditionen, z.B. "Standardkonditionen Gas"
    */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
    * Freitext zur Beschreibung der Konditionen, z.B. "Standardkonditionen Gas"
    */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
    * Innerhalb dieser Frist kann der Vertrag gekündigt werden
    */
    public Zeitraum getKuendigungsfrist() {
        return kuendigungsfrist;
    }

    /**
    * Innerhalb dieser Frist kann der Vertrag gekündigt werden
    */
    public void setKuendigungsfrist(Zeitraum kuendigungsfrist) {
        this.kuendigungsfrist = kuendigungsfrist;
    }

    /**
    * Über diesen Zeitraum läuft der Vertrag
    */
    public Zeitraum getVertragslaufzeit() {
        return vertragslaufzeit;
    }

    /**
    * Über diesen Zeitraum läuft der Vertrag
    */
    public void setVertragslaufzeit(Zeitraum vertragslaufzeit) {
        this.vertragslaufzeit = vertragslaufzeit;
    }

    /**
    * Falls der Vertrag nicht gekündigt wird, verlängert er sich automatisch um die hier
    * angegebene Zeit
    */
    public Zeitraum getVertragsverlaengerung() {
        return vertragsverlaengerung;
    }

    /**
    * Falls der Vertrag nicht gekündigt wird, verlängert er sich automatisch um die hier
    * angegebene Zeit
    */
    public void setVertragsverlaengerung(Zeitraum vertragsverlaengerung) {
        this.vertragsverlaengerung = vertragsverlaengerung;
    }

    public static VertragskonditionenBuilder builder() {
        return new VertragskonditionenBuilder();
    }

    public static class VertragskonditionenBuilder extends COMBuilder {
        private Zeitraum abschlagszyklus;
        private Double anzahlAbschlaege;
        private String beschreibung;
        private Zeitraum kuendigungsfrist;
        private Zeitraum vertragslaufzeit;
        private Zeitraum vertragsverlaengerung;

        private VertragskonditionenBuilder() {
        }

        /**
        * In diesen Zyklen werden Abschläge gestellt. Alternativ kann auch die Anzahl in den
        * Konditionen angeben werden.
        */
        public VertragskonditionenBuilder setAbschlagszyklus(Zeitraum abschlagszyklus) {
            this.abschlagszyklus = abschlagszyklus;
            return this;
        }

        /**
        * Anzahl der vereinbarten Abschläge pro Jahr, z.B. 12
        */
        public VertragskonditionenBuilder setAnzahlAbschlaege(Double anzahlAbschlaege) {
            this.anzahlAbschlaege = anzahlAbschlaege;
            return this;
        }

        /**
        * Freitext zur Beschreibung der Konditionen, z.B. "Standardkonditionen Gas"
        */
        public VertragskonditionenBuilder setBeschreibung(String beschreibung) {
            this.beschreibung = beschreibung;
            return this;
        }

        /**
        * Innerhalb dieser Frist kann der Vertrag gekündigt werden
        */
        public VertragskonditionenBuilder setKuendigungsfrist(Zeitraum kuendigungsfrist) {
            this.kuendigungsfrist = kuendigungsfrist;
            return this;
        }

        /**
        * Über diesen Zeitraum läuft der Vertrag
        */
        public VertragskonditionenBuilder setVertragslaufzeit(Zeitraum vertragslaufzeit) {
            this.vertragslaufzeit = vertragslaufzeit;
            return this;
        }

        /**
        * Falls der Vertrag nicht gekündigt wird, verlängert er sich automatisch um die hier
        * angegebene Zeit
        */
        public VertragskonditionenBuilder setVertragsverlaengerung(Zeitraum vertragsverlaengerung) {
            this.vertragsverlaengerung = vertragsverlaengerung;
            return this;
        }

        public VertragskonditionenBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public VertragskonditionenBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Vertragskonditionen build() {
            return new Vertragskonditionen(this);
        }
    }
}