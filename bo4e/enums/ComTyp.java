package bo4e.enums;

import java.io.IOException;

/**
 * Auflistung sämtlicher existierender Komponenten.
 *
 * .. HINT::
 * Die Unterscheidung zwischen Komponenten und Geschäftsobjekten ist, dass Komponenten immer
 * in einem Geschäftsobjekt enthalten sind.
 * Komponenten sind also immer Teil von einem Geschäftsobjekt und können nicht alleine
 * existieren.
 */
public enum ComTyp {
    ADRESSE, ANGEBOTSPOSITION, ANGEBOTSTEIL, ANGEBOTSVARIANTE, AUFABSCHLAG, AUFABSCHLAGPROORT, AUFABSCHLAGREGIONAL, AUFABSCHLAGSTAFFELPROORT, AUSSCHREIBUNGSDETAIL, AUSSCHREIBUNGSLOS, BETRAG, DIENSTLEISTUNG, ENERGIEHERKUNFT, ENERGIEMIX, FREMDKOSTENBLOCK, FREMDKOSTENPOSITION, GEOKOORDINATEN, KATASTERADRESSE, KONFIGURATIONSPRODUKT, KONTAKTWEG, KONZESSIONSABGABE, KOSTENBLOCK, KOSTENPOSITION, KRITERIUMWERT, LASTPROFIL, MARKTGEBIETINFO, MENGE, POSITIONSAUFABSCHLAG, PREIS, PREISGARANTIE, PREISPOSITION, PREISSTAFFEL, RECHNUNGSPOSITION, REGIONALEGUELTIGKEIT, REGIONALEPREISGARANTIE, REGIONALEPREISSTAFFEL, REGIONALERAUFABSCHLAG, REGIONALETARIFPREISPOSITION, REGIONSKRITERIUM, SIGMOIDPARAMETER, STANDORTEIGENSCHAFTENGAS, STANDORTEIGENSCHAFTENSTROM, STEUERBETRAG, TAGESPARAMETER, TARIFBERECHNUNGSPARAMETER, TARIFEINSCHRAENKUNG, TARIFPREIS, TARIFPREISPOSITION, TARIFPREISPOSITIONPROORT, TARIFPREISSTAFFELPROORT, UNTERSCHRIFT, VERBRAUCH, VERTRAGSKONDITIONEN, VERTRAGSTEIL, VERWENDUNGSZWECKPROMARKTROLLE, ZAEHLWERK, ZAEHLZEITREGISTER, ZEITRAUM, ZEITREIHENWERT, ZUSTAENDIGKEIT;

