package bo4e.com;

import bo4e.ZusatzAttribut;
import bo4e.enums.ComTyp;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.List;

/**
* Dient zur Identifizierung eines vorausgezahlten Betrags.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Vorauszahlung.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Vorauszahlung JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202601.0.0/src/bo4e_schemas/com/Vorauszahlung.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Vorauszahlung extends COM {
    private final ComTyp _typ = ComTyp.VORAUSZAHLUNG;
    private Betrag betrag;
    private OffsetDateTime datum;
    private String referenz;

    public Vorauszahlung() {
    }

    private Vorauszahlung(VorauszahlungBuilder builder) {
        super(builder);
        this.betrag = builder.betrag;
        this.datum = builder.datum;
        this.referenz = builder.referenz;
    }

    public ComTyp get_typ() {
        return _typ;
    }

    public Betrag getBetrag() {
        return betrag;
    }

    public void setBetrag(Betrag betrag) {
        this.betrag = betrag;
    }

    public OffsetDateTime getDatum() {
        return datum;
    }

    public void setDatum(OffsetDateTime datum) {
        this.datum = datum;
    }

    public String getReferenz() {
        return referenz;
    }

    public void setReferenz(String referenz) {
        this.referenz = referenz;
    }

    public static VorauszahlungBuilder builder() {
        return new VorauszahlungBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class VorauszahlungBuilder extends COMBuilder {
        private Betrag betrag;
        private OffsetDateTime datum;
        private String referenz;

        private VorauszahlungBuilder() {
        }

        public VorauszahlungBuilder setBetrag(Betrag betrag) {
            this.betrag = betrag;
            return this;
        }

        public VorauszahlungBuilder setDatum(OffsetDateTime datum) {
            this.datum = datum;
            return this;
        }

        public VorauszahlungBuilder setReferenz(String referenz) {
            this.referenz = referenz;
            return this;
        }

        public VorauszahlungBuilder set_id(String _id) {
            super.set_id(_id);
            return this;
        }

        public VorauszahlungBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Vorauszahlung build() {
            return new Vorauszahlung(this);
        }
    }
}