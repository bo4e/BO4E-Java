package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Menge;
import bo4e.com.Zeitreihenwert;
import bo4e.enums.BoTyp;
import bo4e.enums.Mengeneinheit;
import bo4e.enums.Sparte;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Modell zur Abbildung eines Lastganges;
* In diesem Modell werden die Messwerte mit einem vollständigen Zeitintervall
* (zeit_intervall_laenge) angegeben und es bietet daher eine hohe Flexibilität in der
* Übertragung jeglicher zeitlich veränderlicher Messgrössen.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Lastgang.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Lastgang JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.1.0-rc1/src/bo4e_schemas/bo/Lastgang.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Lastgang extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.LASTGANG;
    private Marktlokation marktlokation;
    private Mengeneinheit messgroesse;
    private Messlokation messlokation;
    private String obisKennzahl;
    private Sparte sparte;
    private String version;
    private List<Zeitreihenwert> werte;
    private Menge zeitIntervallLaenge;

    public Lastgang() {
    }

    private Lastgang(LastgangBuilder builder) {
        super(builder);
        this.marktlokation = builder.marktlokation;
        this.messgroesse = builder.messgroesse;
        this.messlokation = builder.messlokation;
        this.obisKennzahl = builder.obisKennzahl;
        this.sparte = builder.sparte;
        this.version = builder.version;
        this.werte = builder.werte;
        this.zeitIntervallLaenge = builder.zeitIntervallLaenge;
    }

    public BoTyp get_typ() {
        return _typ;
    }

    public Marktlokation getMarktlokation() {
        return marktlokation;
    }

    public void setMarktlokation(Marktlokation marktlokation) {
        this.marktlokation = marktlokation;
    }

    /**
    * Definition der gemessenen Größe anhand ihrer Einheit
    */
    public Mengeneinheit getMessgroesse() {
        return messgroesse;
    }

    /**
    * Definition der gemessenen Größe anhand ihrer Einheit
    */
    public void setMessgroesse(Mengeneinheit messgroesse) {
        this.messgroesse = messgroesse;
    }

    public Messlokation getMesslokation() {
        return messlokation;
    }

    public void setMesslokation(Messlokation messlokation) {
        this.messlokation = messlokation;
    }

    /**
    * Die OBIS-Kennzahl für den Wert, die festlegt, welche Größe mit dem Stand gemeldet wird,
    * z.B. '1-0:1.8.1'
    */
    public String getObisKennzahl() {
        return obisKennzahl;
    }

    /**
    * Die OBIS-Kennzahl für den Wert, die festlegt, welche Größe mit dem Stand gemeldet wird,
    * z.B. '1-0:1.8.1'
    */
    public void setObisKennzahl(String obisKennzahl) {
        this.obisKennzahl = obisKennzahl;
    }

    /**
    * Angabe, ob es sich um einen Gas- oder Stromlastgang handelt
    */
    public Sparte getSparte() {
        return sparte;
    }

    /**
    * Angabe, ob es sich um einen Gas- oder Stromlastgang handelt
    */
    public void setSparte(Sparte sparte) {
        this.sparte = sparte;
    }

    /**
    * Versionsnummer des Lastgangs
    */
    public String getVersion() {
        return version;
    }

    /**
    * Versionsnummer des Lastgangs
    */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
    * Die im Lastgang enthaltenen Messwerte
    */
    public List<Zeitreihenwert> getWerte() {
        return werte;
    }

    /**
    * Die im Lastgang enthaltenen Messwerte
    */
    public void setWerte(List<Zeitreihenwert> werte) {
        this.werte = werte;
    }

    public Menge getZeitIntervallLaenge() {
        return zeitIntervallLaenge;
    }

    public void setZeitIntervallLaenge(Menge zeitIntervallLaenge) {
        this.zeitIntervallLaenge = zeitIntervallLaenge;
    }

    public static LastgangBuilder builder() {
        return new LastgangBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class LastgangBuilder extends GeschaeftsobjektBuilder {
        private Marktlokation marktlokation;
        private Mengeneinheit messgroesse;
        private Messlokation messlokation;
        private String obisKennzahl;
        private Sparte sparte;
        private String version;
        private List<Zeitreihenwert> werte;
        private Menge zeitIntervallLaenge;

        private LastgangBuilder() {
        }

        public LastgangBuilder setMarktlokation(Marktlokation marktlokation) {
            this.marktlokation = marktlokation;
            return this;
        }

        /**
        * Definition der gemessenen Größe anhand ihrer Einheit
        */
        public LastgangBuilder setMessgroesse(Mengeneinheit messgroesse) {
            this.messgroesse = messgroesse;
            return this;
        }

        public LastgangBuilder setMesslokation(Messlokation messlokation) {
            this.messlokation = messlokation;
            return this;
        }

        /**
        * Die OBIS-Kennzahl für den Wert, die festlegt, welche Größe mit dem Stand gemeldet wird,
        * z.B. '1-0:1.8.1'
        */
        public LastgangBuilder setObisKennzahl(String obisKennzahl) {
            this.obisKennzahl = obisKennzahl;
            return this;
        }

        /**
        * Angabe, ob es sich um einen Gas- oder Stromlastgang handelt
        */
        public LastgangBuilder setSparte(Sparte sparte) {
            this.sparte = sparte;
            return this;
        }

        /**
        * Versionsnummer des Lastgangs
        */
        public LastgangBuilder setVersion(String version) {
            this.version = version;
            return this;
        }

        /**
        * Die im Lastgang enthaltenen Messwerte
        */
        public LastgangBuilder setWerte(List<Zeitreihenwert> werte) {
            this.werte = werte;
            return this;
        }

        public LastgangBuilder setZeitIntervallLaenge(Menge zeitIntervallLaenge) {
            this.zeitIntervallLaenge = zeitIntervallLaenge;
            return this;
        }

        public LastgangBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public LastgangBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Lastgang build() {
            return new Lastgang(this);
        }
    }
}