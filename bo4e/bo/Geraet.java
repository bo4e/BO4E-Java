package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.enums.BoTyp;
import bo4e.enums.Geraeteklasse;
import bo4e.enums.Geraetetyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Mit diesem BO werden alle Geräte modelliert, die keine Zähler sind.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Geraet.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Geraet JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.7.0/src/bo4e_schemas/bo/Geraet.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Geraet extends Geschaeftsobjekt {
    private final BoTyp _typ = BoTyp.GERAET;
    private String bezeichnung;
    private Geraeteklasse geraeteklasse;
    private String geraetenummer;
    private Geraetetyp geraetetyp;

    public Geraet() {
    }

    private Geraet(GeraetBuilder builder) {
        super(builder);
        this.bezeichnung = builder.bezeichnung;
        this.geraeteklasse = builder.geraeteklasse;
        this.geraetenummer = builder.geraetenummer;
        this.geraetetyp = builder.geraetetyp;
    }

    public BoTyp get_typ() {
        return _typ;
    }

    /**
    * Bezeichnung des Geräts
    */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
    * Bezeichnung des Geräts
    */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
    * Die übergreifende Klasse eines Geräts, beispielsweise Wandler
    */
    public Geraeteklasse getGeraeteklasse() {
        return geraeteklasse;
    }

    /**
    * Die übergreifende Klasse eines Geräts, beispielsweise Wandler
    */
    public void setGeraeteklasse(Geraeteklasse geraeteklasse) {
        this.geraeteklasse = geraeteklasse;
    }

    /**
    * Die auf dem Gerät aufgedruckte Nummer, die vom MSB vergeben wird.
    */
    public String getGeraetenummer() {
        return geraetenummer;
    }

    /**
    * Die auf dem Gerät aufgedruckte Nummer, die vom MSB vergeben wird.
    */
    public void setGeraetenummer(String geraetenummer) {
        this.geraetenummer = geraetenummer;
    }

    /**
    * Der speziellere Typ eines Gerätes, beispielsweise Stromwandler
    */
    public Geraetetyp getGeraetetyp() {
        return geraetetyp;
    }

    /**
    * Der speziellere Typ eines Gerätes, beispielsweise Stromwandler
    */
    public void setGeraetetyp(Geraetetyp geraetetyp) {
        this.geraetetyp = geraetetyp;
    }

    public static GeraetBuilder builder() {
        return new GeraetBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class GeraetBuilder extends GeschaeftsobjektBuilder {
        private String bezeichnung;
        private Geraeteklasse geraeteklasse;
        private String geraetenummer;
        private Geraetetyp geraetetyp;

        private GeraetBuilder() {
        }

        /**
        * Bezeichnung des Geräts
        */
        public GeraetBuilder setBezeichnung(String bezeichnung) {
            this.bezeichnung = bezeichnung;
            return this;
        }

        /**
        * Die übergreifende Klasse eines Geräts, beispielsweise Wandler
        */
        public GeraetBuilder setGeraeteklasse(Geraeteklasse geraeteklasse) {
            this.geraeteklasse = geraeteklasse;
            return this;
        }

        /**
        * Die auf dem Gerät aufgedruckte Nummer, die vom MSB vergeben wird.
        */
        public GeraetBuilder setGeraetenummer(String geraetenummer) {
            this.geraetenummer = geraetenummer;
            return this;
        }

        /**
        * Der speziellere Typ eines Gerätes, beispielsweise Stromwandler
        */
        public GeraetBuilder setGeraetetyp(Geraetetyp geraetetyp) {
            this.geraetetyp = geraetetyp;
            return this;
        }

        public GeraetBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public GeraetBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Geraet build() {
            return new Geraet(this);
        }
    }
}