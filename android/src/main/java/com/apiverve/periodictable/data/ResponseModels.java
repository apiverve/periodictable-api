// Converter.java

// To use this code, add the following Maven dependency to your project:
//
//
//     com.fasterxml.jackson.core     : jackson-databind          : 2.9.0
//     com.fasterxml.jackson.datatype : jackson-datatype-jsr310   : 2.9.0
//
// Import this package:
//
//     import com.apiverve.data.Converter;
//
// Then you can deserialize a JSON string with
//
//     PeriodicTableData data = Converter.fromJsonString(jsonString);

package com.apiverve.periodictable.data;

import java.io.IOException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class Converter {
    // Date-time helpers

    private static final DateTimeFormatter DATE_TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
            .appendOptional(DateTimeFormatter.ISO_INSTANT)
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssX"))
            .appendOptional(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetDateTime parseDateTimeString(String str) {
        return ZonedDateTime.from(Converter.DATE_TIME_FORMATTER.parse(str)).toOffsetDateTime();
    }

    private static final DateTimeFormatter TIME_FORMATTER = new DateTimeFormatterBuilder()
            .appendOptional(DateTimeFormatter.ISO_TIME)
            .appendOptional(DateTimeFormatter.ISO_OFFSET_TIME)
            .parseDefaulting(ChronoField.YEAR, 2020)
            .parseDefaulting(ChronoField.MONTH_OF_YEAR, 1)
            .parseDefaulting(ChronoField.DAY_OF_MONTH, 1)
            .toFormatter()
            .withZone(ZoneOffset.UTC);

    public static OffsetTime parseTimeString(String str) {
        return ZonedDateTime.from(Converter.TIME_FORMATTER.parse(str)).toOffsetDateTime().toOffsetTime();
    }
    // Serialize/deserialize helpers

    public static PeriodicTableData fromJsonString(String json) throws IOException {
        return getObjectReader().readValue(json);
    }

    public static String toJsonString(PeriodicTableData obj) throws JsonProcessingException {
        return getObjectWriter().writeValueAsString(obj);
    }

    private static ObjectReader reader;
    private static ObjectWriter writer;

    private static void instantiateMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        SimpleModule module = new SimpleModule();
        module.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
            @Override
            public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                String value = jsonParser.getText();
                return Converter.parseDateTimeString(value);
            }
        });
        mapper.registerModule(module);
        reader = mapper.readerFor(PeriodicTableData.class);
        writer = mapper.writerFor(PeriodicTableData.class);
    }

    private static ObjectReader getObjectReader() {
        if (reader == null) instantiateMapper();
        return reader;
    }

    private static ObjectWriter getObjectWriter() {
        if (writer == null) instantiateMapper();
        return writer;
    }
}

// PeriodicTableData.java

package com.apiverve.periodictable.data;

import com.fasterxml.jackson.annotation.*;

public class PeriodicTableData {
    private String name;
    private String appearance;
    private double atomicMass;
    private double boil;
    private String category;
    private double density;
    private String discoveredBy;
    private double melt;
    private double molarHeat;
    private String namedBy;
    private long number;
    private long period;
    private long group;
    private String phase;
    private String source;
    private String summary;
    private String symbol;
    private long xpos;
    private long ypos;
    private long wxpos;
    private long wypos;
    private long[] shells;
    private String electronConfiguration;
    private String electronConfigurationSemantic;
    private double electronAffinity;
    private double electronegativityPauling;
    private long[] ionizationEnergies;
    private String cpkHex;
    private String block;

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("appearance")
    public String getAppearance() { return appearance; }
    @JsonProperty("appearance")
    public void setAppearance(String value) { this.appearance = value; }

    @JsonProperty("atomic_mass")
    public double getAtomicMass() { return atomicMass; }
    @JsonProperty("atomic_mass")
    public void setAtomicMass(double value) { this.atomicMass = value; }

    @JsonProperty("boil")
    public double getBoil() { return boil; }
    @JsonProperty("boil")
    public void setBoil(double value) { this.boil = value; }

    @JsonProperty("category")
    public String getCategory() { return category; }
    @JsonProperty("category")
    public void setCategory(String value) { this.category = value; }

    @JsonProperty("density")
    public double getDensity() { return density; }
    @JsonProperty("density")
    public void setDensity(double value) { this.density = value; }

