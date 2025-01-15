package bo4e.bo;

import bo4e.ZusatzAttribut;
import bo4e.com.Verbrauch;
import bo4e.enums.Lokationstyp;
import bo4e.enums.Typ;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Abbildung von Mengen, die Lokationen zugeordnet sind
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Energiemenge.svg" type="image/svg+xml"></object>
*
* .. HINT::
* `Energiemenge JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/bo/Energiemenge.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Energiemenge extends Geschaeftsobjekt {
    private final Typ _typ = Typ.ENERGIEMENGE;
    private List<Verbrauch> energieverbrauch;
    private String lokationsId;
    private Lokationstyp lokationstyp;

    public Energiemenge() {
    }

    private Energiemenge(EnergiemengeBuilder builder) {
        super(builder);
        this.energieverbrauch = builder.energieverbrauch;
        this.lokationsId = builder.lokationsId;
        this.lokationstyp = builder.lokationstyp;
    }

    public Typ get_typ() {
        return _typ;
    }

    /**
    * Gibt den Verbrauch in einer Zeiteinheit an
    */
    public List<Verbrauch> getEnergieverbrauch() {
        return energieverbrauch;
    }

    /**
    * Gibt den Verbrauch in einer Zeiteinheit an
    */
    public void setEnergieverbrauch(List<Verbrauch> energieverbrauch) {
        this.energieverbrauch = energieverbrauch;
    }

    /**
    * Eindeutige Nummer der Marktlokation bzw. der Messlokation, zu der die Energiemenge gehört
    */
    public String getLokationsId() {
        return lokationsId;
    }

    /**
    * Eindeutige Nummer der Marktlokation bzw. der Messlokation, zu der die Energiemenge gehört
    */
    public void setLokationsId(String lokationsId) {
        this.lokationsId = lokationsId;
    }

    /**
    * Gibt an, ob es sich um eine Markt- oder Messlokation handelt
    */
    public Lokationstyp getLokationstyp() {
        return lokationstyp;
    }

    /**
    * Gibt an, ob es sich um eine Markt- oder Messlokation handelt
    */
    public void setLokationstyp(Lokationstyp lokationstyp) {
        this.lokationstyp = lokationstyp;
    }

    public static EnergiemengeBuilder builder() {
        return new EnergiemengeBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class EnergiemengeBuilder extends GeschaeftsobjektBuilder {
        private List<Verbrauch> energieverbrauch;
        private String lokationsId;
        private Lokationstyp lokationstyp;

        private EnergiemengeBuilder() {
        }

        /**
        * Gibt den Verbrauch in einer Zeiteinheit an
        */
        public EnergiemengeBuilder setEnergieverbrauch(List<Verbrauch> energieverbrauch) {
            this.energieverbrauch = energieverbrauch;
            return this;
        }

        /**
        * Eindeutige Nummer der Marktlokation bzw. der Messlokation, zu der die Energiemenge gehört
        */
        public EnergiemengeBuilder setLokationsId(String lokationsId) {
            this.lokationsId = lokationsId;
            return this;
        }

        /**
        * Gibt an, ob es sich um eine Markt- oder Messlokation handelt
        */
        public EnergiemengeBuilder setLokationstyp(Lokationstyp lokationstyp) {
            this.lokationstyp = lokationstyp;
            return this;
        }

        public EnergiemengeBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public EnergiemengeBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Energiemenge build() {
            return new Energiemenge(this);
        }
    }
}