    public String toValue() {
        switch (this) {
            case ADRESSE: return "ADRESSE";
            case ANGEBOTSPOSITION: return "ANGEBOTSPOSITION";
            case ANGEBOTSTEIL: return "ANGEBOTSTEIL";
            case ANGEBOTSVARIANTE: return "ANGEBOTSVARIANTE";
            case AUFABSCHLAG: return "AUFABSCHLAG";
            case AUFABSCHLAGPROORT: return "AUFABSCHLAGPROORT";
            case AUFABSCHLAGREGIONAL: return "AUFABSCHLAGREGIONAL";
            case AUFABSCHLAGSTAFFELPROORT: return "AUFABSCHLAGSTAFFELPROORT";
            case AUSSCHREIBUNGSDETAIL: return "AUSSCHREIBUNGSDETAIL";
            case AUSSCHREIBUNGSLOS: return "AUSSCHREIBUNGSLOS";
            case BETRAG: return "BETRAG";
            case DIENSTLEISTUNG: return "DIENSTLEISTUNG";
            case ENERGIEHERKUNFT: return "ENERGIEHERKUNFT";
            case ENERGIEMIX: return "ENERGIEMIX";
            case FREMDKOSTENBLOCK: return "FREMDKOSTENBLOCK";
            case FREMDKOSTENPOSITION: return "FREMDKOSTENPOSITION";
            case GEOKOORDINATEN: return "GEOKOORDINATEN";
            case KATASTERADRESSE: return "KATASTERADRESSE";
            case KONFIGURATIONSPRODUKT: return "KONFIGURATIONSPRODUKT";
            case KONTAKTWEG: return "KONTAKTWEG";
            case KONZESSIONSABGABE: return "KONZESSIONSABGABE";
            case KOSTENBLOCK: return "KOSTENBLOCK";
            case KOSTENPOSITION: return "KOSTENPOSITION";
            case KRITERIUMWERT: return "KRITERIUMWERT";
            case LASTPROFIL: return "LASTPROFIL";
            case MARKTGEBIETINFO: return "MARKTGEBIETINFO";
            case MENGE: return "MENGE";
            case POSITIONSAUFABSCHLAG: return "POSITIONSAUFABSCHLAG";
            case PREIS: return "PREIS";
            case PREISGARANTIE: return "PREISGARANTIE";
            case PREISPOSITION: return "PREISPOSITION";
            case PREISSTAFFEL: return "PREISSTAFFEL";
            case RECHNUNGSPOSITION: return "RECHNUNGSPOSITION";
            case REGIONALEGUELTIGKEIT: return "REGIONALEGUELTIGKEIT";
            case REGIONALEPREISGARANTIE: return "REGIONALEPREISGARANTIE";
            case REGIONALEPREISSTAFFEL: return "REGIONALEPREISSTAFFEL";
            case REGIONALERAUFABSCHLAG: return "REGIONALERAUFABSCHLAG";
            case REGIONALETARIFPREISPOSITION: return "REGIONALETARIFPREISPOSITION";
            case REGIONSKRITERIUM: return "REGIONSKRITERIUM";
            case SIGMOIDPARAMETER: return "SIGMOIDPARAMETER";
            case STANDORTEIGENSCHAFTENGAS: return "STANDORTEIGENSCHAFTENGAS";
            case STANDORTEIGENSCHAFTENSTROM: return "STANDORTEIGENSCHAFTENSTROM";
            case STEUERBETRAG: return "STEUERBETRAG";
            case TAGESPARAMETER: return "TAGESPARAMETER";
            case TARIFBERECHNUNGSPARAMETER: return "TARIFBERECHNUNGSPARAMETER";
            case TARIFEINSCHRAENKUNG: return "TARIFEINSCHRAENKUNG";
            case TARIFPREIS: return "TARIFPREIS";
            case TARIFPREISPOSITION: return "TARIFPREISPOSITION";
            case TARIFPREISPOSITIONPROORT: return "TARIFPREISPOSITIONPROORT";
            case TARIFPREISSTAFFELPROORT: return "TARIFPREISSTAFFELPROORT";
            case UNTERSCHRIFT: return "UNTERSCHRIFT";
            case VERBRAUCH: return "VERBRAUCH";
            case VERTRAGSKONDITIONEN: return "VERTRAGSKONDITIONEN";
            case VERTRAGSTEIL: return "VERTRAGSTEIL";
            case VERWENDUNGSZWECKPROMARKTROLLE: return "VERWENDUNGSZWECKPROMARKTROLLE";
            case ZAEHLWERK: return "ZAEHLWERK";
            case ZAEHLZEITREGISTER: return "ZAEHLZEITREGISTER";
            case ZEITRAUM: return "ZEITRAUM";
            case ZEITREIHENWERT: return "ZEITREIHENWERT";
            case ZUSTAENDIGKEIT: return "ZUSTAENDIGKEIT";
        }
        return null;
    }