    @JsonProperty("discovered_by")
    public String getDiscoveredBy() { return discoveredBy; }
    @JsonProperty("discovered_by")
    public void setDiscoveredBy(String value) { this.discoveredBy = value; }

    @JsonProperty("melt")
    public double getMelt() { return melt; }
    @JsonProperty("melt")
    public void setMelt(double value) { this.melt = value; }

    @JsonProperty("molar_heat")
    public double getMolarHeat() { return molarHeat; }
    @JsonProperty("molar_heat")
    public void setMolarHeat(double value) { this.molarHeat = value; }

    @JsonProperty("named_by")
    public String getNamedBy() { return namedBy; }
    @JsonProperty("named_by")
    public void setNamedBy(String value) { this.namedBy = value; }

    @JsonProperty("number")
    public long getNumber() { return number; }
    @JsonProperty("number")
    public void setNumber(long value) { this.number = value; }

    @JsonProperty("period")
    public long getPeriod() { return period; }
    @JsonProperty("period")
    public void setPeriod(long value) { this.period = value; }

    @JsonProperty("group")
    public long getGroup() { return group; }
    @JsonProperty("group")
    public void setGroup(long value) { this.group = value; }

    @JsonProperty("phase")
    public String getPhase() { return phase; }
    @JsonProperty("phase")
    public void setPhase(String value) { this.phase = value; }

    @JsonProperty("source")
    public String getSource() { return source; }
    @JsonProperty("source")
    public void setSource(String value) { this.source = value; }

    @JsonProperty("summary")
    public String getSummary() { return summary; }
    @JsonProperty("summary")
    public void setSummary(String value) { this.summary = value; }

    @JsonProperty("symbol")
    public String getSymbol() { return symbol; }
    @JsonProperty("symbol")
    public void setSymbol(String value) { this.symbol = value; }

    @JsonProperty("xpos")
    public long getXpos() { return xpos; }
    @JsonProperty("xpos")
    public void setXpos(long value) { this.xpos = value; }

    @JsonProperty("ypos")
    public long getYpos() { return ypos; }
    @JsonProperty("ypos")
    public void setYpos(long value) { this.ypos = value; }

    @JsonProperty("wxpos")
    public long getWxpos() { return wxpos; }
    @JsonProperty("wxpos")
    public void setWxpos(long value) { this.wxpos = value; }

    @JsonProperty("wypos")
    public long getWypos() { return wypos; }
    @JsonProperty("wypos")
    public void setWypos(long value) { this.wypos = value; }

    @JsonProperty("shells")
    public long[] getShells() { return shells; }
    @JsonProperty("shells")
    public void setShells(long[] value) { this.shells = value; }

    @JsonProperty("electron_configuration")
    public String getElectronConfiguration() { return electronConfiguration; }
    @JsonProperty("electron_configuration")
    public void setElectronConfiguration(String value) { this.electronConfiguration = value; }

    @JsonProperty("electron_configuration_semantic")
    public String getElectronConfigurationSemantic() { return electronConfigurationSemantic; }
    @JsonProperty("electron_configuration_semantic")
    public void setElectronConfigurationSemantic(String value) { this.electronConfigurationSemantic = value; }

    @JsonProperty("electron_affinity")
    public double getElectronAffinity() { return electronAffinity; }
    @JsonProperty("electron_affinity")
    public void setElectronAffinity(double value) { this.electronAffinity = value; }

    @JsonProperty("electronegativity_pauling")
    public double getElectronegativityPauling() { return electronegativityPauling; }
    @JsonProperty("electronegativity_pauling")
    public void setElectronegativityPauling(double value) { this.electronegativityPauling = value; }

    @JsonProperty("ionization_energies")
    public long[] getIonizationEnergies() { return ionizationEnergies; }
    @JsonProperty("ionization_energies")
    public void setIonizationEnergies(long[] value) { this.ionizationEnergies = value; }

    @JsonProperty("cpk-hex")
    public String getCpkHex() { return cpkHex; }
    @JsonProperty("cpk-hex")
    public void setCpkHex(String value) { this.cpkHex = value; }

    @JsonProperty("block")
    public String getBlock() { return block; }
    @JsonProperty("block")
    public void setBlock(String value) { this.block = value; }
}