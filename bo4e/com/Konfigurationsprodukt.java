package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.bo.Marktteilnehmer;
import bo4e.enums.ComTyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
* Object containing information about a Konfigurationsprodukt
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/bo/Konfigurationsprodukt.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Konfigurationsprodukt JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202501.0.0/src/bo4e_schemas/bo/Konfigurationsprodukt.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Konfigurationsprodukt extends COM {
    private final ComTyp _typ = ComTyp.KONFIGURATIONSPRODUKT;
    private String leistungskurvendefinition;
    private Marktteilnehmer marktpartner;
    private String produktcode;
    private String schaltzeitdefinition;

    public Konfigurationsprodukt() {
    }

    private Konfigurationsprodukt(KonfigurationsproduktBuilder builder) {
        super(builder);
        this.leistungskurvendefinition = builder.leistungskurvendefinition;
        this.marktpartner = builder.marktpartner;
        this.produktcode = builder.produktcode;
        this.schaltzeitdefinition = builder.schaltzeitdefinition;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    public String getLeistungskurvendefinition() {
        return leistungskurvendefinition;
    }

    public void setLeistungskurvendefinition(String leistungskurvendefinition) {
        this.leistungskurvendefinition = leistungskurvendefinition;
    }

    public Marktteilnehmer getMarktpartner() {
        return marktpartner;
    }

    public void setMarktpartner(Marktteilnehmer marktpartner) {
        this.marktpartner = marktpartner;
    }

    public String getProduktcode() {
        return produktcode;
    }

    public void setProduktcode(String produktcode) {
        this.produktcode = produktcode;
    }

    public String getSchaltzeitdefinition() {
        return schaltzeitdefinition;
    }

    public void setSchaltzeitdefinition(String schaltzeitdefinition) {
        this.schaltzeitdefinition = schaltzeitdefinition;
    }

    public static KonfigurationsproduktBuilder builder() {
        return new KonfigurationsproduktBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class KonfigurationsproduktBuilder extends COMBuilder {
        private String leistungskurvendefinition;
        private Marktteilnehmer marktpartner;
        private String produktcode;
        private String schaltzeitdefinition;

        private KonfigurationsproduktBuilder() {
        }

        public KonfigurationsproduktBuilder setLeistungskurvendefinition(String leistungskurvendefinition) {
            this.leistungskurvendefinition = leistungskurvendefinition;
            return this;
        }

        public KonfigurationsproduktBuilder setMarktpartner(Marktteilnehmer marktpartner) {
            this.marktpartner = marktpartner;
            return this;
        }

        public KonfigurationsproduktBuilder setProduktcode(String produktcode) {
            this.produktcode = produktcode;
            return this;
        }

        public KonfigurationsproduktBuilder setSchaltzeitdefinition(String schaltzeitdefinition) {
            this.schaltzeitdefinition = schaltzeitdefinition;
            return this;
        }

        public KonfigurationsproduktBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public KonfigurationsproduktBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Konfigurationsprodukt build() {
            return new Konfigurationsprodukt(this);
        }
    }
}