package bo4e.com;

import bo4e.ZusatzAttribut;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.OffsetDateTime;
import java.util.List;

/**
 * Eine Zeitspanne ist definiert aus Start und/oder Ende.
 * Der Unterschied zur Menge (die auch zur Abbildung von Zeitmengen genutzt wird) ist, dass
 * konkrete Start- und Endzeitpunkte angegeben werden.
 * Die Zeitspanne ist aus dem COM Zeitraum hervorgegangen, das in Zeitspanne und Menge
 * aufgeteilt wurde.
 *
 * .. raw:: html
 *
 * <object data="../_static/images/bo4e/com/Zeitspanne.svg" type="image/svg+xml"></object>
 *
 * .. HINT::
 * `Zeitspanne JSON Schema
 * <https://json-schema.app/view/%23?url=https://raw.githubusercontent.com/BO4E/BO4E-Schemas/v202401.4.0/src/bo4e_schemas/com/Zeitspanne.json>`_
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Zeitspanne extends COM {
    private OffsetDateTime ende;
    private OffsetDateTime start;

    public Zeitspanne() {
    }

    private Zeitspanne(ZeitspanneBuilder builder) {
        super(builder);
        this.ende = builder.ende;
        this.start = builder.start;
    }

    /**
     * inklusiver Beginn
     */
    public OffsetDateTime getEnde() {
        return ende;
    }

    /**
     * inklusiver Beginn
     */
    public void setEnde(OffsetDateTime ende) {
        this.ende = ende;
    }

    /**
     * inklusiver Beginn
     */
    public OffsetDateTime getStart() {
        return start;
    }

    /**
     * inklusiver Beginn
     */
    public void setStart(OffsetDateTime start) {
        this.start = start;
    }

    public static ZeitspanneBuilder builder() {
        return new ZeitspanneBuilder();
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ZeitspanneBuilder extends COMBuilder {
        private OffsetDateTime ende;
        private OffsetDateTime start;

        private ZeitspanneBuilder() {
        }

        /**
         * inklusiver Beginn
         */
        public OffsetDateTime getEnde() {
            return ende;
        }

        /**
         * inklusiver Beginn
         */
        public ZeitspanneBuilder setEnde(OffsetDateTime ende) {
            this.ende = ende;
            return this;
        }

        /**
         * inklusiver Beginn
         */
        public OffsetDateTime getStart() {
            return start;
        }

        /**
         * inklusiver Beginn
         */
        public ZeitspanneBuilder setStart(OffsetDateTime start) {
            this.start = start;
            return this;
        }

        public ZeitspanneBuilder setId(String id) {
            super.setId(id);
            return this;
        }

        public ZeitspanneBuilder setZusatzAttribute(List<ZusatzAttribut> zusatzAttribute) {
            super.setZusatzAttribute(zusatzAttribute);
            return this;
        }

        public Zeitspanne build() {
            return new Zeitspanne(this);
        }
    }
}