    public static ComTyp forValue(String value) throws IOException {
        if (value.equals("ADRESSE")) return ADRESSE;
        if (value.equals("ANGEBOTSPOSITION")) return ANGEBOTSPOSITION;
        if (value.equals("ANGEBOTSTEIL")) return ANGEBOTSTEIL;
        if (value.equals("ANGEBOTSVARIANTE")) return ANGEBOTSVARIANTE;
        if (value.equals("AUFABSCHLAG")) return AUFABSCHLAG;
        if (value.equals("AUFABSCHLAGPROORT")) return AUFABSCHLAGPROORT;
        if (value.equals("AUFABSCHLAGREGIONAL")) return AUFABSCHLAGREGIONAL;
        if (value.equals("AUFABSCHLAGSTAFFELPROORT")) return AUFABSCHLAGSTAFFELPROORT;
        if (value.equals("AUSSCHREIBUNGSDETAIL")) return AUSSCHREIBUNGSDETAIL;
        if (value.equals("AUSSCHREIBUNGSLOS")) return AUSSCHREIBUNGSLOS;
        if (value.equals("BETRAG")) return BETRAG;
        if (value.equals("DIENSTLEISTUNG")) return DIENSTLEISTUNG;
        if (value.equals("ENERGIEHERKUNFT")) return ENERGIEHERKUNFT;
        if (value.equals("ENERGIEMIX")) return ENERGIEMIX;
        if (value.equals("FREMDKOSTENBLOCK")) return FREMDKOSTENBLOCK;
        if (value.equals("FREMDKOSTENPOSITION")) return FREMDKOSTENPOSITION;
        if (value.equals("GEOKOORDINATEN")) return GEOKOORDINATEN;
        if (value.equals("KATASTERADRESSE")) return KATASTERADRESSE;
        if (value.equals("KONFIGURATIONSPRODUKT")) return KONFIGURATIONSPRODUKT;
        if (value.equals("KONTAKTWEG")) return KONTAKTWEG;
        if (value.equals("KONZESSIONSABGABE")) return KONZESSIONSABGABE;
        if (value.equals("KOSTENBLOCK")) return KOSTENBLOCK;
        if (value.equals("KOSTENPOSITION")) return KOSTENPOSITION;
        if (value.equals("KRITERIUMWERT")) return KRITERIUMWERT;
        if (value.equals("LASTPROFIL")) return LASTPROFIL;
        if (value.equals("MARKTGEBIETINFO")) return MARKTGEBIETINFO;
        if (value.equals("MENGE")) return MENGE;
        if (value.equals("POSITIONSAUFABSCHLAG")) return POSITIONSAUFABSCHLAG;
        if (value.equals("PREIS")) return PREIS;
        if (value.equals("PREISGARANTIE")) return PREISGARANTIE;
        if (value.equals("PREISPOSITION")) return PREISPOSITION;
        if (value.equals("PREISSTAFFEL")) return PREISSTAFFEL;
        if (value.equals("RECHNUNGSPOSITION")) return RECHNUNGSPOSITION;
        if (value.equals("REGIONALEGUELTIGKEIT")) return REGIONALEGUELTIGKEIT;
        if (value.equals("REGIONALEPREISGARANTIE")) return REGIONALEPREISGARANTIE;
        if (value.equals("REGIONALEPREISSTAFFEL")) return REGIONALEPREISSTAFFEL;
        if (value.equals("REGIONALERAUFABSCHLAG")) return REGIONALERAUFABSCHLAG;
        if (value.equals("REGIONALETARIFPREISPOSITION")) return REGIONALETARIFPREISPOSITION;
        if (value.equals("REGIONSKRITERIUM")) return REGIONSKRITERIUM;
        if (value.equals("SIGMOIDPARAMETER")) return SIGMOIDPARAMETER;
        if (value.equals("STANDORTEIGENSCHAFTENGAS")) return STANDORTEIGENSCHAFTENGAS;
        if (value.equals("STANDORTEIGENSCHAFTENSTROM")) return STANDORTEIGENSCHAFTENSTROM;
        if (value.equals("STEUERBETRAG")) return STEUERBETRAG;
        if (value.equals("TAGESPARAMETER")) return TAGESPARAMETER;
        if (value.equals("TARIFBERECHNUNGSPARAMETER")) return TARIFBERECHNUNGSPARAMETER;
        if (value.equals("TARIFEINSCHRAENKUNG")) return TARIFEINSCHRAENKUNG;
        if (value.equals("TARIFPREIS")) return TARIFPREIS;
        if (value.equals("TARIFPREISPOSITION")) return TARIFPREISPOSITION;
        if (value.equals("TARIFPREISPOSITIONPROORT")) return TARIFPREISPOSITIONPROORT;
        if (value.equals("TARIFPREISSTAFFELPROORT")) return TARIFPREISSTAFFELPROORT;
        if (value.equals("UNTERSCHRIFT")) return UNTERSCHRIFT;
        if (value.equals("VERBRAUCH")) return VERBRAUCH;
        if (value.equals("VERTRAGSKONDITIONEN")) return VERTRAGSKONDITIONEN;
        if (value.equals("VERTRAGSTEIL")) return VERTRAGSTEIL;
        if (value.equals("VERWENDUNGSZWECKPROMARKTROLLE")) return VERWENDUNGSZWECKPROMARKTROLLE;
        if (value.equals("ZAEHLWERK")) return ZAEHLWERK;
        if (value.equals("ZAEHLZEITREGISTER")) return ZAEHLZEITREGISTER;
        if (value.equals("ZEITRAUM")) return ZEITRAUM;
        if (value.equals("ZEITREIHENWERT")) return ZEITREIHENWERT;
        if (value.equals("ZUSTAENDIGKEIT")) return ZUSTAENDIGKEIT;
        throw new IOException("Cannot deserialize ComTyp");
    }
}
