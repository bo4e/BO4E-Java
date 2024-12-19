package bo4e.com;

import bo4e.ZusatzAttribut;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.List;

/**
* Abbildung für einen Vertragsteil. Der Vertragsteil wird dazu verwendet,
* eine vertragliche Leistung in Bezug zu einer Lokation (Markt- oder Messlokation)
* festzulegen.
*
* .. raw:: html
*
* <object data="../_static/images/bo4e/com/Vertragsteil.svg"
* type="image/svg+xml"></object>
*
* .. HINT::
* `Vertragsteil JSON Schema
* <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/com/Vertragsteil.json>`_
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Vertragsteil extends COM {
    private String lokation;
    private Menge maximaleAbnahmemenge;
    private Menge minimaleAbnahmemenge;
    private Menge vertraglichFixierteMenge;
    private OffsetDateTime vertragsteilbeginn;
    private OffsetDateTime vertragsteilende;

    public Vertragsteil() {
    }

    private Vertragsteil(VertragsteilBuilder builder) {
        super(builder);
        this.lokation = builder.lokation;
        this.maximaleAbnahmemenge = builder.maximaleAbnahmemenge;
        this.minimaleAbnahmemenge = builder.minimaleAbnahmemenge;
        this.vertraglichFixierteMenge = builder.vertraglichFixierteMenge;
        this.vertragsteilbeginn = builder.vertragsteilbeginn;
        this.vertragsteilende = builder.vertragsteilende;
    }

    /**
    * Der Identifier für diejenigen Markt- oder Messlokation, die zu diesem Vertragsteil
    * gehören.
    * Verträge für mehrere Lokationen werden mit mehreren Vertragsteilen abgebildet
    */
    public String getLokation() {
        return lokation;
    }

    /**
    * Der Identifier für diejenigen Markt- oder Messlokation, die zu diesem Vertragsteil
    * gehören.
    * Verträge für mehrere Lokationen werden mit mehreren Vertragsteilen abgebildet
    */
    public void setLokation(String lokation) {
        this.lokation = lokation;
    }

    /**
    * Für die Lokation festgelegte maximale Abnahmemenge (exklusiv)
    */
    public Menge getMaximaleAbnahmemenge() {
        return maximaleAbnahmemenge;
    }

    /**
    * Für die Lokation festgelegte maximale Abnahmemenge (exklusiv)
    */
    public void setMaximaleAbnahmemenge(Menge maximaleAbnahmemenge) {
        this.maximaleAbnahmemenge = maximaleAbnahmemenge;
    }

    /**
    * Für die Lokation festgelegte Mindestabnahmemenge (inklusiv)
    */
    public Menge getMinimaleAbnahmemenge() {
        return minimaleAbnahmemenge;
    }

    /**
    * Für die Lokation festgelegte Mindestabnahmemenge (inklusiv)
    */
    public void setMinimaleAbnahmemenge(Menge minimaleAbnahmemenge) {
        this.minimaleAbnahmemenge = minimaleAbnahmemenge;
    }

    /**
    * Für die Lokation festgeschriebene Abnahmemenge
    */
    public Menge getVertraglichFixierteMenge() {
        return vertraglichFixierteMenge;
    }

    /**
    * Für die Lokation festgeschriebene Abnahmemenge
    */
    public void setVertraglichFixierteMenge(Menge vertraglichFixierteMenge) {
        this.vertraglichFixierteMenge = vertraglichFixierteMenge;
    }

    /**
    * Start der Gültigkeit des Vertragsteils (inklusiv)
    */
    public OffsetDateTime getVertragsteilbeginn() {
        return vertragsteilbeginn;
    }

    /**
    * Start der Gültigkeit des Vertragsteils (inklusiv)
    */
    public void setVertragsteilbeginn(OffsetDateTime vertragsteilbeginn) {
        this.vertragsteilbeginn = vertragsteilbeginn;
    }

    /**
    * Ende der Gültigkeit des Vertragsteils (exklusiv)
    */
    public OffsetDateTime getVertragsteilende() {
        return vertragsteilende;
    }

    /**
    * Ende der Gültigkeit des Vertragsteils (exklusiv)
    */
    public void setVertragsteilende(OffsetDateTime vertragsteilende) {
        this.vertragsteilende = vertragsteilende;
    }

    public static VertragsteilBuilder builder() {
        return new VertragsteilBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class VertragsteilBuilder extends COMBuilder {
        private String lokation;
        private Menge maximaleAbnahmemenge;
        private Menge minimaleAbnahmemenge;
        private Menge vertraglichFixierteMenge;
        private OffsetDateTime vertragsteilbeginn;
        private OffsetDateTime vertragsteilende;

        private VertragsteilBuilder() {
        }

        /**
        * Der Identifier für diejenigen Markt- oder Messlokation, die zu diesem Vertragsteil
        * gehören.
        * Verträge für mehrere Lokationen werden mit mehreren Vertragsteilen abgebildet
        */
        public VertragsteilBuilder setLokation(String lokation) {
            this.lokation = lokation;
            return this;
        }

        /**
        * Für die Lokation festgelegte maximale Abnahmemenge (exklusiv)
        */
        public VertragsteilBuilder setMaximaleAbnahmemenge(Menge maximaleAbnahmemenge) {
            this.maximaleAbnahmemenge = maximaleAbnahmemenge;
            return this;
        }

        /**
        * Für die Lokation festgelegte Mindestabnahmemenge (inklusiv)
        */
        public VertragsteilBuilder setMinimaleAbnahmemenge(Menge minimaleAbnahmemenge) {
            this.minimaleAbnahmemenge = minimaleAbnahmemenge;
            return this;
        }

        /**
        * Für die Lokation festgeschriebene Abnahmemenge
        */
        public VertragsteilBuilder setVertraglichFixierteMenge(Menge vertraglichFixierteMenge) {
            this.vertraglichFixierteMenge = vertraglichFixierteMenge;
            return this;
        }

        /**
        * Start der Gültigkeit des Vertragsteils (inklusiv)
        */
        public VertragsteilBuilder setVertragsteilbeginn(OffsetDateTime vertragsteilbeginn) {
            this.vertragsteilbeginn = vertragsteilbeginn;
            return this;
        }

        /**
        * Ende der Gültigkeit des Vertragsteils (exklusiv)
        */
        public VertragsteilBuilder setVertragsteilende(OffsetDateTime vertragsteilende) {
            this.vertragsteilende = vertragsteilende;
            return this;
        }

        public VertragsteilBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public VertragsteilBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Vertragsteil build() {
            return new Vertragsteil(this);
        }
    }
}