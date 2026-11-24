package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import bo4e.enums.Zahlungsart;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Mit dieser Komponente kann eine einzelne Zahlungsinformation dargestellt werden.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Zahlungsinformation.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Zahlungsinformation JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202601.0.0/src/bo4e_schemas/com/Zahlungsinformation.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Zahlungsinformation extends COM {
    private final ComTyp _typ = ComTyp.ZAHLUNGSINFORMATION;
    private String betreff;
    private String bic;
    private String iban;
    private String kontoinhaber;
    private String sepaReferenz;
    private Zahlungsart zahlungsart;

    public Zahlungsinformation() {
    }

    private Zahlungsinformation(ZahlungsinformationBuilder builder) {
        super(builder);
        this.betreff = builder.betreff;
        this.bic = builder.bic;
        this.iban = builder.iban;
        this.kontoinhaber = builder.kontoinhaber;
        this.sepaReferenz = builder.sepaReferenz;
        this.zahlungsart = builder.zahlungsart;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    /**
    * Eine konstante Betreffzeile für Überweisungen
    */
    public String getBetreff() {
        return betreff;
    }

    /**
    * Eine konstante Betreffzeile für Überweisungen
    */
    public void setBetreff(String betreff) {
        this.betreff = betreff;
    }

    /**
    * Eine BIC-Nummer
    */
    public String getBic() {
        return bic;
    }

    /**
    * Eine BIC-Nummer
    */
    public void setBic(String bic) {
        this.bic = bic;
    }

    /**
    * Eine IBAN-Nummer
    */
    public String getIban() {
        return iban;
    }

    /**
    * Eine IBAN-Nummer
    */
    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
    * Der Name des Kontoinhabers
    */
    public String getKontoinhaber() {
        return kontoinhaber;
    }

    /**
    * Der Name des Kontoinhabers
    */
    public void setKontoinhaber(String kontoinhaber) {
        this.kontoinhaber = kontoinhaber;
    }

    /**
    * Eine SEPA-Referenz
    */
    public String getSepaReferenz() {
        return sepaReferenz;
    }

    /**
    * Eine SEPA-Referenz
    */
    public void setSepaReferenz(String sepaReferenz) {
        this.sepaReferenz = sepaReferenz;
    }

    /**
    * Die Zahlungsart dieser Zahlungsinformation
    */
    public Zahlungsart getZahlungsart() {
        return zahlungsart;
    }

    /**
    * Die Zahlungsart dieser Zahlungsinformation
    */
    public void setZahlungsart(Zahlungsart zahlungsart) {
        this.zahlungsart = zahlungsart;
    }

    public static ZahlungsinformationBuilder builder() {
        return new ZahlungsinformationBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ZahlungsinformationBuilder extends COMBuilder {
        private String betreff;
        private String bic;
        private String iban;
        private String kontoinhaber;
        private String sepaReferenz;
        private Zahlungsart zahlungsart;

        private ZahlungsinformationBuilder() {
        }

        /**
        * Eine konstante Betreffzeile für Überweisungen
        */
        public ZahlungsinformationBuilder setBetreff(String betreff) {
            this.betreff = betreff;
            return this;
        }

        /**
        * Eine BIC-Nummer
        */
        public ZahlungsinformationBuilder setBic(String bic) {
            this.bic = bic;
            return this;
        }

        /**
        * Eine IBAN-Nummer
        */
        public ZahlungsinformationBuilder setIban(String iban) {
            this.iban = iban;
            return this;
        }

        /**
        * Der Name des Kontoinhabers
        */
        public ZahlungsinformationBuilder setKontoinhaber(String kontoinhaber) {
            this.kontoinhaber = kontoinhaber;
            return this;
        }

        /**
        * Eine SEPA-Referenz
        */
        public ZahlungsinformationBuilder setSepaReferenz(String sepaReferenz) {
            this.sepaReferenz = sepaReferenz;
            return this;
        }

        /**
        * Die Zahlungsart dieser Zahlungsinformation
        */
        public ZahlungsinformationBuilder setZahlungsart(Zahlungsart zahlungsart) {
            this.zahlungsart = zahlungsart;
            return this;
        }

        public ZahlungsinformationBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public ZahlungsinformationBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Zahlungsinformation build() {
            return new Zahlungsinformation(this);
        }
    }
}