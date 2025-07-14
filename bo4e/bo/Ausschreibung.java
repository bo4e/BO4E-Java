package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Ausschreibungslos;
import bo4e.com.Zeitraum;
import bo4e.enums.Ausschreibungsportal;
import bo4e.enums.Ausschreibungsstatus;
import bo4e.enums.Ausschreibungstyp;
import bo4e.enums.BoTyp;

import java.time.OffsetDateTime;
import java.util.List;

/**
* Das BO Ausschreibung dient zur detaillierten Darstellung von ausgeschriebenen
* Energiemengen in der Energiewirtschaft
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Ausschreibung.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Ausschreibung JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.1.0-rc1/src/bo4e_schemas/bo/Ausschreibung.json>`_
*/
public class Ausschreibung extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.AUSSCHREIBUNG;
    private Zeitraum abgabefrist;
    private Geschaeftspartner ausschreibender;
    private Ausschreibungsportal ausschreibungportal;
    private String ausschreibungsnummer;
    private Ausschreibungsstatus ausschreibungsstatus;
    private Ausschreibungstyp ausschreibungstyp;
    private Zeitraum bindefrist;
    private Boolean istKostenpflichtig;
    private List<Ausschreibungslos> lose;
    private OffsetDateTime veroeffentlichungszeitpunkt;
    private String webseite;

    public Ausschreibung() {
    }

    private Ausschreibung(AusschreibungBuilder builder) {
        super(builder);
        this.abgabefrist = builder.abgabefrist;
        this.ausschreibender = builder.ausschreibender;
        this.ausschreibungportal = builder.ausschreibungportal;
        this.ausschreibungsnummer = builder.ausschreibungsnummer;
        this.ausschreibungsstatus = builder.ausschreibungsstatus;
        this.ausschreibungstyp = builder.ausschreibungstyp;
        this.bindefrist = builder.bindefrist;
        this.istKostenpflichtig = builder.istKostenpflichtig;
        this.lose = builder.lose;
        this.veroeffentlichungszeitpunkt = builder.veroeffentlichungszeitpunkt;
        this.webseite = builder.webseite;
    }

    public BoTyp get_typ() {
        return _typ;
    }

    /**
    * Diese Komponente wird zur Abbildung von Zeiträumen in Form von Dauern oder der Angabe von
    * Start und Ende verwendet.
    * Es muss daher entweder eine Dauer oder ein Zeitraum in Form von Start und Ende angegeben
    * sein
    */
    public Zeitraum getAbgabefrist() {
        return abgabefrist;
    }

    /**
    * Diese Komponente wird zur Abbildung von Zeiträumen in Form von Dauern oder der Angabe von
    * Start und Ende verwendet.
    * Es muss daher entweder eine Dauer oder ein Zeitraum in Form von Start und Ende angegeben
    * sein
    */
    public void setAbgabefrist(Zeitraum abgabefrist) {
        this.abgabefrist = abgabefrist;
    }

    /**
    * Mit diesem Objekt können Geschäftspartner übertragen werden.
    * Sowohl Unternehmen, als auch Privatpersonen können Geschäftspartner sein
    */
    public Geschaeftspartner getAusschreibender() {
        return ausschreibender;
    }

    /**
    * Mit diesem Objekt können Geschäftspartner übertragen werden.
    * Sowohl Unternehmen, als auch Privatpersonen können Geschäftspartner sein
    */
    public void setAusschreibender(Geschaeftspartner ausschreibender) {
        this.ausschreibender = ausschreibender;
    }

    /**
    * Aufzählung der unterstützten Ausschreibungsportale
    */
    public Ausschreibungsportal getAusschreibungportal() {
        return ausschreibungportal;
    }

    /**
    * Aufzählung der unterstützten Ausschreibungsportale
    */
    public void setAusschreibungportal(Ausschreibungsportal ausschreibungportal) {
        this.ausschreibungportal = ausschreibungportal;
    }

    /**
    * Vom Herausgeber der Ausschreibung vergebene eindeutige Nummer
    */
    public String getAusschreibungsnummer() {
        return ausschreibungsnummer;
    }

    /**
    * Vom Herausgeber der Ausschreibung vergebene eindeutige Nummer
    */
    public void setAusschreibungsnummer(String ausschreibungsnummer) {
        this.ausschreibungsnummer = ausschreibungsnummer;
    }

    /**
    * Bezeichnungen für die Ausschreibungsphasen
    */
    public Ausschreibungsstatus getAusschreibungsstatus() {
        return ausschreibungsstatus;
    }

    /**
    * Bezeichnungen für die Ausschreibungsphasen
    */
    public void setAusschreibungsstatus(Ausschreibungsstatus ausschreibungsstatus) {
        this.ausschreibungsstatus = ausschreibungsstatus;
    }

    /**
    * Aufzählung für die Typisierung von Ausschreibungen
    */
    public Ausschreibungstyp getAusschreibungstyp() {
        return ausschreibungstyp;
    }

    /**
    * Aufzählung für die Typisierung von Ausschreibungen
    */
    public void setAusschreibungstyp(Ausschreibungstyp ausschreibungstyp) {
        this.ausschreibungstyp = ausschreibungstyp;
    }

    /**
    * Diese Komponente wird zur Abbildung von Zeiträumen in Form von Dauern oder der Angabe von
    * Start und Ende verwendet.
    * Es muss daher entweder eine Dauer oder ein Zeitraum in Form von Start und Ende angegeben
    * sein
    */
    public Zeitraum getBindefrist() {
        return bindefrist;
    }

    /**
    * Diese Komponente wird zur Abbildung von Zeiträumen in Form von Dauern oder der Angabe von
    * Start und Ende verwendet.
    * Es muss daher entweder eine Dauer oder ein Zeitraum in Form von Start und Ende angegeben
    * sein
    */
    public void setBindefrist(Zeitraum bindefrist) {
        this.bindefrist = bindefrist;
    }

    /**
    * Kennzeichen, ob die Ausschreibung kostenpflichtig ist
    */
    public Boolean getIstKostenpflichtig() {
        return istKostenpflichtig;
    }

    /**
    * Kennzeichen, ob die Ausschreibung kostenpflichtig ist
    */
    public void setIstKostenpflichtig(Boolean istKostenpflichtig) {
        this.istKostenpflichtig = istKostenpflichtig;
    }

    /**
    * Die einzelnen Lose, aus denen sich die Ausschreibung zusammensetzt
    */
    public List<Ausschreibungslos> getLose() {
        return lose;
    }

    /**
    * Die einzelnen Lose, aus denen sich die Ausschreibung zusammensetzt
    */
    public void setLose(List<Ausschreibungslos> lose) {
        this.lose = lose;
    }

    /**
    * Gibt den Veröffentlichungszeitpunkt der Ausschreibung an
    */
    public OffsetDateTime getVeroeffentlichungszeitpunkt() {
        return veroeffentlichungszeitpunkt;
    }

    /**
    * Gibt den Veröffentlichungszeitpunkt der Ausschreibung an
    */
    public void setVeroeffentlichungszeitpunkt(OffsetDateTime veroeffentlichungszeitpunkt) {
        this.veroeffentlichungszeitpunkt = veroeffentlichungszeitpunkt;
    }

    /**
    * Internetseite, auf der die Ausschreibung veröffentlicht wurde (falls vorhanden)
    */
    public String getWebseite() {
        return webseite;
    }

    /**
    * Internetseite, auf der die Ausschreibung veröffentlicht wurde (falls vorhanden)
    */
    public void setWebseite(String webseite) {
        this.webseite = webseite;
    }

    public static AusschreibungBuilder builder() {
        return new AusschreibungBuilder();
    }

    public static class AusschreibungBuilder extends GeschaeftsobjektBuilder {
        private Zeitraum abgabefrist;
        private Geschaeftspartner ausschreibender;
        private Ausschreibungsportal ausschreibungportal;
        private String ausschreibungsnummer;
        private Ausschreibungsstatus ausschreibungsstatus;
        private Ausschreibungstyp ausschreibungstyp;
        private Zeitraum bindefrist;
        private Boolean istKostenpflichtig;
        private List<Ausschreibungslos> lose;
        private OffsetDateTime veroeffentlichungszeitpunkt;
        private String webseite;

        private AusschreibungBuilder() {
        }

        /**
        * Diese Komponente wird zur Abbildung von Zeiträumen in Form von Dauern oder der Angabe von
        * Start und Ende verwendet.
        * Es muss daher entweder eine Dauer oder ein Zeitraum in Form von Start und Ende angegeben
        * sein
        */
        public AusschreibungBuilder setAbgabefrist(Zeitraum abgabefrist) {
            this.abgabefrist = abgabefrist;
            return this;
        }

        /**
        * Mit diesem Objekt können Geschäftspartner übertragen werden.
        * Sowohl Unternehmen, als auch Privatpersonen können Geschäftspartner sein
        */
        public AusschreibungBuilder setAusschreibender(Geschaeftspartner ausschreibender) {
            this.ausschreibender = ausschreibender;
            return this;
        }

        /**
        * Aufzählung der unterstützten Ausschreibungsportale
        */
        public AusschreibungBuilder setAusschreibungportal(Ausschreibungsportal ausschreibungportal) {
            this.ausschreibungportal = ausschreibungportal;
            return this;
        }

        /**
        * Vom Herausgeber der Ausschreibung vergebene eindeutige Nummer
        */
        public AusschreibungBuilder setAusschreibungsnummer(String ausschreibungsnummer) {
            this.ausschreibungsnummer = ausschreibungsnummer;
            return this;
        }

        /**
        * Bezeichnungen für die Ausschreibungsphasen
        */
        public AusschreibungBuilder setAusschreibungsstatus(Ausschreibungsstatus ausschreibungsstatus) {
            this.ausschreibungsstatus = ausschreibungsstatus;
            return this;
        }

        /**
        * Aufzählung für die Typisierung von Ausschreibungen
        */
        public AusschreibungBuilder setAusschreibungstyp(Ausschreibungstyp ausschreibungstyp) {
            this.ausschreibungstyp = ausschreibungstyp;
            return this;
        }

        /**
        * Diese Komponente wird zur Abbildung von Zeiträumen in Form von Dauern oder der Angabe von
        * Start und Ende verwendet.
        * Es muss daher entweder eine Dauer oder ein Zeitraum in Form von Start und Ende angegeben
        * sein
        */
        public AusschreibungBuilder setBindefrist(Zeitraum bindefrist) {
            this.bindefrist = bindefrist;
            return this;
        }

        /**
        * Kennzeichen, ob die Ausschreibung kostenpflichtig ist
        */
        public AusschreibungBuilder setIstKostenpflichtig(Boolean istKostenpflichtig) {
            this.istKostenpflichtig = istKostenpflichtig;
            return this;
        }

        /**
        * Die einzelnen Lose, aus denen sich die Ausschreibung zusammensetzt
        */
        public AusschreibungBuilder setLose(List<Ausschreibungslos> lose) {
            this.lose = lose;
            return this;
        }

        /**
        * Gibt den Veröffentlichungszeitpunkt der Ausschreibung an
        */
        public AusschreibungBuilder setVeroeffentlichungszeitpunkt(OffsetDateTime veroeffentlichungszeitpunkt) {
            this.veroeffentlichungszeitpunkt = veroeffentlichungszeitpunkt;
            return this;
        }

        /**
        * Internetseite, auf der die Ausschreibung veröffentlicht wurde (falls vorhanden)
        */
        public AusschreibungBuilder setWebseite(String webseite) {
            this.webseite = webseite;
            return this;
        }

        public AusschreibungBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public AusschreibungBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Ausschreibung build() {
            return new Ausschreibung(this);
        }
    }
}